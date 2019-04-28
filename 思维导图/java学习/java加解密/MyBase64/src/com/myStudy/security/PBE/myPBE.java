package com.myStudy.security.PBE;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

import org.apache.commons.codec.binary.Base64;

public class myPBE {
	private static String src = "imooc security pbe";
	
	public static void main(String[] args) {
		 jdkPBE();
	}

	public static void jdkPBE() {
		try {
			// 初始化盐
			SecureRandom random = new SecureRandom();
			byte[] salt = random.generateSeed(8);

			// 口令与密钥
			String password = "imooc";
			PBEKeySpec pbeKeyspec = new PBEKeySpec(password.toCharArray());

			SecretKeyFactory factory = SecretKeyFactory.getInstance("PBEWITHMD5andDES");
			Key key = factory.generateSecret(pbeKeyspec);
			
			//加密
			PBEParameterSpec pbeParmeterSpec = new PBEParameterSpec(salt, 100);
			Cipher cipher = Cipher.getInstance("PBEWITHMD5andDES");
			cipher.init(Cipher.ENCRYPT_MODE, key,pbeParmeterSpec);
			byte[] result = cipher.doFinal(src.getBytes());
			System.out.println("jdk pbe encrypt:" + Base64.encodeBase64String(result));
			
			//解密
			cipher.init(Cipher.DECRYPT_MODE, key, pbeParmeterSpec);
			result = cipher.doFinal(result);
			System.out.println("jdk pbe decrypt:" + new String(result));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
