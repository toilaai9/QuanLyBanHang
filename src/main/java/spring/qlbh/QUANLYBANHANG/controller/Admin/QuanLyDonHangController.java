package spring.qlbh.QUANLYBANHANG.controller.Admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.qlbh.QUANLYBANHANG.dao.DongDonHangDAO;
import spring.qlbh.QUANLYBANHANG.entity.DongDonHang;
import spring.qlbh.QUANLYBANHANG.model.DanhSachHang;
import spring.qlbh.QUANLYBANHANG.model.DonHangInfo;

@Controller(value = "QuanLyDonHangController")
@RequestMapping(value = "/admin/donhang")
public class QuanLyDonHangController {
	@Autowired
	private DongDonHangDAO ddHang;
	@RequestMapping(value = "/xemdonhang")
	public String xemDonHang(Model model,HttpServletRequest request) {
		int maDH=Integer.parseInt(request.getParameter("maDH"));
		List<DanhSachHang> dsdonhang = ddHang.XemDonHang(maDH);
		model.addAttribute("dsdonHang", dsdonhang);	
		return "admin/XemDonHang";
		
	}
}
