package com.myStudy.security.DES;


import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.bouncycastle.jce.provider.BouncyCastleProvider;


public class MyDES {
	private static String src = "redskylark";
	public static void main(String[] args) {
		jdkDES();
		BCDES();
	}
	
	public static void jdkDES() {
		try {
			//生成KEY
			KeyGenerator keyGenertor = KeyGenerator.getInstance("DES");
			keyGenertor.init(56);
			SecretKey secretkey = keyGenertor.generateKey();
			byte[] bytesKey = secretkey.getEncoded();
			
			//转化KEY
			DESKeySpec  desKeySpec = new DESKeySpec(bytesKey);
			SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
			SecretKey convertSecretkey = factory.generateSecret(desKeySpec);
			
			//加密
			Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, convertSecretkey);
			byte[] result=cipher.doFinal(src.getBytes());
			System.out.println("JDK des encrypt "+ Hex.encodeHexString(result));
			
			//解密
			cipher.init(Cipher.DECRYPT_MODE, convertSecretkey);
			 result=cipher.doFinal(result);
			System.out.println("JDK des decrypt "+ new String(result));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void BCDES() {
		
		
		try {
			Security.addProvider(new BouncyCastleProvider());
			
			//生成KEY
			KeyGenerator keyGenertor = KeyGenerator.getInstance("DES","BC");
			keyGenertor.getProvider();
			keyGenertor.init(56);
			SecretKey secretkey = keyGenertor.generateKey();
			byte[] bytesKey = secretkey.getEncoded();
			
			//转化KEY
			DESKeySpec  desKeySpec = new DESKeySpec(bytesKey);
			SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
			SecretKey convertSecretkey = factory.generateSecret(desKeySpec);
			
			//加密
			Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, convertSecretkey);
			byte[] result=cipher.doFinal(src.getBytes());
			System.out.println("JDK des encrypt "+ Hex.encodeHexString(result));
			
			//解密
			cipher.init(Cipher.DECRYPT_MODE, convertSecretkey);
			 result=cipher.doFinal(result);
			System.out.println("JDK des decrypt "+ new String(result));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
