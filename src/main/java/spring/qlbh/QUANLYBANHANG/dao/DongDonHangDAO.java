package spring.qlbh.QUANLYBANHANG.dao;

import org.springframework.transaction.annotation.Transactional;

import spring.qlbh.QUANLYBANHANG.model.DonHangInfo;
import spring.qlbh.QUANLYBANHANG.model.DongDonHangInfo;

@Transactional
public interface DongDonHangDAO {
	public void insertDH(DongDonHangInfo dongdonhang);
}
