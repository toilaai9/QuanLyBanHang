package spring.qlbh.QUANLYBANHANG.dao;

import java.util.List;

import javax.transaction.Transactional;

import spring.qlbh.QUANLYBANHANG.model.DanhSachHang;

@Transactional
public interface DongDonHangDAO {
	public List<DanhSachHang> XemDonHang(int maDH);
}
