package com.yc.biz;

import java.util.List;

import com.yc.po.TagPO;

public interface ITagBiz {

	public List<TagPO> findByCondition(TagPO tagPO) throws Exception;
	
	public boolean addTags(List<TagPO> tags) throws Exception;
	
	public boolean updateTag(TagPO tagPO) throws Exception;
	
	public boolean deleteTag(TagPO tagPO) throws Exception;
	
	public List<TagPO> findByTagName(List<String> tags) throws Exception;
}
