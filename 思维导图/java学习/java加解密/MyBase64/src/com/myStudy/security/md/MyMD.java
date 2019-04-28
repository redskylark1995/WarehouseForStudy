package com.myStudy.security.md;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD4Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class MyMD {
	
	private static String src = "imooc security md";
	
	public static void main(String[] args) {
		jdkMD5();
		jdkMD2();
		bCMD4();
		jdkAddBCMD4();
		bCMD5() ;
		 cCMD5();
		 cCMD2();
	}
	
	public static void jdkMD5() {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] md5Bytes=md.digest(src.getBytes());
			System.out.println("jdkMD5="+Hex.encodeHexString(md5Bytes));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void jdkMD2() {
		try {
			MessageDigest md = MessageDigest.getInstance("MD2");
			byte[] md2Bytes=md.digest(src.getBytes());
			System.out.println("jdkMD2="+Hex.encodeHexString(md2Bytes));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void bCMD4() {

		try {
		Security.addProvider(new BouncyCastleProvider());
		MessageDigest md =MessageDigest.getInstance("MD4");
		byte[] md4Bytes =md.digest(src.getBytes());
		System.out.println("BC MD4="+org.bouncycastle.util.encoders.Hex.toHexString(md4Bytes));
		
		}catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
	public static void jdkAddBCMD4() {
		Digest digest = new MD4Digest();
		digest.update(src.getBytes(),0,src.getBytes().length);
		byte[] md4Bytes = new byte[digest.getDigestSize()];
		digest.doFinal(md4Bytes,0);		
		System.out.println("BC MD4="+org.bouncycastle.util.encoders.Hex.toHexString(md4Bytes));
	}
	public static void bCMD5() {
		Digest digest = new MD5Digest();
		digest.update(src.getBytes(),0,src.getBytes().length);
		byte[] md5Bytes = new byte[digest.getDigestSize()];
		
		digest.doFinal(md5Bytes,0);
		System.out.println("BC MD5="+org.bouncycastle.util.encoders.Hex.toHexString(md5Bytes));
	}
	
	public static void cCMD5() {
		System.out.println("CC MD5"+ DigestUtils.md5Hex(src.getBytes()));
	}
	
	public static void cCMD2() {
		System.out.println("CC MD2"+ DigestUtils.md2Hex(src.getBytes()));
	}
}
