package spring.qlbh.QUANLYBANHANG.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import spring.qlbh.QUANLYBANHANG.dao.HangDAO;
import spring.qlbh.QUANLYBANHANG.entity.Hang;
import spring.qlbh.QUANLYBANHANG.model.HangInfo;

public class HangDAOImpl implements HangDAO {
	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public List<HangInfo> loadHang() {
		Session session = sessionfactory.getCurrentSession();
		String sql = " select new  " + HangInfo.class.getName()
				+ " (h.maHang, h.tenHang, h.donGia, h.imageLink, h.vAT, h.maLoai, h.nhaSX, h.ngaySX, h.tGBaoHanh, h.tTThem, h.soLuongHang, h.trangThaiHang) " // cÃ¡c																																			// HangInfo
				+ " from " + Hang.class.getName() + " h "; // Ä‘á»ƒ Ã½ chá»— nÃ y, chá»— nÃ y
															// pháº£i cÃ¡ch ra, chá»© k nÃ³ lá»—i
		Query query = session.createQuery(sql);
		return query.list();
	}

	// load hÃ ng theo loáº¡i
	@Override
	public List<HangInfo> loadHangTheoLoai(int maLoai) {
		Session session = sessionfactory.getCurrentSession();
		String sql = " select new  " + HangInfo.class.getName()
				+ " ( h.maHang, h.tenHang, h.donGia, h.imageLink, h.vAT, h.maLoai, h.nhaSX, h.ngaySX, h.tGBaoHanh, h.tTThem, h.soLuongHang, h.trangThaiHang) " // cÃ¡c
																																								// trÆ°á»�ng
																																								// trong
																																								// Ä‘á»‘i
																																								// tÆ°á»£ng
																																								// HangInfo
				+ " from " + Hang.class.getName() + " h " + " where h.maLoai=: maLoai "; // select bÃ ng Hibernate
																							// thÃ¬ nÃ³ tráº£
																							// vá»� 1 Ä‘á»‘i
																							// tÆ°á»£ng
		Query query = session.createQuery(sql);
		query.setParameter("maLoai", maLoai);
		return query.list();
	}

	@Override
	public HangInfo loadHangTheoId(int maHang) {
		Session session = sessionfactory.getCurrentSession();
		String sql = " select new  " + HangInfo.class.getName()
				+ " ( h.maHang, h.tenHang, h.donGia, h.imageLink, h.vAT, h.maLoai, h.nhaSX, h.ngaySX, h.tGBaoHanh, h.tTThem, h.soLuongHang, h.trangThaiHang) "
				+ " from " + Hang.class.getName() + " h " + " where h.maHang=: maHang ";
		Query query = session.createQuery(sql);
		query.setParameter("maHang", maHang);
		return (HangInfo) query.uniqueResult();
	}

	@Override
	public HangInfo loadHangTheoTen(String tenHang) {
		Session session = sessionfactory.getCurrentSession();
		String sql = " select new  " + HangInfo.class.getName()
				+ " ( h.maHang, h.tenHang, h.donGia, h.imageLink, h.vAT, h.maLoai, h.nhaSX, h.ngaySX, h.tGBaoHanh, h.tTThem, h.soLuongHang, h.trangThaiHang) "
				+ " from " + Hang.class.getName() + " h " + " where h.tenHang=: tenHang ";
		Query query = session.createQuery(sql);
		query.setParameter("tenHang", tenHang);
		return (HangInfo) query.uniqueResult();
	}

	@Override
	public void insertHang(HangInfo hangInfo) {
		Session session = sessionfactory.getCurrentSession();
		Hang hangentity = new Hang();
		hangentity.setMaHang(hangInfo.getMaHang());
		hangentity.setTenHang(hangInfo.getTenHang());
		hangentity.setDonGia(hangInfo.getDonGia());
		hangentity.setImageLink(hangInfo.getImageLink());
		hangentity.setvAT(hangInfo.getvAT());
		hangentity.setMaLoai(hangInfo.getMaLoai());
		hangentity.setNhaSX(hangInfo.getNhaSX());
		hangentity.setNgaySX(hangInfo.getNgaySX());
		hangentity.settGBaoHanh(hangInfo.gettGBaoHanh());
		hangentity.settTThem(hangInfo.gettTThem());
		hangentity.setSoLuongHang(hangInfo.getSoLuongHang());
		hangentity.setTrangThaiHang(hangInfo.getTrangThaiHang());

		session.persist(hangentity);

	}
	@Override
	public void uploadHang(HangInfo hangInfo) {
		Session session = sessionfactory.getCurrentSession();
		Hang hangentity = new Hang();
		hangentity.setMaHang(hangInfo.getMaHang());
		hangentity.setTenHang(hangInfo.getTenHang());
		hangentity.setDonGia(hangInfo.getDonGia());
		hangentity.setImageLink(hangInfo.getImageLink());
		hangentity.setvAT(hangInfo.getvAT());
		hangentity.setMaLoai(hangInfo.getMaLoai());
		hangentity.setNhaSX(hangInfo.getNhaSX());
		hangentity.setNgaySX(hangInfo.getNgaySX());
		hangentity.settGBaoHanh(hangInfo.gettGBaoHanh());
		hangentity.settTThem(hangInfo.gettTThem());
		hangentity.setSoLuongHang(hangInfo.getSoLuongHang());
		hangentity.setTrangThaiHang(hangInfo.getTrangThaiHang());

		session.update(hangentity);

	}
//	@Override
//	public HangInfo loadHangTheoTen(String tenHang) {
//		Session session = sessionfactory.getCurrentSession();
//		String sql = " select new  " + HangInfo.class.getName()
//				+ " ( h.maHang, h.tenHang, h.donGia, h.imageLink, h.vAT, h.maLoai, h.nhaSX, h.ngaySX, h.tGBaoHanh, h.tTThem, h.soLuongHang, h.trangThaiHang) "
//				+ " from " + Hang.class.getName() + " h " + " where h.tenHang=: tenHang ";
//		Query query = session.createQuery(sql);
//		query.setParameter("tenHang", tenHang);
//		return (HangInfo) query.uniqueResult();
//	}
}
