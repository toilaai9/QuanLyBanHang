package spring.qlbh.QUANLYBANHANG.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.qlbh.QUANLYBANHANG.dao.HangDAO;
import spring.qlbh.QUANLYBANHANG.dao.LoaiHangDAO;
import spring.qlbh.QUANLYBANHANG.model.HangInfo;
import spring.qlbh.QUANLYBANHANG.model.LoaiHangInfo;


@Controller
public class HomeController {
	@Autowired
	private HangDAO hangDAO;
	@Autowired
	private LoaiHangDAO loaiHangDAO;
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
	@RequestMapping("/")
	public String indexPage(Model model) {
		List<HangInfo> hang = hangDAO.loadHang();
		List<LoaiHangInfo> loaiHang =loaiHangDAO.loadMenu();
		model.addAttribute("hang", hang);
		model.addAttribute("loaiHang", loaiHang);
		return "Index";
	}
	// hai cái đều trỏ về một cái là / thì nó nhận cái nào....
	// một là xóa hai là thay đổi 1 trong 2
	
	
	@RequestMapping("/")
	public String loadMenuLoai(Model model) {
		List<HangInfo> hang = hangDAO.loadHang();
		List<LoaiHangInfo> loaiHang =loaiHangDAO.loadMenu();
		model.addAttribute("hang", hang);
		model.addAttribute("loaiHang", loaiHang);
		return "Index";
	}
}
