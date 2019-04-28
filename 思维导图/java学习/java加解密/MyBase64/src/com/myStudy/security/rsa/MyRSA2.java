package com.myStudy.security.rsa;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import org.apache.commons.codec.binary.Hex;

public class MyRSA2 {
	
	public static String src = "jian pan jing tian  mei shuo ni bu zhai";
	
	public static void main(String[] args) {
		 jdkRSA();
	}
	
	public static void jdkRSA() {
		try {
			//1.初始密钥
			KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
			keyPairGenerator.initialize(512);
			KeyPair keyPair = keyPairGenerator.generateKeyPair();
			RSAPublicKey rsaPublicKey = (RSAPublicKey)keyPair.getPublic();
			RSAPrivateKey rsaPrivateKey = (RSAPrivateKey)keyPair.getPrivate();
			
			//2.执行签名
			PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(rsaPrivateKey.getEncoded());
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			PrivateKey privateKey=keyFactory.generatePrivate(pkcs8EncodedKeySpec);
			Signature signature = Signature.getInstance("MD5withRSA");
			signature.initSign(privateKey);
			signature.update(src.getBytes());
			byte[] result = signature.sign();
			System.out.println("jdk rsa sing = " + Hex.encodeHexString(result));
			
			//3. 验证签名
			X509EncodedKeySpec x509AttrCertParser = new X509EncodedKeySpec(rsaPublicKey.getEncoded());
			keyFactory = keyFactory.getInstance("RSA");
			PublicKey publicKey = keyFactory.generatePublic(x509AttrCertParser);
			signature = Signature.getInstance("MD5withRSA");
			signature.initVerify(publicKey);
			signature.update(src.getBytes());
			boolean bool = signature.verify(result);
			System.out.println("jdk Rsa Verify = "+bool);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
