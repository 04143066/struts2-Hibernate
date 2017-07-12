package com.lanjiaomao.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.lanjiaomao.dao.SelectDao;
import com.lanjiaomao.dao.impl.SelectDaoImpl;
import com.lanjiaomao.pojo.TableAdmitProfessionSituation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class SelectAction extends ActionSupport implements ModelDriven<TableAdmitProfessionSituation>
	,RequestAware,Preparable{

	private static final long serialVersionUID = 1L;
	private Map<String , Object> request;
	private TableAdmitProfessionSituation taps;
	private SelectDao selectDao = new SelectDaoImpl();
	
	public String getTableUniversityByScore(){
		System.out.println(selectDao.getTAPSByScore("540","14","2010","1"));
		return SUCCESS;
	}
	
	@Override
	public void prepare() throws Exception {
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
	}

	@Override
	public TableAdmitProfessionSituation getModel() {
		return taps;
	}
	
	
}
