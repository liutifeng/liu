package com.yc.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yc.biz.IFavoriteBiz;
import com.yc.dao.BaseDAO;
import com.yc.dao.FavoriteMapper;
import com.yc.dao.TagMapper;
import com.yc.po.FavoritePO;
import com.yc.po.TagPO;

public class FavoriteBizImpl implements IFavoriteBiz {

	BaseDAO dao = new BaseDAO();
	private SqlSession session = null;
	private FavoriteMapper mapper = null;
	private TagMapper tagMapper = null;
	
	
	@Override
	public FavoritePO findById(Integer fid) throws Exception {
		
		return null;
	}

	@Override
	public List<FavoritePO> findByCondition(FavoritePO favoritePO) throws Exception {
		session = dao.getSession(false);
		mapper = session.getMapper(FavoriteMapper.class);
		List<FavoritePO> list = mapper.findByCondition(favoritePO);
		dao.closeSession(session);
		return list;
	}

	@Override
	public boolean addFav(FavoritePO favoritePO) throws Exception {
		session = dao.getSession(false);
		mapper = session.getMapper(FavoriteMapper.class);
		tagMapper = session.getMapper(TagMapper.class);
		// 获得所有的标签
		// 传入tags进行分割
		String [] tags = favoritePO.getfTags().split(",");
		List<String> tagList = new ArrayList<String>();
		for(String t:tags){
			tagList.add(t);
		}
		List<TagPO> tagPOList = tagMapper.findByTagName(tagList);
		// 声明list集合存储已经存在的标签ID
		List<Integer> ids = new ArrayList<Integer>();
		for(TagPO po:tagPOList){
			if(tagList.remove(po.gettName())){ // 移除标签表中已经存在的标签名称
				// 将移除的标签名称对应的ID号进行存储
				ids.add(po.gettId());
			};
		}
		System.out.println("不存在的标签名称："+tagList);
		System.out.println("已经存在的标签的IDS集合："+ids);
		
		// 比较后做插入操作
		// 插入新的标签
		List<TagPO> tagpos = new ArrayList<TagPO>();
		for(String str:tagList){
			// 循环不存在标签名称，根据标签名称创建标签对象，将该对象设置到tagpos集合
			TagPO po = new TagPO();
			po.settName(str);
			po.settCount(1);
			tagpos.add(po);
		}
		Boolean f1 = tagMapper.addTag(tagpos);
		
		// 修改存在的标签数量
		Boolean f2 = tagMapper.updateTagCountByIds(ids);
		Boolean f3 = mapper.addFav(favoritePO);
		
		// 以上三种操作必须同时成功，才会提交事务
		// 手动提交
		if(f1==true && f2==true && f3==true){
			session.commit();
			return true;
		}
		dao.closeSession(session);
		return false;
	}

	@Override
	public boolean updateFav(FavoritePO favoritePO) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFav(Integer fid) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<FavoritePO> findByTagName(String tagName) throws Exception {
		session = dao.getSession(false);
		mapper = session.getMapper(FavoriteMapper.class);
		return mapper.findByTagName(tagName);
	}

}
