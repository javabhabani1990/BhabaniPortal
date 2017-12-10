package edu.bsm.prf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.bsm.prf.request.ContactMeRequest;
import edu.bsm.prf.request.PortalRequest;
import edu.bsm.prf.service.UserProfileService;
import edu.bsm.prf.service.UserProfileServiceImpl;

@RestController
public class MyController {

	@Autowired
	// @Qualifier("userProfileService")
	private UserProfileService userProfileService;

	// UserProfileService userProfileService = new UserProfileServiceImpl();

	@RequestMapping("/welcome")
	public ModelAndView getPage() {
		return new ModelAndView("welcome");
	}

	@RequestMapping("/getContactMePage")
	public ModelAndView getContactMePage() {
		return new ModelAndView("contactMe");
	}

	@RequestMapping("/contactMeForm")
	public ModelAndView saveContactMeInfo(ContactMeRequest request) {
		userProfileService.saveContactMeInfo(request);
		return new ModelAndView("welcome");
	}

	// getSignInPage
	@RequestMapping("/getSignInPage")
	public ModelAndView getSignInPage() {
		return new ModelAndView("signIn");
	}

	@RequestMapping("/baseSignIn")
	public ModelAndView baseSignIn(PortalRequest request) {
		String page = "";
		int i = userProfileService.baseSignIn(request);
		System.out.println(i);
		if (i > 0) {
			page = "adminHome";
			return new ModelAndView("adminHome");
		}
		page = "error";
		return new ModelAndView("no");
	}

	@RequestMapping("/getInfoSectionPage")
	public ModelAndView getInfoSectionPage() {
		return new ModelAndView("infoSection");
	}

	@RequestMapping("/infoSectionForm")
	public ModelAndView infoSectionForm(PortalRequest request) {
		userProfileService.infoSectionForm(request);
		return new ModelAndView("adminHome");
	}

	@RequestMapping("/getContactDetailsPage")
	public ModelAndView viewContactDetails(ModelMap modelMap) {
		modelMap.addAttribute("contactsList",
				userProfileService.viewContactDetails());
		return new ModelAndView("contactDetails");
	}

	@RequestMapping("/aboutMeDetailsPage")
	public ModelAndView aboutMeDetails(ModelMap modelMap) {
		modelMap.addAttribute("aboutMeDetailsList",
				userProfileService.aboutMeDetails());
		return new ModelAndView("aboutMe");
	}

	/*
	 * @RequestMapping("/getStrings") public String getString() { return "hi"; }
	 */

}
