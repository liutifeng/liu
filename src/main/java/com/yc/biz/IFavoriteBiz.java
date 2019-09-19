package com.yc.biz;

import java.util.List;

import com.yc.po.FavoritePO;

public interface IFavoriteBiz {

	/**
	 * 根据编号查看
	 * @param fid
	 * @return
	 */
	public FavoritePO findById(Integer fid) throws Exception;
	
	/**
	 * 根据条件查看
	 * @param favoritePO
	 * @return
	 */
	public List<FavoritePO> findByCondition(FavoritePO favoritePO) throws Exception;

	/**
	 * 添加收藏
	 * @param favoritePO
	 * @return
	 */
	public boolean addFav(FavoritePO favoritePO) throws Exception;
	
	/**
	 * 修改
	 * @param favoritePO
	 * @return
	 */
	public boolean updateFav(FavoritePO favoritePO) throws Exception;
	
	/**
	 * 删除
	 * @param fid
	 * @return
	 */
	public boolean deleteFav(Integer fid) throws Exception;
	
	public List<FavoritePO> findByTagName(String tagName) throws Exception;
}
