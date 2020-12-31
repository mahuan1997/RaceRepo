package com.mh.start;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import com.mh.constant.CommonConstant;
import com.mh.domain.Box;
import com.mh.utils.FindUtil;

public class Start {
	
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		//������һ�������hashֵ����һ���������һ��hashֵΪ0
		String lastHashValue = "0";
		for(int i=0;i<CommonConstant.BOX_NUM;i++) {
			Box box = new Box();
			//���ñ�����
			box.setSerialNum(i+1);
			//���Դ򿪱���,��¼��ǰʱ���
			box.setTimestamp(new Date().toString());
			//��ȡ��һ�������hashֵ
			//����ǵ�һ������,���ݹ�����һ�������hashֵΪ0
			if(i==0) {
				box.setLastHashValue(lastHashValue);
			}
			box.setLastHashValue(lastHashValue);
			//hashֵ���㷽����������+ʱ���+��һ������hashֵ+��������
			String str = box.getSerialNum()+box.getTimestamp()+box.getLastHashValue();
			String secretNum = FindUtil.findSecretNum(str);
			box.setSecretNum(Integer.parseInt(secretNum));
			System.out.println("��"+(i+1)+"��������������Ϊ��"+secretNum);
			//����ǰhashֵ��ֵ��lastHashValue �´�ѭ��ʹ��
			lastHashValue = box.getHashValue();
		}
	}
}
