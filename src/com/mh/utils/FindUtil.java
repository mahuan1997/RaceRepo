package com.mh.utils;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * 
 * @ClassName: FindUtil
 * @Description: 查找神秘数字工具类
 * @author mahuan
 * @date 2020年12月31日
 *
 */
public class FindUtil {
	/**
	 * @throws UnsupportedEncodingException 
	 * @throws NoSuchAlgorithmException 
	 * @Title: findSecretNum
	 * @Description: 查找能开宝箱的神秘数字
	 * @param @param strNoSecretNum 参数（sha256之前的字符串，缺少神秘数字）
	 * @return void 返回类型 神秘数字
	 * @throws
	 */
	public static String findSecretNum(String strNoSecretNum) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		//定义神秘数字
		String secretNum="";
		//试探数字
		Integer tempNum = 1;
		while(true) {
			String hashValue = Sha256Util.sha256Hex((strNoSecretNum+tempNum).getBytes());
			boolean result = JudgeUtil.judgeResult(hashValue);
			if(result) {
				secretNum = tempNum+"";
				break;
			}else {
				tempNum++;
			}
		}
		return secretNum;
	}
}
