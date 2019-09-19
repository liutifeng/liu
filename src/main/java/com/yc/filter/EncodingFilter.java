package com.yc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

//@WebFilter("/*")
@WebFilter(filterName="encoding",urlPatterns={"/*"},
		initParams={@WebInitParam(name="charset",value="UTF-8")})
public class EncodingFilter implements Filter{

	private FilterConfig config;
	private String charset;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
//		HttpServletRequest request = (HttpServletRequest)arg0;
//		HttpServletResponse response = (HttpServletResponse)arg1;
//		request.setCharacterEncoding("UTF-8");
//		response.setCharacterEncoding("UTF-8");
//		arg2.doFilter(arg0, arg1);
		charset = config.getInitParameter("charset");
		// 给请求和响应对象设置编码集
		request.setCharacterEncoding(charset);
		response.setCharacterEncoding(charset);
		// 允许通过
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
	}

}
