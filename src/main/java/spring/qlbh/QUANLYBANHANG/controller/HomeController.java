package spring.qlbh.QUANLYBANHANG.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@RequestMapping("/chitiet")
	public String chiTietHang(Model model, HttpServletRequest request) {
		int maHang=Integer.parseInt(request.getParameter("id"));
		List<HangInfo> hang = hangDAO.loadHangTheoId(maHang);
		model.addAttribute("hang_chitiet", hang);
		// lấy đc id rồi đó.
		return "ChiTietHang";
	}
	//cách khác
	/*
	 * @RequestMapping("/chitiet") public String chiTietHang1(Model model,
	 * RequestParam("id") int maHang) {
	 * 
	 * // lấy đc id rồi đó. // có maHang roi ong viet cl sql là ok. return
	 * "ChiTietHang"; }
	 */
	@RequestMapping("/thanhtoan")
	public String thanhToan(Model model) {
		return "ThanhToan";
	}
}
