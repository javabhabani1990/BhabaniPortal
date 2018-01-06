package edu.bsm.prf.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ConfigurationUtility {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession(boolean isTxReq) {
		Session session = null;
		try {
			session = sessionFactory.openSession();

			if (isTxReq) {
				System.out.println("Tx yes ");
				session.beginTransaction();
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		return session;
	}

	public void closeSession(Session session) {
		try {
			if (null != session) {
				session.clear();
				session.close();
				session = null;
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}

}
