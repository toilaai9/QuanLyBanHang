package spring.qlbh.QUANLYBANHANG.controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllerAdmin {
	@RequestMapping("/admin")
	public String indexAdmin() {
		return "admin/Home";
	}
}

