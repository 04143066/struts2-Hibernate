package com.lanjiaomao.superClass;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class Super extends ActionSupport implements ServletContextAware,ServletRequestAware,ServletResponseAware{

	/**
	 * 用户继承父类表
	 */
	private static final long serialVersionUID = 1L;
	protected HttpServletResponse Response;//相应对象
	protected HttpServletRequest Request;//请求对象
	protected HttpSession Session;//会话对象
	protected ServletContext Context;//全局对象
	@Override
	public void setServletResponse(HttpServletResponse Response) {
		// TODO Auto-generated method stub
		this.Response=Response;
	}

	@Override
	public void setServletRequest(HttpServletRequest Request) {
		// TODO Auto-generated method stub
		this.Request=Request;
		this.Session=this.Request.getSession();
	}

	@Override
	public void setServletContext(ServletContext Context) {
		// TODO Auto-generated method stub
		this.Context=Context;		
	}
}
