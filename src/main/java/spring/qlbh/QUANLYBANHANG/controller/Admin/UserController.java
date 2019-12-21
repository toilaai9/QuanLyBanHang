package spring.qlbh.QUANLYBANHANG.controller.Admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.qlbh.QUANLYBANHANG.dao.UserDAO;
import spring.qlbh.QUANLYBANHANG.model.UserInfo;

@Controller
 class UserController {
	@Autowired
	private UserDAO userDao;
	
	@RequestMapping("/admin/user")
	public String userPage(Model model) {
		List<UserInfo> listUser = userDao.loadUser();
		model.addAttribute("listUser",listUser );
		return "admin/QLUser";
	}
	@RequestMapping("/admin/user/delete")
	public String actionDelete(Model model, HttpServletRequest request,HttpSession session ) {
		int id= Integer.parseInt(request.getParameter("id"));
		userDao.xoaUser(id);
		session.setAttribute("mess", "Xoa thanh cong!");
		return "admin/QLUser";
	}
	
}
