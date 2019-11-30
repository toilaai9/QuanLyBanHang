package spring.qlbh.QUANLYBANHANG.dao;

import javax.transaction.Transactional;

@Transactional
public interface UserDAO {
	public boolean checkLogin(String user,String pass);
}
