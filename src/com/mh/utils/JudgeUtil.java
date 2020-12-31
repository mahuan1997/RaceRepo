package com.mh.utils;

import com.mh.constant.CommonConstant;

/**
 * 
 * @ClassName: JudgeUtil 
 * @Description: 判断结果类
 * @author mahuan
 * @date 2020年12月31日
 *
 */
public class JudgeUtil {
	
	/**
	 * 
	 * @Title: judgeResult
	 * @Description: 判断hashvalue前五位是否是0
	 * @param @param hashValue
	 * @param @return 参数
	 * @return boolean 返回类型
	 * @throws
	 */
	public static boolean judgeResult(String hashValue) {
		//截取前五位
		String result = hashValue.substring(0, 5);
		//前五位"00000" 说明找到神秘数字
		if(CommonConstant.SUCCESS_RESULT.equals(result)) {
			return true;
		}
		return false;
	}
	
	
}
