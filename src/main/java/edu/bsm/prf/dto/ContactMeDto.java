package edu.bsm.prf.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BSM_RELATES")
public class ContactMeDto {
	private int id;
	private String fullName;
	private String organisationName;
	private String currentCity;
	private String currentState;
	private String currentCountry;
	private String phoneNum;
	private String emailId;
	private String officeEmailId;
	private String dob;
	private String gender;
	private String concernType;
	private String concernDetails;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "FULL_NAME")
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "ORG_NAME")
	public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	@Column(name = "CURRENT_CITY")
	public String getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	@Column(name = "CURRENT_STATE")
	public String getCurrentState() {
		return currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}

	@Column(name = "CURRENT_COUNTRY")
	public String getCurrentCountry() {
		return currentCountry;
	}

	public void setCurrentCountry(String currentCountry) {
		this.currentCountry = currentCountry;
	}

	@Column(name = "PHONE_NUM")
	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Column(name = "EMAIL_ID")
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "OFC_EMAIL_ID")
	public String getOfficeEmailId() {
		return officeEmailId;
	}

	public void setOfficeEmailId(String officeEmailId) {
		this.officeEmailId = officeEmailId;
	}

	@Column(name = "DOB")
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Column(name = "GENDER")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "CONCERN_TYPE")
	public String getConcernType() {
		return concernType;
	}

	public void setConcernType(String concernType) {
		this.concernType = concernType;
	}

	@Column(name = "CONCERN_DETAILS")
	public String getConcernDetails() {
		return concernDetails;
	}

	public void setConcernDetails(String concernDetails) {
		this.concernDetails = concernDetails;
	}

	@Override
	public String toString() {
		return "ContactMeDto [id=" + id + ", fullName=" + fullName
				+ ", organisationName=" + organisationName + ", currentCity="
				+ currentCity + ", currentState=" + currentState
				+ ", currentCountry=" + currentCountry + ", phoneNum="
				+ phoneNum + ", emailId=" + emailId + ", officeEmailId="
				+ officeEmailId + ", dob=" + dob + ", gender=" + gender
				+ ", concernType=" + concernType + ", concernDetails="
				+ concernDetails + "]";
	}

}
