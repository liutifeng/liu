package com.yc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.biz.IFavoriteBiz;
import com.yc.biz.impl.FavoriteBizImpl;
import com.yc.po.FavoritePO;
@WebServlet("/favorite.action")
public class FavoriteServlet extends BaseServlet{

	IFavoriteBiz biz = new FavoriteBizImpl();
	
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
		try {
			List<FavoritePO> list = biz.findByCondition(null);
			toPrintString(response, list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	

}
