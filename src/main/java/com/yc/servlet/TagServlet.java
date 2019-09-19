package com.yc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.biz.ITagBiz;
import com.yc.biz.impl.TagBizImpl;
import com.yc.po.TagPO;
@WebServlet("/tag.action")
public class TagServlet extends BaseServlet {

	ITagBiz biz = new TagBizImpl();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op = request.getParameter("op");
		
		if("findAll".equals(op)){
			doFindAll(request,response);
		}
	}

	private void doFindAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			List<TagPO> list = biz.findByCondition(null);
			// 给前端界面返回json格式字符串
			toPrintString(response, list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
