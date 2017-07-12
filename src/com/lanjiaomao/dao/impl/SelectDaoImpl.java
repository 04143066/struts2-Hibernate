package com.lanjiaomao.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lanjiaomao.dao.SelectDao;
import com.lanjiaomao.db.HibernateSessionFactory;
import com.lanjiaomao.pojo.TableAdmitProfessionSituation;
import com.lanjiaomao.pojo.TableProfession;
import com.lanjiaomao.pojo.TableUniversity;

public class SelectDaoImpl implements SelectDao{

	public Session getSession(){
		return HibernateSessionFactory.getSession();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TableUniversity> getTAPSByScore(String score , String provinceNo, 
			String tableAdmitYear, String classNo) {

		Transaction transaction = getSession().beginTransaction();
		//投影查询
		String hql = "select new TableAdmitProfessionSituation(t.professionNo,t.universityNo)"
					+ "from TableAdmitProfessionSituation t "
					+ "where t.tableAdmitProfessionSituationAdmitMax >= :score + 20 "
					+ "and t.tableAdmitProfessionSituationAdmitMin <= :score - 20 "
					+ "and t.provinceNo = :provinceNo "
					+ "and t.tableAdmitYear = :tableAdmitYear "
					+ "and t.classNo = :classNo";
		List<TableAdmitProfessionSituation> tapss = getSession().createQuery(hql)
				.setString("score", score).setString("score", score)
				.setString("provinceNo", provinceNo).setString("tableAdmitYear", tableAdmitYear)
				.setString("classNo", classNo).list();
		List<TableUniversity> tus = new ArrayList<TableUniversity>();
		for(TableAdmitProfessionSituation taps : tapss){
			TableUniversity tu = getTUByNo(taps.getProfessionNo()+"", taps.getUniversityNo()+"");
			tus.add(tu);
		}
		transaction.commit();
		HibernateSessionFactory.closeSession();
		return tus;
	}

	@Override
	public TableUniversity getTUByNo(String professionNo,
			String universityId) {
		String hql = "from TableUniversity t where t.universityId = :universityId "
				+ "and t.professionNo = :professionNo";
		TableUniversity tu = (TableUniversity)getSession().createQuery(hql).setString("universityId", universityId)
		.setString("professionNo", professionNo).uniqueResult();
		return tu;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TableProfession> getTableProfessionByNo(String professionNo) {
		
		Transaction transaction = getSession().beginTransaction();
		String hql = "from TableProfession t where t.professionNo = :professionNo order by t.professionNo";
		List<TableProfession> list = getSession().createQuery(hql)
									.setString("professionNo", professionNo).list();
		transaction.commit();
		HibernateSessionFactory.closeSession();
		return list;
	}
	
}
