package edu.bsm.prf.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BSM_INFO")
public class PortalAdminDto {

	private int id;
	private String name;
	private String fatherName;
	private String motherName;
	private String gender;
	private String maritalStatus;
	private String phoneNum;
	private String altPhoneNum;
	private String password;
	private String emailId;
	private String altEmailId;
	private String highestQulf;
	private String activeInd = "Y";

	@Id
	@GeneratedValue
	@Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "FATHER_NAME")
	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@Column(name = "MOTHER_NAME")
	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	@Column(name = "GENDER")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "MARITAL_STATUS")
	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Column(name = "PHONE_NUM")
	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Column(name = "ALT_PHONE_NUM")
	public String getAltPhoneNum() {
		return altPhoneNum;
	}

	public void setAltPhoneNum(String altPhoneNum) {
		this.altPhoneNum = altPhoneNum;
	}

	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "EMAIL_ID")
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "ALT_EMAIL_ID")
	public String getAltEmailId() {
		return altEmailId;
	}

	public void setAltEmailId(String altEmailId) {
		this.altEmailId = altEmailId;
	}

	@Column(name = "HIGHEST_QULF")
	public String getHighestQulf() {
		return highestQulf;
	}

	public void setHighestQulf(String highestQulf) {
		this.highestQulf = highestQulf;
	}

	@Column(name = "ACTIVE_IND")
	public String getActiveInd() {
		return activeInd;
	}

	public void setActiveInd(String activeInd) {
		this.activeInd = activeInd;
	}

}
