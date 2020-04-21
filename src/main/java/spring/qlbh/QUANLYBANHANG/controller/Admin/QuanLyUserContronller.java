package spring.qlbh.QUANLYBANHANG.controller.Admin;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
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

import spring.qlbh.QUANLYBANHANG.dao.UserDAO;
import spring.qlbh.QUANLYBANHANG.model.HangInfo;
import spring.qlbh.QUANLYBANHANG.model.UserInfo;

@Controller(value = "QuanLyUserController")
@RequestMapping(value = "/admin/user")
public class QuanLyUserContronller {
	@Autowired
	private UserDAO userDao;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		Object target = dataBinder.getTarget();
		if (target == null) {
			return;
		}
		System.out.println("Target=" + target);

		if (target.getClass() == UserInfo.class) {

			// Ä�Äƒng kÃ½ Ä‘á»ƒ chuyá»ƒn Ä‘á»•i giá»¯a cÃ¡c Ä‘á»‘i tÆ°á»£ng multipart thÃ nh byte[]
			dataBinder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
		}
	}

	@RequestMapping("/delete")
	public String actionDelete(Model model, HttpServletRequest request, HttpSession session) {
		int id = Integer.parseInt(request.getParameter("id"));
		userDao.xoaUser(id);
		session.setAttribute("mess", "Xoa thanh cong!");
		return "redirect:/admin/user";
	}

	@RequestMapping("/add")
	public String addUser(Model model, HttpServletRequest request, HttpSession session,
			@ModelAttribute("userInfo") UserInfo userInfo) {

		return "admin/addUser";
	}

	@RequestMapping(value = "/add/themu", method = RequestMethod.POST)
	public String themuser(Model model, HttpServletRequest request, @ModelAttribute("userInfo") UserInfo userInfo) {
		
		Random rand = new Random();
		int id = rand.nextInt(1000);
		String userName = userInfo.getUserName();
		String password = userInfo.getPassWord();
		String hoTen = userInfo.getHoTen();
	
		String diaChi = userInfo.getDiaChi();
		String sDT = userInfo.getsDT();
		String loai = userInfo.getLoai();

		CommonsMultipartFile fileDatas = userInfo.getAnhuser();

		// TÃªn file gá»‘c táº¡i Client.
		String img = fileDatas.getOriginalFilename();

		UserInfo user = new UserInfo(id, userName, password, hoTen, img, diaChi, sDT, loai);
		// call goi ham insert
		userDao.insertUser(user);
		// call up file.
		doUpload(request, userInfo);
		

		return "redirect:/admin/user";
	}

	private void doUpload(HttpServletRequest request, //
			UserInfo userInfo) {

// ThÆ° má»¥c gá»‘c upload file.
		String uploadRootPath = request.getServletContext().getRealPath("/") + "template/client/img";
		System.out.println("uploadRootPath=" + uploadRootPath);

		File uploadRootDir = new File(uploadRootPath);
//
// Táº¡o thÆ° má»¥c gá»‘c upload náº¿u nÃ³ khÃ´ng tá»“n táº¡i.
		if (!uploadRootDir.exists()) {
			uploadRootDir.mkdirs();
		}
		CommonsMultipartFile fileDatas = userInfo.getAnhuser();
//
		List<File> uploadedFiles = new ArrayList<File>();

// TÃªn file gá»‘c táº¡i Clientg
		String name = fileDatas.getOriginalFilename();
		System.out.println("Client File Name = " + name);

		if (name != null && name.length() > 0) {
			try {
				// Táº¡o file táº¡i Server.
				File serverFile = new File(uploadRootDir.getAbsolutePath() + File.separator + name);

				// Luá»“ng ghi dá»¯ liá»‡u vÃ o file trÃªn Server.
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
