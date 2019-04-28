package com.myStudy.security.feiduicheng.DH;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Objects;

import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;

import org.apache.commons.codec.binary.Base64;

public class MyDH {
	private static String src ="yao feng le";
	public static void main(String[] args) {
		jdkDH();
	}
	
	public static void jdkDH() {
		
		try {
			//初始化密钥
			KeyPairGenerator senderKeypairGenerator = KeyPairGenerator.getInstance("DH");
			senderKeypairGenerator.initialize(512);
			KeyPair senderKeyPair = senderKeypairGenerator.genKeyPair();
			byte[] senderPublicKeyEnc= senderKeyPair.getPublic().getEncoded();//发送方公钥，发送给接收方
			
			//初始化接收方密钥
			KeyFactory keyFactory = KeyFactory.getInstance("DH");
			X509EncodedKeySpec x509EbcidedKeySpec = new X509EncodedKeySpec(senderPublicKeyEnc);
			PublicKey receiverPublcKey = keyFactory.generatePublic(x509EbcidedKeySpec);
			DHParameterSpec dhParameterSpec = ((DHPublicKey)receiverPublcKey).getParams();
			KeyPairGenerator receiverKeyPairGenerator = KeyPairGenerator.getInstance("DH");
			receiverKeyPairGenerator.initialize(dhParameterSpec);
			KeyPair receiverKeypair = receiverKeyPairGenerator.generateKeyPair();
			PrivateKey receiverPrivateKey =receiverKeypair.getPrivate();
			byte[]receiverPublicKeyEnc = receiverKeypair.getPublic().getEncoded();
			
			//密钥构建
			KeyAgreement receiverkeyAgreement = KeyAgreement.getInstance("DH");
			receiverkeyAgreement.init(receiverPrivateKey);
			receiverkeyAgreement.doPhase(receiverPublcKey, true);
			SecretKey receiverDesKey=receiverkeyAgreement.generateSecret("DES");
			
			KeyFactory senderKeyFactory = KeyFactory.getInstance("DH");
			x509EbcidedKeySpec = new X509EncodedKeySpec(receiverPublicKeyEnc);
			PublicKey senderPublicKey = senderKeyFactory.generatePublic(x509EbcidedKeySpec);
			KeyAgreement senderKeyAgreement = KeyAgreement.getInstance("DH");
			senderKeyAgreement.init(senderKeyPair.getPrivate());
			senderKeyAgreement.doPhase(senderPublicKey, true);
			
			SecretKey senderDesKey = senderKeyAgreement.generateSecret("DES");
			
			if(Objects.equals(receiverDesKey, senderDesKey)) {
				System.out.println("双方密钥相同");
			}
			
			//4.加密
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, senderDesKey);
			byte[]result = cipher.doFinal(src.getBytes());
			System.out.println("jdk dh eccrypt: "+Base64.encodeBase64String(result));
			
			//5.解密
			 cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.DECRYPT_MODE, receiverDesKey);
			result = cipher.doFinal(result);
			System.out.println("jdk dh eccrypt: "+new String(result));
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
