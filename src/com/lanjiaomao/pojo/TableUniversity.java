package com.lanjiaomao.pojo;

public class TableUniversity {

	private Integer universityId;
	private String universityName;
	private Integer universityInProfessionNo;
	private Integer universityOutProfessionNo;
	private Integer provinceNo;
	private Integer cityNo;
	private String remark1;
	private String remark2;
	private Integer professionNo;
	
	public Integer getProfessionNo() {
		return professionNo;
	}

	public void setProfessionNo(Integer professionNo) {
		this.professionNo = professionNo;
	}

	public Integer getUniversityId() {
		return universityId;
	}

	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public Integer getUniversityInProfessionNo() {
		return universityInProfessionNo;
	}

	public void setUniversityInProfessionNo(Integer universityInProfessionNo) {
		this.universityInProfessionNo = universityInProfessionNo;
	}

	public Integer getUniversityOutProfessionNo() {
		return universityOutProfessionNo;
	}

	public void setUniversityOutProfessionNo(Integer universityOutProfessionNo) {
		this.universityOutProfessionNo = universityOutProfessionNo;
	}

	public Integer getProvinceNo() {
		return provinceNo;
	}

	public void setProvinceNo(Integer provinceNo) {
		this.provinceNo = provinceNo;
	}

	public Integer getCityNo() {
		return cityNo;
	}

	public void setCityNo(Integer cityNo) {
		this.cityNo = cityNo;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	@Override
	public String toString() {
		return "TableUniversity [universityId=" + universityId
				+ ", universityName=" + universityName
				+ ", universityInProfessionNo=" + universityInProfessionNo
				+ ", universityOutProfessionNo=" + universityOutProfessionNo
				+ ", provinceNo=" + provinceNo + ", cityNo=" + cityNo
				+ ", remark1=" + remark1 + ", remark2=" + remark2
				+ ", professionNo=" + professionNo + "]";
	}

}
