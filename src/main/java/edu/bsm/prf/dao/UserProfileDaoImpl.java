package edu.bsm.prf.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import edu.bsm.prf.dto.ContactMeDto;
import edu.bsm.prf.dto.PortalAdminDto;
import edu.bsm.prf.dto.UserAccessDto;
import edu.bsm.prf.request.PortalRequest;
import edu.bsm.prf.util.ConfigurationUtility;

@Repository
// @Transactional
public class UserProfileDaoImpl extends ConfigurationUtility implements
		UserProfileDao {

	/*
	 * @Autowired private SessionFactory sessionFactory;
	 * 
	 * public void setSessionFactory(SessionFactory sessionFactory) {
	 * this.sessionFactory = sessionFactory; }
	 */

	@Override
	public boolean saveContactMeInfo(ContactMeDto requestDto) {
		Session session = null;
		Integer id = 0;
		boolean flag = true;
		try {
			System.out.println("4");
			// session = sessionFactory.openSession();
			session = getSession(true);
			session.beginTransaction();
			id = (Integer) session.save(requestDto);
			session.getTransaction().commit();
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			/*
			 * if (null != session) { session.close(); }
			 */
			closeSession(session);
		}
		// go to try block use flag
		if (id <= 0) {
			flag = false;
		}
		return flag;
	}

	@Override
	public int baseAdminSignIn(PortalRequest request) {
		String signIn_query = "FROM PortalAdminDto AS B WHERE B.phoneNum=? AND B.password=? AND B.activeInd=?";
		int i = 0;
		List list = null;
		Session session = null;
		try {
			if (null != request) {
				// session = sessionFactory.openSession();
				session = getSession(false);
				Query query = session.createQuery(signIn_query);
				query.setParameter(0, request.getPortalId());
				query.setParameter(1, request.getPassword());
				query.setParameter(2, "A");
				list = query.list();
			}
			if ((null != list) && (list.size() > 0)) {
				i += list.size();
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			/*
			 * if (null == session) { session.close(); }
			 */
			closeSession(session);
		}
		return i;
	}

	@Override
	public int baseUserSignIn(PortalRequest request) {
		String signIn_query = "FROM UserAccessDto AS U WHERE U.phoneNum=? AND U.password=? AND U.activeInd=?";
		int i = 0;
		Session session = null;
		try {
			// session = sessionFactory.openSession();
			session = getSession(false);
			Query query = session.createQuery(signIn_query);
			query.setParameter(0, request.getPortalId());
			query.setParameter(1, request.getPassword());
			query.setParameter(2, "A");
			List list = query.list();
			if ((null != list) && (list.size() > 0)) {
				i += list.size();
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			/*
			 * if (null == session) { session.close(); }
			 */
			closeSession(session);
		}
		return i;
	}

	@Override
	public int performSignUpUser(UserAccessDto requestDto) {
		Session session = null;
		Integer i = 0;
		try {
			// session = sessionFactory.openSession();
			session = getSession(true);
			session.beginTransaction();
			i = (Integer) session.save(requestDto);
			session.getTransaction().commit();
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			closeSession(session);
		}
		return i;
	}

	@Override
	public boolean infoSectionForm(PortalAdminDto requestDto) {
		boolean flag = false;
		Integer id = 0;
		Session session = null;
		try {
			if (null != requestDto) {
				// session = sessionFactory.openSession();
				session = getSession(true);
				session.beginTransaction();
				id = (Integer) session.save(requestDto);
				session.getTransaction().commit();
			}
			if (id > 0) {
				flag = true;
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			/*
			 * if (null != session) { session.close(); }
			 */
			closeSession(session);
		}
		return flag;
	}

	@Override
	public List<ContactMeDto> viewContactDetails() {
		Session session = null;
		List<ContactMeDto> contactMeDtoList = null;
		try {
			// session = sessionFactory.openSession();
			session = getSession(false);
			String contactInfo_query = "from ContactMeDto";
			Query query = session.createQuery(contactInfo_query);
			contactMeDtoList = query.list();
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			/*
			 * if (null != session) { session.close(); }
			 */
			closeSession(session);
		}
		return contactMeDtoList;
	}

	@Override
	public List<PortalAdminDto> aboutMeDetails() {
		Session session = null;
		List<PortalAdminDto> aboutMeList = null;
		try {
			// session = sessionFactory.openSession();
			session = getSession(false);
			String aboutme_query = "from PortalAdminDto";
			Query query = session.createQuery(aboutme_query);
			aboutMeList = query.list();
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			/*
			 * if (null != session) { session.close(); }
			 */
			closeSession(session);
		}
		return aboutMeList;
	}

	@Override
	public int performForgotPassword(PortalRequest portalRequest) {
		Session session = null;
		int i = 0;
		try {
			// session = sessionFactory.openSession();
			session = getSession(true);
			String forgot_password_query = "update UserAccessDto set password = ? where phoneNum = ?";
			Query query = session.createQuery(forgot_password_query);
			query.setParameter(0, portalRequest.getPassword());
			query.setParameter(1, portalRequest.getPortalId());
			i = query.executeUpdate();
			session.beginTransaction().commit();
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			/*
			 * if (null != session) { session.close(); }
			 */
			closeSession(session);
		}
		return i;
	}

}
