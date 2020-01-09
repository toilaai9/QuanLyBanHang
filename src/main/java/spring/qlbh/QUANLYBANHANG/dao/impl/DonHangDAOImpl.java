package spring.qlbh.QUANLYBANHANG.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import spring.qlbh.QUANLYBANHANG.dao.DonHangDAO;
import spring.qlbh.QUANLYBANHANG.entity.DonHang;
import spring.qlbh.QUANLYBANHANG.model.DonHangInfo;

public class DonHangDAOImpl implements DonHangDAO{
	@Autowired
	private SessionFactory sessionfactory;
	public void insertDH(DonHangInfo donhang) {
		Session session = sessionfactory.getCurrentSession();
		DonHang donHangEntity = new DonHang();
		donHangEntity.setMaDH(donhang.getMaDH());
		donHangEntity.setNgayDatHang(donhang.getNgayDatHang());
		donHangEntity.setTongTien(donhang.getTongTien());
		donHangEntity.setTenNguoiNhan(donhang.getTenNguoiNhan());
		donHangEntity.setEmail(donhang.getEmail());
		donHangEntity.setDiaChiNhanHang(donhang.getDiaChiNhanHang());
		donHangEntity.setsDT(donhang.getsDT());
		donHangEntity.setGhiChu(donhang.getGhiChu());
		donHangEntity.setTrangThai(donhang.getTrangThai());
		donHangEntity.setId(donhang.getId());

		session.persist(donHangEntity);
	}
}
