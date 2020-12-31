package com.mh.start;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import com.mh.constant.CommonConstant;
import com.mh.domain.Box;
import com.mh.utils.FindUtil;

public class Start {
	
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		//定义上一个宝箱的hash值，第一个宝箱的上一个hash值为0
		String lastHashValue = "0";
		for(int i=0;i<CommonConstant.BOX_NUM;i++) {
			Box box = new Box();
			//设置宝箱编号
			box.setSerialNum(i+1);
			//尝试打开宝箱,记录当前时间戳
			box.setTimestamp(new Date().toString());
			//获取上一个宝箱的hash值
			//如果是第一个宝箱,根据规则上一个宝箱的hash值为0
			if(i==0) {
				box.setLastHashValue(lastHashValue);
			}
			box.setLastHashValue(lastHashValue);
			//hash值计算方法：宝箱编号+时间戳+上一个宝箱hash值+神秘数字
			String str = box.getSerialNum()+box.getTimestamp()+box.getLastHashValue();
			String secretNum = FindUtil.findSecretNum(str);
			box.setSecretNum(Integer.parseInt(secretNum));
			System.out.println("第"+(i+1)+"个宝箱神秘数字为："+secretNum);
			//将当前hash值赋值给lastHashValue 下次循环使用
			lastHashValue = box.getHashValue();
		}
	}
}
