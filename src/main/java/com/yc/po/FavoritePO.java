package com.yc.po;

import java.io.Serializable;
/**
 * 网站信息类
 * @author qqq
 *
 */
public class FavoritePO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2081869619565226470L;
	private Integer fId;// 编号
	private String fLable;// 网站名
	private String fUrl;// 地址
	private String fTags;// 标签名  多个
	private String fDesc;// 描述
	public Integer getfId() {
		return fId;
	}
	public void setfId(Integer fId) {
		this.fId = fId;
	}
	public String getfLable() {
		return fLable;
	}
	public void setfLable(String fLable) {
		this.fLable = fLable;
	}
	public String getfUrl() {
		return fUrl;
	}
	public void setfUrl(String fUrl) {
		this.fUrl = fUrl;
	}
	public String getfTags() {
		return fTags;
	}
	public void setfTags(String fTags) {
		this.fTags = fTags;
	}
	public String getfDesc() {
		return fDesc;
	}
	public void setfDesc(String fDesc) {
		this.fDesc = fDesc;
	}
	@Override
	public String toString() {
		return "FavoritePO [fId=" + fId + ", fLable=" + fLable + ", fUrl=" + fUrl + ", fTags=" + fTags + ", fDesc="
				+ fDesc + "]";
	}
	
}
