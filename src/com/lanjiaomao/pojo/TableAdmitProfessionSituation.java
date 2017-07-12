package com.lanjiaomao.pojo;

/**
 * 
 * @author Ma_We
 *
 */
public class TableAdmitProfessionSituation implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer tableAdmitProfessionSituationNo;              //编号
	private Integer cityNo;                                       //城市编号
	private Integer provinceNo;                                   //省份编号
	private Integer classNo;                                      //科类编号
	private Integer batchNo;                                      //批次编号
	private Integer professionNo;                                 //专业编号
	private Integer universityNo;                                 //院校编号
	private Integer universityinProfessionNo;                     //院校专业内编号
	private Integer universityoutProfessionNo;                    //院校专业外编号
	private Integer tableAdmitYear;                               //公布年份
	private Integer tableAdmitPlane;                              //公布计划
	private Integer tableAdmitPeople;                             //录取人数
	private Float tableAdmitProfessionSituationAdmitMax;          //录取分数最高分
	private Float tableAdmitProfessionSituationAdmitMin;          //录取分数最低分
	private Float tableAdmitProfessionSituationAdmitScoreAvg;     //录取分数平均分数     
	private Float tableAdmitProfessionSituationAdmitScoreAvgLine; //录取分数平均分数线
	private String remark1;                                       //备注1
	private String remark2;                                       //备注2
	private String remark3;                                       //备注3

	public TableAdmitProfessionSituation() {
	}

	public TableAdmitProfessionSituation(Integer tableAdmitProfessionSituationNo) {
		this.tableAdmitProfessionSituationNo = tableAdmitProfessionSituationNo;
	}

	public TableAdmitProfessionSituation(
			Integer tableAdmitProfessionSituationNo, Integer cityNo,
			Integer provinceNo, Integer classNo, Integer batchNo,
			Integer professionNo, Integer universityNo,
			Integer universityinProfessionNo,
			Integer universityoutProfessionNo, Integer tableAdmitYear,
			Integer tableAdmitPlane, Integer tableAdmitPeople,
			Float tableAdmitProfessionSituationAdmitMax,
			Float tableAdmitProfessionSituationAdmitMin,
			Float tableAdmitProfessionSituationAdmitScoreAvg,
			Float tableAdmitProfessionSituationAdmitScoreAvgLine,
			String remark1, String remark2, String remark3) {
		this.tableAdmitProfessionSituationNo = tableAdmitProfessionSituationNo;
		this.cityNo = cityNo;
		this.provinceNo = provinceNo;
		this.classNo = classNo;
		this.batchNo = batchNo;
		this.professionNo = professionNo;
		this.universityNo = universityNo;
		this.universityinProfessionNo = universityinProfessionNo;
		this.universityoutProfessionNo = universityoutProfessionNo;
		this.tableAdmitYear = tableAdmitYear;
		this.tableAdmitPlane = tableAdmitPlane;
		this.tableAdmitPeople = tableAdmitPeople;
		this.tableAdmitProfessionSituationAdmitMax = tableAdmitProfessionSituationAdmitMax;
		this.tableAdmitProfessionSituationAdmitMin = tableAdmitProfessionSituationAdmitMin;
		this.tableAdmitProfessionSituationAdmitScoreAvg = tableAdmitProfessionSituationAdmitScoreAvg;
		this.tableAdmitProfessionSituationAdmitScoreAvgLine = tableAdmitProfessionSituationAdmitScoreAvgLine;
		this.remark1 = remark1;
		this.remark2 = remark2;
		this.remark3 = remark3;
	}

	public TableAdmitProfessionSituation(Integer professionNo,
			Integer universityNo) {
		super();
		this.professionNo = professionNo;
		this.universityNo = universityNo;
	}

	public Integer getTableAdmitProfessionSituationNo() {
		return this.tableAdmitProfessionSituationNo;
	}

	public void setTableAdmitProfessionSituationNo(
			Integer tableAdmitProfessionSituationNo) {
		this.tableAdmitProfessionSituationNo = tableAdmitProfessionSituationNo;
	}

	public Integer getCityNo() {
		return this.cityNo;
	}

	public void setCityNo(Integer cityNo) {
		this.cityNo = cityNo;
	}

	public Integer getProvinceNo() {
		return this.provinceNo;
	}

	public void setProvinceNo(Integer provinceNo) {
		this.provinceNo = provinceNo;
	}

	public Integer getClassNo() {
		return this.classNo;
	}

	public void setClassNo(Integer classNo) {
		this.classNo = classNo;
	}

	public Integer getBatchNo() {
		return this.batchNo;
	}

	public void setBatchNo(Integer batchNo) {
		this.batchNo = batchNo;
	}

	public Integer getProfessionNo() {
		return this.professionNo;
	}

	public void setProfessionNo(Integer professionNo) {
		this.professionNo = professionNo;
	}

	public Integer getUniversityNo() {
		return this.universityNo;
	}

	public void setUniversityNo(Integer universityNo) {
		this.universityNo = universityNo;
	}

	public Integer getUniversityinProfessionNo() {
		return this.universityinProfessionNo;
	}

	public void setUniversityinProfessionNo(Integer universityinProfessionNo) {
		this.universityinProfessionNo = universityinProfessionNo;
	}

	public Integer getUniversityoutProfessionNo() {
		return this.universityoutProfessionNo;
	}

	public void setUniversityoutProfessionNo(Integer universityoutProfessionNo) {
		this.universityoutProfessionNo = universityoutProfessionNo;
	}

	public Integer getTableAdmitYear() {
		return this.tableAdmitYear;
	}

	public void setTableAdmitYear(Integer tableAdmitYear) {
		this.tableAdmitYear = tableAdmitYear;
	}

	public Integer getTableAdmitPlane() {
		return this.tableAdmitPlane;
	}

	public void setTableAdmitPlane(Integer tableAdmitPlane) {
		this.tableAdmitPlane = tableAdmitPlane;
	}

	public Integer getTableAdmitPeople() {
		return this.tableAdmitPeople;
	}

	public void setTableAdmitPeople(Integer tableAdmitPeople) {
		this.tableAdmitPeople = tableAdmitPeople;
	}

	public Float getTableAdmitProfessionSituationAdmitMax() {
		return this.tableAdmitProfessionSituationAdmitMax;
	}

	public void setTableAdmitProfessionSituationAdmitMax(
			Float tableAdmitProfessionSituationAdmitMax) {
		this.tableAdmitProfessionSituationAdmitMax = tableAdmitProfessionSituationAdmitMax;
	}

	public Float getTableAdmitProfessionSituationAdmitMin() {
		return this.tableAdmitProfessionSituationAdmitMin;
	}

	public void setTableAdmitProfessionSituationAdmitMin(
			Float tableAdmitProfessionSituationAdmitMin) {
		this.tableAdmitProfessionSituationAdmitMin = tableAdmitProfessionSituationAdmitMin;
	}

	public Float getTableAdmitProfessionSituationAdmitScoreAvg() {
		return this.tableAdmitProfessionSituationAdmitScoreAvg;
	}

	public void setTableAdmitProfessionSituationAdmitScoreAvg(
			Float tableAdmitProfessionSituationAdmitScoreAvg) {
		this.tableAdmitProfessionSituationAdmitScoreAvg = tableAdmitProfessionSituationAdmitScoreAvg;
	}

	public Float getTableAdmitProfessionSituationAdmitScoreAvgLine() {
		return this.tableAdmitProfessionSituationAdmitScoreAvgLine;
	}

	public void setTableAdmitProfessionSituationAdmitScoreAvgLine(
			Float tableAdmitProfessionSituationAdmitScoreAvgLine) {
		this.tableAdmitProfessionSituationAdmitScoreAvgLine = tableAdmitProfessionSituationAdmitScoreAvgLine;
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

	public String getRemark3() {
		return this.remark3;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}

	@Override
	public String toString() {
		return "TableAdmitProfessionSituation [tableAdmitProfessionSituationNo="
				+ tableAdmitProfessionSituationNo
				+ ", cityNo="
				+ cityNo
				+ ", provinceNo="
				+ provinceNo
				+ ", classNo="
				+ classNo
				+ ", batchNo="
				+ batchNo
				+ ", professionNo="
				+ professionNo
				+ ", universityNo="
				+ universityNo
				+ ", universityinProfessionNo="
				+ universityinProfessionNo
				+ ", universityoutProfessionNo="
				+ universityoutProfessionNo
				+ ", tableAdmitYear="
				+ tableAdmitYear
				+ ", tableAdmitPlane="
				+ tableAdmitPlane
				+ ", tableAdmitPeople="
				+ tableAdmitPeople
				+ ", tableAdmitProfessionSituationAdmitMax="
				+ tableAdmitProfessionSituationAdmitMax
				+ ", tableAdmitProfessionSituationAdmitMin="
				+ tableAdmitProfessionSituationAdmitMin
				+ ", tableAdmitProfessionSituationAdmitScoreAvg="
				+ tableAdmitProfessionSituationAdmitScoreAvg
				+ ", tableAdmitProfessionSituationAdmitScoreAvgLine="
				+ tableAdmitProfessionSituationAdmitScoreAvgLine
				+ ", remark1="
				+ remark1
				+ ", remark2="
				+ remark2
				+ ", remark3="
				+ remark3
				+ "]";
	}
	
	
	
}