package com.yc.po;

import java.io.Serializable;

/**
 * 类别类
 * @author qqq
 *
 */
public class TagPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7474439173167037898L;
	private Integer tId;// 编号
	private String tName;// 名称
	private Integer tCount;// 网站个数
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public Integer gettCount() {
		return tCount;
	}
	public void settCount(Integer tCount) {
		this.tCount = tCount;
	}
	
	public TagPO() {
		super();
	}
	
	public TagPO(Integer tId, String tName, Integer tCount) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.tCount = tCount;
	}
	@Override
	public String toString() {
		return "TagPO [tId=" + tId + ", tName=" + tName + ", tCount=" + tCount + "]";
	}
	
}
