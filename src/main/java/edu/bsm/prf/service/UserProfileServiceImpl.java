package edu.bsm.prf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bsm.prf.dao.UserProfileDao;
import edu.bsm.prf.dto.ContactMeDto;
import edu.bsm.prf.dto.PortalAdminDto;
import edu.bsm.prf.dto.UserAccessDto;
import edu.bsm.prf.request.ContactMeRequest;
import edu.bsm.prf.request.PortalRequest;
import edu.bsm.prf.util.BusinessValidation;
import edu.bsm.prf.util.Utility;

@Service
public class UserProfileServiceImpl extends BusinessValidation implements
		UserProfileService {

	@Autowired
	private UserProfileDao userProfileDao;

	public void setUserProfileDao(UserProfileDao userProfileDao) {
		this.userProfileDao = userProfileDao;
	}

	@Override
	public boolean saveContactMeInfo(ContactMeRequest request) {
		ContactMeDto requestDto = new ContactMeDto();
		requestDto.setFullName(request.getFullName());
		requestDto.setOrganisationName(request.getOrganisationName());
		requestDto.setCurrentCity(request.getCurrentCity());
		requestDto.setCurrentState(request.getCurrentState());
		requestDto.setCurrentCountry(request.getCurrentCountry());
		requestDto.setPhoneNum(request.getPhoneNum());
		requestDto.setEmailId(request.getEmailId());
		requestDto.setOfficeEmailId(request.getOfficeEmailId());
		requestDto.setDob(request.getDob());
		requestDto.setGender(request.getGender());
		requestDto.setConcernType(request.getConcernType());
		requestDto.setConcernDetails(request.getConcernDetails());
		return userProfileDao.saveContactMeInfo(requestDto);
	}

	@Override
	public String baseSignIn(PortalRequest request) {
		String id = request.getPortalId();
		String returnStatus = null;
		if (!isEmpty(id) && isAdminId(id)) {
			int i = userProfileDao.baseAdminSignIn(request);
			if (i > 0) {
				returnStatus = "ADMIN";
			}
		}
		int j = userProfileDao.baseUserSignIn(request);
		if (j > 0) {
			returnStatus = "USER";
		}
		return returnStatus;
	}

	@Override
	public int performSignUpUser(PortalRequest portalRequest) {
		UserAccessDto requestDto = new UserAccessDto();
		requestDto.setName(portalRequest.getName());
		requestDto.setDateOfBirth(portalRequest.getDateOfBirth());
		requestDto.setPresentAdd(portalRequest.getPresentAdd());
		requestDto.setPermanentAdd(portalRequest.getPermanentAdd());
		requestDto.setGender(portalRequest.getGender());
		requestDto.setMaritalStatus(portalRequest.getMaritalStatus());
		requestDto.setPhoneNum(portalRequest.getPhoneNum());
		requestDto.setEmailId(portalRequest.getEmailId());
		requestDto.setPassword(portalRequest.getPassword());
		requestDto.setCreatedType("USER");
		requestDto.setCreatedDate(Utility.getCurrentDate());
		requestDto.setCreatedTime(Utility.getCurrentTime());
		requestDto.setActiveInd("A");
		return userProfileDao.performSignUpUser(requestDto);
	}

	@Override
	public boolean infoSectionForm(PortalRequest request) {
		PortalAdminDto requestDto = new PortalAdminDto();
		requestDto.setName(request.getName());
		requestDto.setFatherName(request.getFatherName());
		requestDto.setMotherName(request.getMotherName());
		requestDto.setGender(request.getGender());
		requestDto.setMaritalStatus(request.getMaritalStatus());
		requestDto.setPhoneNum(request.getPhoneNum());
		requestDto.setAltPhoneNum(request.getAltPhoneNum());
		requestDto.setPassword(request.getPassword());
		requestDto.setEmailId(request.getEmailId());
		requestDto.setAltEmailId(request.getAltEmailId());
		requestDto.setHighestQulf(request.getHighestQulf());
		requestDto.setCreatedType(request.getCreatedType());
		requestDto.setCreatedDate(Utility.getCurrentDate());
		requestDto.setCreatedTime(Utility.getCurrentTime());
		requestDto.setActiveInd("A");

		return userProfileDao.infoSectionForm(requestDto);
	}

	@Override
	public List<ContactMeDto> viewContactDetails() {
		return userProfileDao.viewContactDetails();
	}

	@Override
	public List<PortalAdminDto> aboutMeDetails() {
		return userProfileDao.aboutMeDetails();
	}

	@Override
	public int performForgotPassword(PortalRequest portalRequest) {
		return userProfileDao.performForgotPassword(portalRequest);
	}

}
