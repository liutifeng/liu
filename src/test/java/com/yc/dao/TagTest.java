package com.yc.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.yc.po.TagPO;

public class TagTest {

	BaseDAO dao = new BaseDAO();
	
	@Test
	public void testAddTags() throws IOException {
		SqlSession session = dao.getSession(false);
		TagMapper mapper = session.getMapper(TagMapper.class);
		List<TagPO> list = new ArrayList<TagPO>();
		list.add( new TagPO(null,"美食",1));
		list.add( new TagPO(null,"电影",1));
		
		mapper.addTag(list);
		// 修改数量
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		mapper.updateTagCountByIds(ids);
		
		session.commit();
		session.close();
		
	}
}
