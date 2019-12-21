package spring.qlbh.QUANLYBANHANG.dao;

import javax.transaction.Transactional;

import spring.qlbh.QUANLYBANHANG.model.UserInfo;

@Transactional
public interface UserDAO {
	public UserInfo checkLogin(String userName,String passWord);
}
