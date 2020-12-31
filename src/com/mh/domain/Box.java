package com.mh.domain;

import java.util.Date;

/**
 * 
 * @ClassName: Box
 * @Description: 宝箱类
 * @author mahuan
 * @date 2020年12月31日
 *
 */
public class Box {
	/**
	 * 编号
	 */
	private int serialNum;
	/**
	 * 时间戳
	 */
	private String timestamp;
	/**
	 * hash值
	 */
	private String hashValue;
	/**
	 * 上一个宝箱的hash值
	 */
	private String lastHashValue;
	/**
	 * 神秘数字
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
