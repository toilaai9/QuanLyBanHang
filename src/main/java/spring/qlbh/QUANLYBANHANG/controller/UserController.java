package spring.qlbh.QUANLYBANHANG.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.qlbh.QUANLYBANHANG.dao.UserDAO;
import spring.qlbh.QUANLYBANHANG.model.UserInfo;

@Controller
public class UserController {
	
	private UserDAO userInfo;
	// trong này ông để method =post 
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPage(Model model, @RequestParam("username") String userName,
			@RequestParam("password") String passWord, HttpSession session) {
//		String request = "";
//		UserInfo us= userInfo.checkLogin(userName,passWord);
//		if(us !=null) {
//			String loai=us.getLoai();
//			if(loai.equals("1")) {
//				session.setAttribute("1", us);
//				request = "admin";	
//			} else {
//				session.setAttribute("0",us);
//				request = "/";
//			}
//		}
//		return request;
		return "login_view";
	}
	@RequestMapping("register")
	public String register() {
		return "register_view";
	}
}
