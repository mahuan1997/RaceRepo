package com.mh.utils;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * 
 * @ClassName: FindUtil
 * @Description: �����������ֹ�����
 * @author mahuan
 * @date 2020��12��31��
 *
 */
public class FindUtil {
	/**
	 * @throws UnsupportedEncodingException 
	 * @throws NoSuchAlgorithmException 
	 * @Title: findSecretNum
	 * @Description: �����ܿ��������������
	 * @param @param strNoSecretNum ������sha256֮ǰ���ַ�����ȱ���������֣�
	 * @return void �������� ��������
	 * @throws
	 */
	public static String findSecretNum(String strNoSecretNum) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		//������������
		String secretNum="";
		//��̽����
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
