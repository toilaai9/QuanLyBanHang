package spring.qlbh.QUANLYBANHANG.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;


import spring.qlbh.QUANLYBANHANG.dao.UserDAO;
import spring.qlbh.QUANLYBANHANG.entity.LoginEntity;
import spring.qlbh.QUANLYBANHANG.model.LoginInfo;

public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public boolean checkLogin(String user, String pass) {
		Session session = sessionfactory.getCurrentSession();

		String sql = " SELECT new " + LoginInfo.class.getName() + " (u.id, u.username, u.password)" + " FROM "
				+ LoginEntity.class.getName() + " u ";

		Query query = session.createQuery(sql);
		if(query.list().size()>=1) return true;
		
		return false;
	}

}
