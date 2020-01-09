package spring.qlbh.QUANLYBANHANG.controller.Admin;

import java.util.Calendar;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.qlbh.QUANLYBANHANG.dao.HangDAO;
import spring.qlbh.QUANLYBANHANG.dao.LoaiHangDAO;
import spring.qlbh.QUANLYBANHANG.model.HangInfo;
import spring.qlbh.QUANLYBANHANG.model.LoaiHangInfo;

@Controller(value = "QuanLyHangController")
@RequestMapping(value = "/admin/hang")
public class QuanLyHangController {
	@Autowired
	private HangDAO hangDAO;
	@Autowired
	private LoaiHangDAO loaiHangDAO;
//	@RequestMapping("/delete")
//	public String deleteHang(Model model, HttpServletRequest request,HttpSession session ) {
//		int id= Integer.parseInt(request.getParameter("id"));
////		hangDAO.xoaHang̣̣̣̣̣(id);
//		session.setAttribute("mess", "Xoa thanh cong!");
//		return "admin";
//	}
	@RequestMapping(value = "/addhang")
	public String themhang(Model model) {
		List<LoaiHangInfo> loaiHang =loaiHangDAO.loadMenu();
		model.addAttribute("loaiHang", loaiHang);
		return "admin/addHang";
	}
	@RequestMapping(value = "/addhang/them", method = RequestMethod.POST)
	public String addHang(Model model,HttpServletRequest request) {
		boolean kt=false;
		Random rand = new Random();
		Calendar cal = Calendar.getInstance();
		int maHang =rand.nextInt(1000); 
		String tenHang=request.getParameter("txttenhang");
		int donGia=Integer.parseInt(request.getParameter("txtdongia"));
		float vat=Float.parseFloat(request.getParameter("txtvat"));
		int loai=Integer.parseInt(request.getParameter("maloai"));
		String nhaSX=request.getParameter("txtnhasx");
		String ttThem=request.getParameter("txtttthem");
		int soLuong=Integer.parseInt(request.getParameter("txtsoluong"));
		int trangThai=Integer.parseInt(request.getParameter("trangthai"));
		String tGBaoHanh=request.getParameter("txttgbaohanh");
		String ngaySX=request.getParameter("txtngaysx");
		String imageLink="nam";
		if(hangDAO.loadHangTheoTen(tenHang)==null) {
			HangInfo hangInfo= new HangInfo(maHang, tenHang, donGia, imageLink, vat, loai, nhaSX, ngaySX, tGBaoHanh, ttThem, soLuong, trangThai);
			hangDAO.insertHang(hangInfo);
			kt=true;
		}
		else {
			 kt=false;
		}
		
		return "redirect:/admin/hang";
	}
	
}
