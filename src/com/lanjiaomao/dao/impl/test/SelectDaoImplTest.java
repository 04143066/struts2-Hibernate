package com.lanjiaomao.dao.impl.test;

import java.util.List;

import org.junit.Test;

import com.lanjiaomao.dao.SelectDao;
import com.lanjiaomao.dao.impl.SelectDaoImpl;
import com.lanjiaomao.pojo.TableUniversity;

public class SelectDaoImplTest {

	private SelectDao selectDao = new SelectDaoImpl(); 
	@Test
	public void testGetTAPSByScore() {
		List<TableUniversity> list = selectDao.getTAPSByScore("540","14","2010","1");
		if(list != null){
			if(list.size() > 0){
				System.out.println(list);
			}
		}else{
			System.out.println("wrong");
		}
	}
	
	@Test
	public void testGetTUByNo(){
		System.out.println(selectDao.getTUByNo(9010100+"", 1+""));
	}

}
