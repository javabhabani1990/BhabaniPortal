package edu.bsm.prf.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.bsm.prf.request.ContactMeRequest;
import edu.bsm.prf.request.PortalRequest;
import edu.bsm.prf.service.UserProfileService;

@RestController
public class MyController {

	@Autowired
	private UserProfileService userProfileService;

	@RequestMapping("/welcome")
	public ModelAndView getPage() {
		return new ModelAndView("welcome");
	}

	@RequestMapping("/contactMeForm")
	public ModelAndView saveContactMeInfo(ContactMeRequest request) {
		userProfileService.saveContactMeInfo(request);
		return new ModelAndView("welcome");
	}

	@RequestMapping("/baseSignIn")
	public ModelAndView baseSignIn(PortalRequest request) {
		String s = userProfileService.baseSignIn(request);
		if (("ADMIN").equalsIgnoreCase(s)) {
			return new ModelAndView("adminHome");
		} else if (("USER").equalsIgnoreCase(s)) {
			return new ModelAndView("welcome");
		} else {
			return new ModelAndView("no");
		}
	}

	@RequestMapping("/performSignUpUser")
	public ModelAndView performSignUpUser(PortalRequest portalRequest) {
		int i = userProfileService.performSignUpUser(portalRequest);
		return new ModelAndView("welcome");
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

	@RequestMapping("/download{id}")
	public String getDownload(HttpServletRequest httpServletRequest, String id) {
		String s = httpServletRequest.getServletPath();
		System.out.println("id : " + id);
		int i = Integer.parseInt(Character.toString(s.charAt(s.length() - 1)));
		System.out.println(s);
		System.out.println(i);
		if (i == 1) {
			System.out.println("Resume");
		} else if (i == 2) {
			System.out.println("Biography");
		} else if (i == 3) {
			System.out.println("Photo");
		} else {
			System.out.println("None");
		}
		return "redirect:aboutMeDetailsPage";
	}

	// getForgotPasswordPageUser
	@RequestMapping("/getForgotPasswordPageUser")
	public ModelAndView sendUrl() {
		// http://localhost:8080/getForgotPasswordPage/send/request
		String s = "http://localhost:8080/getForgotPasswordPage/send/request";
		// MasterMail.send("tech.bhabani@gmail.com",
		// "Password reset confirmationt", s);
		return new ModelAndView("welcome");
	}

	// getForgotPasswordPage-send-request
	@RequestMapping("/getForgotPasswordPage-send-request")
	public ModelAndView getForgotPasswordPage() {

		return new ModelAndView("forgotPassword");
	}

	// performForgotPassword
	@RequestMapping("/performForgotPassword")
	public ModelAndView performForgotPassword(PortalRequest portalRequest) {
		System.out.println("ssss1");
		int i = userProfileService.performForgotPassword(portalRequest);
		if (i > 0) {
			return new ModelAndView("signIn");
		} else {
			return new ModelAndView("no");
		}
	}

}
