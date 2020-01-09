package spring.qlbh.QUANLYBANHANG.dao;

import org.springframework.transaction.annotation.Transactional;

import spring.qlbh.QUANLYBANHANG.model.DonHangInfo;

@Transactional
public interface DonHangDAO {
	public void insertDH(DonHangInfo donhang);
	public void updateTrangThaiDH(DonHangInfo donhang,int trangThai);
	public DonHangInfo loadDonHangDT(int id,int trangThai);
}
