package com.yc.biz;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yc.biz.impl.FavoriteBizImpl;
import com.yc.po.FavoritePO;

public class FavoriteBizTest {

	IFavoriteBiz biz = new FavoriteBizImpl();
	
	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByCondition() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddFav() throws Exception {
		FavoritePO favoritePO = new FavoritePO();
		favoritePO.setfDesc("qq");
		favoritePO.setfLable("腾讯");
		favoritePO.setfUrl("http://www.qq.com");
		favoritePO.setfTags("新闻,娱乐,聊天");
		biz.addFav(favoritePO);
	}

	@Test
	public void testUpdateFav() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteFav() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testFindByTagName() throws Exception{
		System.out.println(biz.findByTagName("新闻"));
	}
}
