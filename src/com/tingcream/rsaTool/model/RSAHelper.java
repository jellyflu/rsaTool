package com.tingcream.rsaTool.model;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
/**
 * RSA 辅助类
 * @author jelly
 *
 */
public class RSAHelper {
	 
	/**
	 * rsa 加密     (公钥加密)
	 * @param content  明文内容
	 * @param rsaPublickeyStr  公钥字符串
	 * @return  加密结果 
	 */
	public   String rsaEncrypt(String content ,String rsaPublickeyStr) {
	    RSAPublicKey rsaPublicKey=	RSA.getPublickeyFromStr(rsaPublickeyStr);
	   return  RSA.encrypt(rsaPublicKey, content);
		 
	}
	/**
	 * rsa 解密  （私钥解密）
	 * @param cipherContent 密文内容
	 * @param rsaPrivatekeyStr 私钥字符串
	 * @return 解密结果
	 */
	public   String rsaDecrypt(String cipherContent ,String rsaPrivatekeyStr) {
		RSAPrivateKey  rsaPrivateKey = RSA.getPrivateKeyFromStr(rsaPrivatekeyStr);
		return RSA.decrypt(rsaPrivateKey, cipherContent);
	}
	
	/**
	 * rsa 签名  （私钥签名）
	 * @param content  明文内容
	 * @param rsaPrivatekeyStr 私钥字符串
	 * @return 签名结果
	 */
	public  String rsaSign (String content ,String rsaPrivatekeyStr ) {
		
		 RSAPrivateKey  rsaPrivateKey = RSA.getPrivateKeyFromStr(rsaPrivatekeyStr);
		 return RSA.sign(content, rsaPrivateKey);
		
	}
	
	/**
	 * rsa 验证签名 （公钥验签）
	 * @param content
	 * @param sign
	 * @param rsaPublicKeyStr
	 * @return
	 */
	public boolean  rsaSignVerify(String content ,String sign,String rsaPublicKeyStr ) {
		RSAPublicKey rsaPublicKey=	RSA.getPublickeyFromStr(rsaPublicKeyStr);
		
		return RSA.verify(content, sign, rsaPublicKey);
	}
	
 

}
