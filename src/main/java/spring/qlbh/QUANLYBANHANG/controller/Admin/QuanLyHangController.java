package spring.qlbh.QUANLYBANHANG.controller.Admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.qlbh.QUANLYBANHANG.dao.HangDAO;
import spring.qlbh.QUANLYBANHANG.dao.LoaiHangDAO;
import spring.qlbh.QUANLYBANHANG.model.LoaiHangInfo;

@Controller(value = "QuanLyHangController")
@RequestMapping(value = "/admin/hang")
public class QuanLyHangController {
	@Autowired
	private HangDAO hangDAO;
	@Autowired
	private LoaiHangDAO loaiHangDAO;
	@RequestMapping("/delete")
	public String deleteHang(Model model, HttpServletRequest request,HttpSession session ) {
		int id= Integer.parseInt(request.getParameter("id"));
//		hangDAO.xoaHang̣̣̣̣̣(id);
		session.setAttribute("mess", "Xoa thanh cong!");
		return "admin";
	}
	@RequestMapping("/addhang")
	public String addHang(Model model) {
		List<LoaiHangInfo> loaiHang =loaiHangDAO.loadMenu();
		model.addAttribute("loaiHang", loaiHang);
		return "admin/addHang";
	}
}
