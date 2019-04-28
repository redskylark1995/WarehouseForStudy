package com.myStudy.security.base64;

import java.io.IOException;

import org.apache.commons.codec.binary.Base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class MyBase64 {
	private static String src="imooc security base64";
	
	public static void main(String[] args) {
		jdkBase64();
		cCBsdr64();
		bBBase64();
	}
	 public static void jdkBase64() {
		 BASE64Encoder encoder = new BASE64Encoder();
		String encode= encoder.encode(src.getBytes());
		System.out.println("encode="+encode);
		
		BASE64Decoder decoder =new BASE64Decoder();
		try {
			System.out.println("decode="+new String(decoder.decodeBuffer(encode)));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	 }
	 
	 public static void cCBsdr64() {
		 byte[] encodeBytes=Base64.encodeBase64(src.getBytes());
		 System.out.println("encode=" +new String(encodeBytes));
		 byte[] decodeBytes= Base64.decodeBase64(encodeBytes);
		 System.out.println("decode="+new String(decodeBytes));
	 }
	 public static void bBBase64() {
		 byte[] bCEncoderBytes=org.bouncycastle.util.encoders.Base64.encode(src.getBytes());
		 System.out.println("encode="+ new String(bCEncoderBytes));
		 byte[] bCDecoderBytes = org.bouncycastle.util.encoders.Base64.decode(bCEncoderBytes);
		 System.out.println("decode="+new String(bCDecoderBytes));
	 }
}
