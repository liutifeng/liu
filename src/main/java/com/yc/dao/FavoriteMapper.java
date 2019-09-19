package com.yc.dao;

import java.util.List;

import com.yc.po.FavoritePO;

/**
 * 映射接口
 * @author qqq
 *
 */
public interface FavoriteMapper {

	/**
	 * 根据编号查看
	 * @param fid
	 * @return
	 */
	public FavoritePO findById(Integer fid);
	
	/**
	 * 根据条件查看
	 * @param favoritePO
	 * @return
	 */
	public List<FavoritePO> findByCondition(FavoritePO favoritePO);

	/**
	 * 添加收藏
	 * @param favoritePO
	 * @return
	 */
	public boolean addFav(FavoritePO favoritePO);
	
	/**
	 * 修改
	 * @param favoritePO
	 * @return
	 */
	public boolean updateFav(FavoritePO favoritePO);
	
	/**
	 * 删除
	 * @param fid
	 * @return
	 */
	public boolean deleteFav(Integer fid);
	
	/**
	 * 根据标签名查看网站信息
	 * @param tagName
	 * @return
	 */
	public List<FavoritePO> findByTagName(String tagName);
	
}
