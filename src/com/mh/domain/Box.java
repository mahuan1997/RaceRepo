package com.mh.domain;

import java.util.Date;

/**
 * 
 * @ClassName: Box
 * @Description: ������
 * @author mahuan
 * @date 2020��12��31��
 *
 */
public class Box {
	/**
	 * ���
	 */
	private int serialNum;
	/**
	 * ʱ���
	 */
	private String timestamp;
	/**
	 * hashֵ
	 */
	private String hashValue;
	/**
	 * ��һ�������hashֵ
	 */
	private String lastHashValue;
	/**
	 * ��������
	 */
	private Integer secretNum;
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getHashValue() {
		return hashValue;
	}
	public void setHashValue(String hashValue) {
		this.hashValue = hashValue;
	}
	public String getLastHashValue() {
		return lastHashValue;
	}
	public void setLastHashValue(String lastHashValue) {
		this.lastHashValue = lastHashValue;
	}
	public Integer getSecretNum() {
		return secretNum;
	}
	public void setSecretNum(Integer secretNum) {
		this.secretNum = secretNum;
	}
	@Override
	public String toString() {
		return "Box [serialNum=" + serialNum + ", timestamp=" + timestamp + ", hashValue=" + hashValue
				+ ", lastHashValue=" + lastHashValue + ", secretNum=" + secretNum + "]";
	}
	
	
}
