package edu.bsm.prf.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.bsm.prf.dto.ContactMeDto;
import edu.bsm.prf.dto.PortalAdminDto;
import edu.bsm.prf.request.PortalRequest;

@Repository
// @Transactional
public class UserProfileDaoImpl implements UserProfileDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean saveContactMeInfo(ContactMeDto requestDto) {
		System.out.println("3");
		Session session = null;
		Integer id = 0;
		try {
			System.out.println("4");
			session = sessionFactory.openSession();
			System.out.println("5");
			session.beginTransaction();
			id = (Integer) session.save(requestDto);
			System.out.println("saveContactMeInfo : id : " + id);
			System.out.println("6");
			session.getTransaction().commit();
			System.out.println("7");
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			if (null != session) {
				session.close();
			}
		}
		// go to try block use flag
		if (id <= 0) {
			return false;
		}
		return true;
	}

	@Override
	public int baseSignIn(PortalRequest request) {
		String signIn_query = "FROM PortalAdminDto AS B WHERE B.phoneNum=? AND B.password=? AND B.activeInd=?";
		int i = 0;
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Query query = session.createQuery(signIn_query);
			query.setParameter(0, request.getPortalId());
			query.setParameter(1, request.getPassword());
			query.setParameter(2, "Y");
			List list = query.list();
			System.out.println("D : " + list.size());
			if ((null != list) && (list.size() > 0)) {
				i += list.size();
			}
			// return i;
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			if (null == session) {
				session.close();
			}
		}
		return i;
	}

	@Override
	public boolean infoSectionForm(PortalAdminDto requestDto) {
		boolean flag = false;
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			Integer id = (Integer) session.save(requestDto);
			session.getTransaction().commit();
			if (id > 0) {
				flag = true;
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			if (null != session) {
				session.close();
			}
		}
		return flag;
	}

	@Override
	public List<ContactMeDto> viewContactDetails() {
		Session session = null;
		List<ContactMeDto> contactMeDtoList = null;
		try {
			session = sessionFactory.openSession();
			String contactInfo_query = "from ContactMeDto";
			Query query = session.createQuery(contactInfo_query);
			contactMeDtoList = query.list();
			// return contactMeDtoList;
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			if (null != session) {
				session.close();
			}
		}
		return contactMeDtoList;
	}

	@Override
	public List<PortalAdminDto> aboutMeDetails() {
		Session session = null;
		List<PortalAdminDto> aboutMeList = null;
		try {
			session = sessionFactory.openSession();
			String aboutme_query = "from PortalAdminDto";
			Query query = session.createQuery(aboutme_query);
			aboutMeList = query.list();
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			if (null != session) {
				session.close();
			}
		}
		return aboutMeList;
	}

	/*
	 * @Autowired public UserProfileDaoImpl(SessionFactory sessionFactory) {
	 * this.sessionFactory = sessionFactory; }
	 */

	/*
	 * @Override public boolean saveContactMeInfo(ContactMeRequest request) {
	 * System.out.println("sf : " + sessionFactory); System.out.println("sf : "
	 * + sessionFactory); System.out.println("ct d " +
	 * request.getConcernType()); System.out.println("cd d " +
	 * request.getConcernDetails()); ContactMeDto cmDto = new ContactMeDto();
	 * cmDto.setFullName(request.getFullName());
	 * cmDto.setOrganisationName(request.getOrganisationName());
	 * cmDto.setCurrentCity(request.getCurrentCity());
	 * cmDto.setCurrentState(request.getCurrentState());
	 * cmDto.setCurrentCountry(request.getCurrentCountry());
	 * cmDto.setPhoneNum(request.getPhoneNum());
	 * cmDto.setEmailId(request.getEmailId());
	 * cmDto.setOfficeEmailId(request.getOfficeEmailId());
	 * cmDto.setDob(request.getDob()); cmDto.setGender(request.getGender());
	 * cmDto.setConcernType(request.getConcernType());
	 * cmDto.setConcernDetails(request.getConcernDetails());
	 * System.out.println("ct dd " + cmDto.getConcernType());
	 * System.out.println("cd dd " + cmDto.getConcernDetails());
	 * sessionFactory.openSession().saveOrUpdate(cmDto);
	 * //session.saveOrUpdate(cmDto); return true; }
	 */

}
