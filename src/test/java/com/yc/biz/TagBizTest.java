package com.yc.biz;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.yc.biz.impl.TagBizImpl;
import com.yc.po.TagPO;

public class TagBizTest {

	ITagBiz biz = new TagBizImpl();
	
	@Test
	public void testFindByCondition() throws Exception {
		System.out.println(biz.findByCondition(null));
		System.out.println(">>>>>>>.....t");
		System.out.println("22222222222222222222");
	}

	@Test
	public void testAddTags() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateTag() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteTag() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByTagName() throws Exception {
		List<String> tags = new ArrayList<String>();
		tags.add("娱乐");
		
		List<TagPO> list = biz.findByTagName(tags);
		System.out.println(list);
	}

}
