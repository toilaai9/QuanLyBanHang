package spring.qlbh.QUANLYBANHANG.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import spring.qlbh.QUANLYBANHANG.dao.DongDonHangDAO;

import spring.qlbh.QUANLYBANHANG.entity.DongDonHang;
import spring.qlbh.QUANLYBANHANG.model.DongDonHangInfo;

public class DongDonHangDAOImpl implements DongDonHangDAO{
	@Autowired
	private SessionFactory sessionfactory;
	public void insertDH(DongDonHangInfo dongdonhang) {
		Session session = sessionfactory.getCurrentSession();
		DongDonHang dongDonHangEntity = new DongDonHang();
		dongDonHangEntity.setMaDDH(dongdonhang.getMaDDH());
		dongDonHangEntity.setSoLuong(dongdonhang.getSoLuong());
		dongDonHangEntity.setMaHang(dongdonhang.getMaHang());
		dongDonHangEntity.setMaDH(dongdonhang.getMaDH());
		

		session.persist(dongDonHangEntity);
	}
}
