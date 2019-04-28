package com.myStudy.security;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;


public class GuoTongLinkController {


	// 日志

	private static String HMAC_SHA1_ALGORITHM = "HmacSHA1";
	// 商户ID
	private static String GUOTONG_MER_ID = "ZH00030";
	// 测试密钥
	private static String GUOTONG_SECRET_KEY = "gBL7EWw69xxILSM67NHwtjblxIFRCSfnLAK6O123";

	public static void main(String[] args) {
		creatingLandingParameters();
	}

	/**
	 * SCAPP-6010  国通加油签名生成
	 * 
	 * @param token
	 * @param areaid
	 * @return
	 */
	public static  void creatingLandingParameters() {
		
			
			String ssoId = "test123";;
			String mobile = "15685129594" ;
			String areaid = "0";
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date now = new Date();
			String time = format.format(now);
			String expiry = format.format(new Date(now.getTime()+8*60*60*1000));
			
			String nonce_token = "gdag" + System.currentTimeMillis();
			StringBuffer signStr = new StringBuffer();
			signStr.append("areaid=").append(areaid).append("&expiry=").append(time).append("&merid=")
					.append(GUOTONG_MER_ID).append("&mobile=").append(mobile).append("&nonce_token=")
					.append(nonce_token).append("&osuid=").append(ssoId).append("&time=").append(time);
			String sign = generateSign(signStr.toString());

			Map<String, String> map = new HashMap<>();
			map.put("areaid", areaid);
			map.put("expiry", time);
			map.put("merid", GUOTONG_MER_ID);
			map.put("mobile", mobile);
			map.put("nonce_token", nonce_token);
			map.put("osuid", ssoId);
			map.put("time", time);
			map.put("sign", sign);

			System.out.println(map.toString());
			System.out.println("nonce_token="+nonce_token);
			System.out.println("sign="+sign);
			System.out.println("time="+time);
			System.out.println("expiry="+time);
		
	}

	/**
	 * 生成签名=MD5(k1=v1&k2=v2&k3=v3 + secret_key) @return?
	 */
	private static String generateSign(String str) {


		String sign = HMAC_SHA1(str, GUOTONG_SECRET_KEY);

		return sign;
	}

	public static String HMAC_SHA1(String encryptText, String encryptKey) {
		try {
			byte[] text = encryptText.getBytes();
			byte[] keyData = encryptKey.getBytes();
			SecretKeySpec secretKey = new SecretKeySpec(keyData, HMAC_SHA1_ALGORITHM);
			Mac mac = Mac.getInstance(secretKey.getAlgorithm());
			mac.init(secretKey);
			return byte2hex(mac.doFinal(text));
		} catch (InvalidKeyException e) {

			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();
		}
		return null;

	}

	// 将签名转换成字符串
	public static String byte2hex(byte[] b) {
		StringBuilder hs = new StringBuilder();
		String stmp;
		for (int n = 0; b != null && n < b.length; n++) {
			stmp = Integer.toHexString(b[n] & 0XFF);
			if (stmp.length() == 1)
				hs.append('0');
			hs.append(stmp);
		}
		return hs.toString();
	}

}
