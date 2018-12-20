package com.tingcream.rsaTool.model;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;

import org.bouncycastle.jce.provider.BouncyCastleProvider; 
 

public class RSA {
  
	
	private static String RSA_JAVA = "RSA/None/PKCS1Padding";
	public static final String  SIGN_ALGORITHMS = "SHA1WithRSA";
	
 
	
	/**
	 * 通过rsa私钥字符串    创建RSA私钥对象 111
	 */
	public static RSAPrivateKey getPrivateKeyFromStr(String privatekeyStr) {
		try {
			    byte[] buffer = Base64.decode(privatekeyStr);
			    PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(buffer);
			    KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			    RSAPrivateKey privatekey = (RSAPrivateKey)keyFactory.generatePrivate(keySpec);
			    return privatekey;
		} catch (Exception e) {
			 e.printStackTrace();
		   throw new RuntimeException("RSA私钥文件已损坏");
		}
	  
	 }
	
	/**
	 * 通过rsa公钥字符串    创建RSA公钥对象
	 */
	  public static  RSAPublicKey getPublickeyFromStr(String publickeyStr)  {
		  try {
			  byte[] buffer = Base64.decode(publickeyStr);
			    X509EncodedKeySpec keySpec = new X509EncodedKeySpec(buffer);
			    KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			    RSAPublicKey publickey = (RSAPublicKey)keyFactory.generatePublic(keySpec);
			    return publickey;
		} catch (Exception e) {
             e.printStackTrace();
			throw new RuntimeException("RSA公钥文件已损坏");
		}
	   
	  }
	 
	  /**
	   * rsa 加密方法
	   *  入参 rsa公钥 、待加密内容
	   */
	  public static String encrypt(RSAPublicKey publicKey, String content)   {
		    if(content==null){
		    	return "";
		    }
		    if (publicKey == null) {
		       throw new RuntimeException("publickey 值不能为空");
		    }
		    Cipher cipher = null;
		    try {
		      cipher = Cipher.getInstance(RSA_JAVA, new BouncyCastleProvider());
		      cipher.init(1, publicKey);
		      byte[] binaryData = cipher.doFinal(content.getBytes("utf-8"));
		      String str = Base64.encode(binaryData);
		      return str;
		    } catch (Exception e) {
		    	 throw new RuntimeException(e);
		    }
		  }
	  
	 
	  
	  /**
       * rsa 解密方法
       * rsa私钥、密文字符串  (密文编码默认utf8)
       */
	  public static  String decrypt(RSAPrivateKey privateKey, String cipherContent)  {
		  if(cipherContent==null){
			  return "";
		  }
	    byte[] data = Base64.decode(cipherContent);

	    if (privateKey == null) {
	      throw new RuntimeException("privateKey 不能为空");
	    }
	    Cipher cipher = null;
	    try {
	      cipher = Cipher.getInstance(RSA_JAVA, new BouncyCastleProvider());
	      cipher.init(2, privateKey);
	      byte[] output = cipher.doFinal(data);
	      String str = Base64.encode(output);
	      String text = new String(Base64.decode(str), "utf-8");
	      return text;
	    } catch (NoSuchAlgorithmException e) {
	       throw new RuntimeException("无此解密算法"); 
	       } 
	    catch (Exception e) {
	    	 throw new RuntimeException("密文数据已损坏");
	    }
	  }
	 
		
		/**
		* RSA验签名检查
		* @param content 待签名数据
		* @param sign 签名值
		* @param pubKey rsa公钥
		* @return 布尔值
		*/
		public static boolean verify(String content, String sign, PublicKey pubKey)
		{
			try 
			{ 
				java.security.Signature signature = java.security.Signature.getInstance(SIGN_ALGORITHMS);
				signature.initVerify(pubKey);
				signature.update( content.getBytes("utf-8") );
				boolean bverify = signature.verify( Base64.decode(sign) ); 
				return bverify;
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			return false;
		}
	 
	   /**
		* RSA签名
		* @param content 待签名数据
		* @param privateKey 商户私钥
		* @param input_charset 编码格式
		* @return 签名值
		*/
		public static String sign(String content,   PrivateKey priKey )
		{
	        try 
	        {
	            java.security.Signature signature = java.security.Signature.getInstance(SIGN_ALGORITHMS);

	            signature.initSign(priKey);
	            signature.update( content.getBytes("utf-8") );

	            byte[] signed = signature.sign();
	            
	            return Base64.encode(signed);
	        }
	        catch (Exception e) 
	        {
	        	e.printStackTrace();
	        }
	        
	        return "";
	    }
		  
		  
}


