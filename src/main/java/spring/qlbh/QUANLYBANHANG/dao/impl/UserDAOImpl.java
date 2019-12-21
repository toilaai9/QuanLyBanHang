package spring.qlbh.QUANLYBANHANG.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;


import spring.qlbh.QUANLYBANHANG.dao.UserDAO;
import spring.qlbh.QUANLYBANHANG.entity.User;
import spring.qlbh.QUANLYBANHANG.model.UserInfo;


public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public UserInfo checkLogin(String userName, String passWord) {
		Session se = this.sessionfactory.getCurrentSession();

		String sql = " Select new " + UserInfo.class.getName()
				+ "(u.id, u.userName, u.passWord, u.hoTen, u.imagelink, u.diaChi, u.sDT, u.loai)" + " from "
				+ User.class.getName() + " u where USERNAME =: us and PASSWORD =: pw";

		Query query = se.createQuery(sql);
		query.setParameter("us", userName);
		query.setParameter("pw",passWord);
		return (UserInfo) query.uniqueResult();
	}
}
