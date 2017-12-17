package edu.bsm.prf.service;

import java.util.List;

import edu.bsm.prf.dto.ContactMeDto;
import edu.bsm.prf.dto.PortalAdminDto;
import edu.bsm.prf.request.ContactMeRequest;
import edu.bsm.prf.request.PortalRequest;

public interface UserProfileService {

	public boolean saveContactMeInfo(ContactMeRequest request);

	public String baseSignIn(PortalRequest request);
	
	public int performSignUpUser(PortalRequest portalRequest);

	public boolean infoSectionForm(PortalRequest request);

	public List<ContactMeDto> viewContactDetails();

	public List<PortalAdminDto> aboutMeDetails();

	public int performForgotPassword(PortalRequest portalRequest);

}
