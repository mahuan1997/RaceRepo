package com.mh.utils;

import com.mh.constant.CommonConstant;

/**
 * 
 * @ClassName: JudgeUtil 
 * @Description: �жϽ����
 * @author mahuan
 * @date 2020��12��31��
 *
 */
public class JudgeUtil {
	
	/**
	 * 
	 * @Title: judgeResult
	 * @Description: �ж�hashvalueǰ��λ�Ƿ���0
	 * @param @param hashValue
	 * @param @return ����
	 * @return boolean ��������
	 * @throws
	 */
	public static boolean judgeResult(String hashValue) {
		//��ȡǰ��λ
		String result = hashValue.substring(0, 5);
		//ǰ��λ"00000" ˵���ҵ���������
		if(CommonConstant.SUCCESS_RESULT.equals(result)) {
			return true;
		}
		return false;
	}
	
	
}
