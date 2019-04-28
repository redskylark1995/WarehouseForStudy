package com.myStudy.security.AES;

import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class MyAES {
	private static String str = "imooc security aes";
	
	public static void main(String[]args) {
		jdkAES();
	}
	
	public static void jdkAES(){
		try {
			KeyGenerator keyGenertor = KeyGenerator.getInstance("AES");
			keyGenertor.init(128);
			SecretKey secretkey = keyGenertor.generateKey();
			byte[] bytesKey = secretkey.getEncoded();
			//key转换
			Key key = new SecretKeySpec(bytesKey, "AES");
			System.out.println(key.getAlgorithm());
			
			//加密
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] result =cipher.doFinal(str.getBytes());
			System.out.println("jdk aes encrypt:"+ Base64.encodeBase64String(result));
			
			//解密
			cipher.init(Cipher.DECRYPT_MODE, key);
			result = cipher.doFinal(result);
			System.out.println("jdk aes encrypt:"+ new String(result));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
}
