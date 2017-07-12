package com.lanjiaomao.dao;

import java.util.List;

import com.lanjiaomao.pojo.TableProfession;
import com.lanjiaomao.pojo.TableUniversity;

public interface SelectDao {
	
	/**
	 * 根据成绩、年份、省份、科类查出对应的专业录取情况统计表信息，再查到对应的院校信息
	 * @return
	 */
	public List<TableUniversity> getTAPSByScore(String score , String provinceNo,
			String tableAdmitYear, String classNo);
	
	/**
	 * 根据score查到的院校编号以及专业编号查到对应的院校信息
	 * @param professionNo
	 * @param universityNo
	 * @return
	 */
	public TableUniversity getTUByNo(String professionNo,String universityNo);
	
	/**
	 * 根据专业号查专业表信息
	 * @return
	 */
	public List<TableProfession> getTableProfessionByNo(String professionNo);
	
	
	
}
