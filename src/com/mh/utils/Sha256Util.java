package com.mh.utils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 
 * @ClassName: Sha256Util
 * @Description: Sha256Util工具类
 * @author mahuan
 * @date 2020年12月31日
 *
 */
public class Sha256Util {
	
	/**
	 * 
	 * @Title: sha256Hex
	 * @Description: sha256获取hashValue
	 * @param @param 需要sha256的字节数组
	 * @param @return hashValue
	 * @return String hashValue
	 * @throws
	 */
	public static String sha256Hex(byte[] bytes) {
        String hashValue = "";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes);
            hashValue = byte2Hex(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashValue;
    }

	/**
	 * 
	 * @Title: byte2Hex
	 * @Description: 将字节数组转为字符串
	 * @param @param bytes
	 * @param @return 参数
	 * @return String 返回类型
	 * @throws
	 */
    private static String byte2Hex(byte[] bytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            String temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }
}

