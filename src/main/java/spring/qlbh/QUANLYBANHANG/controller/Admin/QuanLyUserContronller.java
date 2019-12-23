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

@Controller(value = "QuanLyUserController")
@RequestMapping(value = "/admin/user")
public class QuanLyUserContronller {
	@Autowired
	private UserDAO userDao;
	@RequestMapping("/delete")
	public String actionDelete(Model model, HttpServletRequest request,HttpSession session ) {
		int id= Integer.parseInt(request.getParameter("id"));
		userDao.xoaUser(id);
		session.setAttribute("mess", "Xoa thanh cong!");
		return "redirect:/admin/user";
	}
	@RequestMapping("/add")
	public String addUser(Model model) {
		List<UserInfo> listUser = userDao.loadUser();
		model.addAttribute("listUser",listUser );
		return "admin/addUser";
	}
}
