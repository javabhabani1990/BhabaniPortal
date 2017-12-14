package edu.bsm.prf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bsm.prf.dao.UserProfileDao;
import edu.bsm.prf.dto.ContactMeDto;
import edu.bsm.prf.dto.PortalAdminDto;
import edu.bsm.prf.request.ContactMeRequest;
import edu.bsm.prf.request.PortalRequest;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	// UserProfileDao userProfileDao = new UserProfileDaoImpl();

	@Autowired
	private UserProfileDao userProfileDao;

	public void setUserProfileDao(UserProfileDao userProfileDao) {
		this.userProfileDao = userProfileDao;
	}

	@Override
	public boolean saveContactMeInfo(ContactMeRequest request) {
		System.out.println("1");
		ContactMeDto requestDto = new ContactMeDto();
		System.out.println("s1 : " + requestDto.toString());
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
		System.out.println("s2 : " + requestDto.toString());
		System.out.println("userProfileDao : " + userProfileDao);
		System.out.println("2");
		return userProfileDao.saveContactMeInfo(requestDto);
	}

	@Override
	public int baseSignIn(PortalRequest request) {
		// PortalAdminDto requestDto = new PortalAdminDto();
		// requestDto.setPhoneNum(request.getPortalId());
		// requestDto.setPassword(request.getPassword());
		return userProfileDao.baseSignIn(request);
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

}
