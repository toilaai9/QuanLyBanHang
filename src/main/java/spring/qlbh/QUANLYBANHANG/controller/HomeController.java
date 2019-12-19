package spring.qlbh.QUANLYBANHANG.controller;

import java.util.List;

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
		List<HangInfo> hangTivi = hangDAO.loadHangTheoLoai(1);
		List<HangInfo> hangTaiNghe = hangDAO.loadHangTheoLoai(2);
		List<HangInfo> hangDienThoai = hangDAO.loadHangTheoLoai(3);
		List<HangInfo> hangMayTinh = hangDAO.loadHangTheoLoai(4);
		List<HangInfo> hangTuLanh = hangDAO.loadHangTheoLoai(7);
		List<HangInfo> hangMayQuat = hangDAO.loadHangTheoLoai(9);
		
		// cái nào ông load all hàng ?
		//rồi
		
		model.addAttribute("tivi", hangTivi);
		model.addAttribute("tainghe", hangTaiNghe);
		model.addAttribute("dienthoai", hangDienThoai);
		model.addAttribute("maytinh", hangMayTinh);
		model.addAttribute("tulanh", hangTuLanh);
		model.addAttribute("mayquat", hangMayQuat);
		model.addAttribute("hang", hang);
		model.addAttribute("loaiHang", loaiHang);
		return "Index";
	}
}
