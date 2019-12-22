
package spring.qlbh.QUANLYBANHANG.controller.Admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.qlbh.QUANLYBANHANG.dao.HangDAO;
import spring.qlbh.QUANLYBANHANG.dao.UserDAO;
import spring.qlbh.QUANLYBANHANG.model.HangInfo;
import spring.qlbh.QUANLYBANHANG.model.UserInfo;

@Controller
public class HomeControllerAdmin {
	@Autowired
	private UserDAO userDao;
	@Autowired
	private HangDAO hangDAO;
	
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
		return "redirect:/admin/user";
	}
	@RequestMapping("/admin/hang")
	public String Hang(Model model) {
		List<HangInfo> hang = hangDAO.loadHang();
		model.addAttribute("loadHang", hang);	
		return "admin/Hang";
	}
	@RequestMapping("/admin/hang/delete")
	public String deleteHang(Model model, HttpServletRequest request,HttpSession session ) {
		int id= Integer.parseInt(request.getParameter("id"));
//		hangDAO.xoaHang̣̣̣̣̣(id);
		session.setAttribute("mess", "Xoa thanh cong!");
		return "admin";
	}

	@RequestMapping("/admin/user/add")
	public String addUser(Model model) {
		List<UserInfo> listUser = userDao.loadUser();
		model.addAttribute("listUser",listUser );
		return "admin/addUser";
	}	
}
