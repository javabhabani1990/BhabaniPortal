
package edu.bsm.prf.request;

public class PortalRequest {

	// signIn request
	private String portalId;// phone number
	private String password;

	// admin info request
	private String name;
	private String fatherName;
	private String motherName;
	private String gender;
	private String maritalStatus;
	private String phoneNum;
	private String altPhoneNum;
	// private String password;
	private String emailId;
	private String altEmailId;
	private String highestQulf;
	private String activeInd;

	// signUp user access
	private String dateOfBirth;
	private String presentAdd;
	private String permanentAdd;

	public String getPortalId() {
		return portalId;
	}

	public void setPortalId(String portalId) {
		this.portalId = portalId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAltPhoneNum() {
		return altPhoneNum;
	}

	public void setAltPhoneNum(String altPhoneNum) {
		this.altPhoneNum = altPhoneNum;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAltEmailId() {
		return altEmailId;
	}

	public void setAltEmailId(String altEmailId) {
		this.altEmailId = altEmailId;
	}

	public String getHighestQulf() {
		return highestQulf;
	}

	public void setHighestQulf(String highestQulf) {
		this.highestQulf = highestQulf;
	}

	public String getActiveInd() {
		return activeInd;
	}

	public void setActiveInd(String activeInd) {
		this.activeInd = activeInd;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPresentAdd() {
		return presentAdd;
	}

	public void setPresentAdd(String presentAdd) {
		this.presentAdd = presentAdd;
	}

	public String getPermanentAdd() {
		return permanentAdd;
	}

	public void setPermanentAdd(String permanentAdd) {
		this.permanentAdd = permanentAdd;
	}

}
