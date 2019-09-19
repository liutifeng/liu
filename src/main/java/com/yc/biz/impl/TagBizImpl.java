package com.yc.biz.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yc.biz.ITagBiz;
import com.yc.dao.BaseDAO;
import com.yc.dao.TagMapper;
import com.yc.po.TagPO;

public class TagBizImpl implements ITagBiz {

	private BaseDAO dao = new BaseDAO();
	private SqlSession session = null;
	private TagMapper mapper = null;
	
	@Override
	public List<TagPO> findByCondition(TagPO tagPO) throws Exception {
		session = dao.getSession(false);
		mapper = session.getMapper(TagMapper.class);
		return mapper.findByCondition(tagPO);
	}

	@Override
	public boolean addTags(List<TagPO> tags) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTag(TagPO tagPO) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTag(TagPO tagPO) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TagPO> findByTagName(List<String> tags) throws Exception {
		session = dao.getSession(false);
		mapper = session.getMapper(TagMapper.class);
		return mapper.findByTagName(tags);
	}

	

}
