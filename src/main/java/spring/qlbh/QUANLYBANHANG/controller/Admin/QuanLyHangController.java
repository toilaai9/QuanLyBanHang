package spring.qlbh.QUANLYBANHANG.controller.Admin;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

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

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		Object target = dataBinder.getTarget();
		if (target == null) {
			return;
		}
		System.out.println("Target=" + target);

		if (target.getClass() == HangInfo.class) {

			// Đăng ký để chuyển đổi giữa các đối tượng multipart thành byte[]
			dataBinder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
		}
	}

//	@RequestMapping("/delete")
//	public String deleteHang(Model model, HttpServletRequest request,HttpSession session ) {
//		int id= Integer.parseInt(request.getParameter("id"));
////		hangDAO.xoaHangÌ£Ì£Ì£Ì£Ì£(id);
//		session.setAttribute("mess", "Xoa thanh cong!");
//		return "admin";
//	}
	@RequestMapping(value = "/addhang")
	public String themhang(Model model) {
		List<LoaiHangInfo> loaiHang = loaiHangDAO.loadMenu();
		HangInfo hangInfo = new HangInfo();
		model.addAttribute("hangInfo", hangInfo);
		model.addAttribute("loaiHang", loaiHang);
		return "admin/addHang";
	}

	@RequestMapping(value = "/addhang/them", method = RequestMethod.POST)
	public String addHang(Model model, HttpServletRequest request, @ModelAttribute("hangInfo") HangInfo hangInfo) {

		boolean kt = false;
		Random rand = new Random();

		int maHang = rand.nextInt(1000);
		String tenHang = hangInfo.getTenHang();
		int donGia = hangInfo.getDonGia();
		float vat = hangInfo.getvAT();
		int loai = hangInfo.getMaLoai();
		String nhaSX = hangInfo.getNhaSX();

		String ttThem = hangInfo.gettTThem();
		int soLuong = hangInfo.getSoLuongHang();
		int trangThai = hangInfo.getTrangThaiHang();
		String tGBaoHanh = hangInfo.gettGBaoHanh();
		String ngaySX = hangInfo.getNgaySX();
		
		CommonsMultipartFile fileDatas = hangInfo.getAnh();

			// Tên file gốc tại Client.
		String imageLink = fileDatas.getOriginalFilename();
		if (hangDAO.loadHangTheoTen(tenHang) == null) {
			HangInfo hang = new HangInfo(maHang, tenHang, donGia, imageLink, vat, loai, nhaSX, ngaySX, tGBaoHanh,
					ttThem, soLuong, trangThai);
			//call goi ham insert
			hangDAO.insertHang(hang);
			//call up file.
			doUpload(request, hangInfo);
			kt = true;
		} else {
			kt = false;
		}

		return "redirect:/admin/hang";
	}

	private void doUpload(HttpServletRequest request, //
			HangInfo hangInfo) {

// Thư mục gốc upload file.
		String uploadRootPath = request.getServletContext().getRealPath("/") + "template/client/img";
		System.out.println("uploadRootPath=" + uploadRootPath);

		File uploadRootDir = new File(uploadRootPath);
//
// Tạo thư mục gốc upload nếu nó không tồn tại.
		if (!uploadRootDir.exists()) {
			uploadRootDir.mkdirs();
		}
		CommonsMultipartFile fileDatas = hangInfo.getAnh();
//
		List<File> uploadedFiles = new ArrayList<File>();

// Tên file gốc tại Clientg
		String name = fileDatas.getOriginalFilename();
		System.out.println("Client File Name = " + name);

		if (name != null && name.length() > 0) {
			try {
				// Tạo file tại Server.
				File serverFile = new File(uploadRootDir.getAbsolutePath() + File.separator + name);

				// Luồng ghi dữ liệu vào file trên Server.
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(fileDatas.getBytes());
				stream.close();
				//
				uploadedFiles.add(serverFile);
				System.out.println("Write file: " + serverFile);
			} catch (Exception e) {
				System.out.println("Error Write file: " + name);
			}
		}

	}

}
