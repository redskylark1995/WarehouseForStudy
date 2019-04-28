package com.myStudy.security.HMAC;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;

import com.sun.org.apache.xml.internal.security.Init;

public class Hmac {
	static String src = "imooc security hmac";
	public static void main(String[] args) {
		jdkHmacMd5();
		bcHmacMd5();
	}

	public static  void jdkHmacMd5() {
		try {
			KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacMD5");// 初始化KeyGenerator
			SecretKey secretkey = keyGenerator.generateKey();// 产生密钥

//			byte[] key = secretkey.getEncoded();// 获得密钥
			byte[] key = Hex.decodeHex(new char[] {'a','a','a','a','a','a','a','a','a','a'}) ;
			
			SecretKey restoreSecretkey = new SecretKeySpec(key, "HmacMD5");// 还原密钥

			Mac mac = Mac.getInstance(restoreSecretkey.getAlgorithm());// 实例化Mac

			mac.init(restoreSecretkey);//初始化Mac
			
			byte[] hmacMd5Bytes =mac.doFinal(src.getBytes());//执行摘要
			System.out.println("jdk hmacMD5= "+Hex.encodeHexString(hmacMd5Bytes));

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DecoderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void bcHmacMd5() {
		HMac hmac = new HMac(new MD5Digest());
		hmac.init(new KeyParameter(org.bouncycastle.util.encoders.Hex.decode("aaaaaaaaaa")));
		hmac.update(src.getBytes(),0,src.getBytes().length);
		
		byte[] hmacMD5bytes = new byte[hmac.getMacSize()];//执行摘要
		hmac.doFinal(hmacMD5bytes, 0);
		
		System.out.println("bc hmacMD5 =" +Hex.encodeHexString(hmacMD5bytes));
	}
}
