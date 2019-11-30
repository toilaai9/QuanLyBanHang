package spring.qlbh.QUANLYBANHANG.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.qlbh.QUANLYBANHANG.dao.UserDAO;

@Controller
public class HomeController {
	@Autowired

	private UserDAO userDao;

	@RequestMapping("/")
	public String loadIndex() {
		return "Index";
	}

	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpSession session) {
		String name = request.getParameter("username");
		String pass = request.getParameter("pass");

		boolean kt = userDao.checkLogin(name, pass);
		if (kt) {
			return "userInfo";
		} else {
			session.setAttribute("loi", "Tai khoan sai");
		}
		return "Index";
	}

//	public String ckLogin(@RequestParam("usetname") String name, @RequestParam("pass") String pass,
//			HttpSession session) {
//
//		boolean kt = userDao.checkLogin(name, pass);
//		if (kt) {
//			return "userInfo";
//		} else {
//			session.setAttribute("loi", "Tai khoan sai");
//		}
//		return "Index";
//	}
}
