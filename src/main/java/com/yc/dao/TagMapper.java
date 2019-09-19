package com.yc.dao;

import java.util.List;

import com.yc.po.TagPO;

public interface TagMapper {

	/**
	 * 批量添加
	 * @param tags
	 * @return
	 */
	public boolean addTag(List<TagPO> tags);
	
	/**
	 * 查看标签信息
	 * @param tagPO
	 * @return
	 */
	public List<TagPO> findByCondition(TagPO tagPO);
	
	/**
	 * 修改
	 * @param tagPO
	 * @return
	 */
	public boolean updateTag(TagPO tagPO);
	
	/**
	 * 删除
	 * @param tagPO
	 * @return
	 */
	public boolean deleteTag(TagPO tagPO);
	
	/**
	 * 根据标签名称去查看标签
	 * @param tags
	 * @return
	 */
	public List<TagPO> findByTagName(List<String> tags);
	
	/**
	 * 批量修改收藏的网站数量  t_count=t_count+1
	 * @param ids  标签的id集合
	 * @return
	 */
	public boolean updateTagCountByIds(List<Integer> ids);
	
}
