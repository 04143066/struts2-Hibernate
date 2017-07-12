package com.lanjiaomao.pojo;


public class TableProfession implements java.io.Serializable {

	/**
	 * 专业表操作
	 */
	private static final long serialVersionUID = 1L;
	private Integer professionNo;  //专业编号
	private String professionName; //专业名称
	private String remark1;        //备注1
	private String remark2;        //备注2
	
	public TableProfession() {
	}

	public TableProfession(Integer professionNo) {
		this.professionNo = professionNo;
	}

	
	public TableProfession(Integer professionNo, String professionName,
			String remark1, String remark2) {
		this.professionNo = professionNo;
		this.professionName = professionName;
		this.remark1 = remark1;
		this.remark2 = remark2;
	}



	public Integer getProfessionNo() {
		return this.professionNo;
	}

	public void setProfessionNo(Integer professionNo) {
		this.professionNo = professionNo;
	}

	public String getProfessionName() {
		return this.professionName;
	}

	public void setProfessionName(String professionName) {
		this.professionName = professionName;
	}

	public String getRemark1() {
		return this.remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getRemark2() {
		return this.remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

}