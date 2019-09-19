package com.yc.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseDAO {
	
	// 获去工厂对象
	public SqlSessionFactory getSqlSessionFactory() throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		return factory;
	}
	
	// 获取session对象
	public SqlSession getSession(boolean flag) throws IOException{
		return getSqlSessionFactory().openSession(flag);// true 表示自动提交
	}
	
	// 关闭会话
	public void closeSession(SqlSession session){
		if(null!=session){
			session.close();
		}
	}
	
}
