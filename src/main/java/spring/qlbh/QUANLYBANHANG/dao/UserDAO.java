package spring.qlbh.QUANLYBANHANG.dao;

import java.util.List;

import javax.transaction.Transactional;

<<<<<<< HEAD
import spring.qlbh.QUANLYBANHANG.entity.User;
=======
>>>>>>> de5e5e7214707d93b8c81615cf624b4ccdc44095
import spring.qlbh.QUANLYBANHANG.model.UserInfo;

@Transactional
public interface UserDAO {
<<<<<<< HEAD
	public List<UserInfo> loadUser();
	public User findUser(int id);
	public void xoaUser(int id);
=======
	public UserInfo checkLogin(String userName,String passWord);
>>>>>>> de5e5e7214707d93b8c81615cf624b4ccdc44095
}
