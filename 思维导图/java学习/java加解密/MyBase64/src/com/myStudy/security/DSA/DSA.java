package com.myStudy.security.DSA;

import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import org.apache.commons.codec.binary.Hex;

public class DSA {
	
	public static String src = "jian pan jing tian  mei shuo ni bu zhai";
	
	public static void main(String[] args) {
		System.out.println("afds");
		jdkDSA();
	}
	public static void jdkDSA() {
		
		try {
			//1.初始密钥
			KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
			
			keyPairGenerator.initialize(512);
			KeyPair keyPair = keyPairGenerator.generateKeyPair();
			DSAPublicKey dsaPublicKey = (DSAPublicKey)keyPair.getPublic();
			DSAPrivateKey dsaPrivateKey = (DSAPrivateKey)keyPair.getPrivate();
		
			//2.执行签名
			PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(dsaPrivateKey.getEncoded());
			KeyFactory keyFactory = KeyFactory.getInstance("DSA");
			PrivateKey privateKey=keyFactory.generatePrivate(pkcs8EncodedKeySpec);
			Signature signature = Signature.getInstance("SHA1withDSA");
			signature.initSign(privateKey);
			signature.update(src.getBytes());
			byte[] result = signature.sign();
			System.out.println("jdk dsa sing = " + Hex.encodeHexString(result));
			
			//3. 验证签名
			X509EncodedKeySpec x509AttrCertParser = new X509EncodedKeySpec(dsaPublicKey.getEncoded());
			keyFactory = KeyFactory.getInstance("DSA");
			PublicKey publicKey = keyFactory.generatePublic(x509AttrCertParser);
			signature = Signature.getInstance("SHA1withDSA");
			signature.initVerify(publicKey);
			signature.update(src.getBytes());
			boolean bool = signature.verify(result);
			System.out.println("jdk dsa Verify = "+bool);
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (InvalidKeySpecException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (InvalidKeyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (SignatureException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
