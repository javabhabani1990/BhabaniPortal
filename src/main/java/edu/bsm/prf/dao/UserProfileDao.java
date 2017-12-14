package edu.bsm.prf.dao;

import java.util.List;

import edu.bsm.prf.dto.ContactMeDto;
import edu.bsm.prf.dto.PortalAdminDto;
import edu.bsm.prf.request.PortalRequest;

public interface UserProfileDao {

	public boolean saveContactMeInfo(ContactMeDto requestDto);

	public int baseSignIn(PortalRequest request);

	public boolean infoSectionForm(PortalAdminDto requestDto);

	public List<ContactMeDto> viewContactDetails();

	public List<PortalAdminDto> aboutMeDetails();

}
