package spring.qlbh.QUANLYBANHANG.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import spring.qlbh.QUANLYBANHANG.dao.DonHangDAO;
import spring.qlbh.QUANLYBANHANG.entity.DonHang;
import spring.qlbh.QUANLYBANHANG.model.DonHangInfo;

public class DonHangDAOImpl implements DonHangDAO{
	@Autowired
	private SessionFactory sessionfactory;
	@Override
	public List<DonHangInfo> loadDonHang() {
		Session session = sessionfactory.getCurrentSession();
		String sql = " select new  " + DonHangInfo.class.getName()
				+ " (dh.maDH,dh.ngayDatHang,dh.tongTien,dh.tenNguoiNhan,dh.email,dh.diaChiNhanHang,dh.sDT,dh.ghiChu,dh.trangThai,dh.id)"
				+ " from " + DonHang.class.getName() + " dh " + " where dh.trangThai=1"; 
		Query query = session.createQuery(sql);
		return query.list();
	}
}
