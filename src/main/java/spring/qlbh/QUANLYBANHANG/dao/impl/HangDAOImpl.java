package spring.qlbh.QUANLYBANHANG.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
					+" (h.maHang, h.tenHang, h.donGia, h.imageLink, h.vAT, h.maLoai, h.nhaSX, h.ngaySX, h.tGBaoHanh, h.tTThem, h.soLuongHang, h.trangThaiHang) " // các trường trong đối tượng HangInfo
					+" from " + Hang.class.getName() + " h "; // để ý chỗ này, chỗ này phải cách ra, chứ k nó lỗi
		Query query = session.createQuery(sql);
		return query.list();
	}
	//load hàng theo loại
	@Override
	public List<HangInfo> loadHangTheoLoai(int maLoai){
		Session session = sessionfactory.getCurrentSession();
		String sql = " select new  " + HangInfo.class.getName()
					+" ( h.maHang, h.tenHang, h.donGia, h.imageLink, h.vAT, h.maLoai, h.nhaSX, h.ngaySX, h.tGBaoHanh, h.tTThem, h.soLuongHang, h.trangThaiHang) " // các trường trong đối tượng HangInfo
					+" from " + Hang.class.getName() + " h "+"where h.maLoai=: maLoai "; // select bàng Hibernate thì nó trả về 1 đối tượng
		Query query = session.createQuery(sql);
		query.setParameter("maLoai", maLoai);
		return query.list();
	}
	@Override
	public List<HangInfo> loadHangTheoId(int maHang){
		Session session = sessionfactory.getCurrentSession();
		String sql = " select new  " + HangInfo.class.getName()
					+" ( h.maHang, h.tenHang, h.donGia, h.imageLink, h.vAT, h.maLoai, h.nhaSX, h.ngaySX, h.tGBaoHanh, h.tTThem, h.soLuongHang, h.trangThaiHang) " 
					+" from " + Hang.class.getName() + " h "+"where h.maHang=: maHang ";
		Query query = session.createQuery(sql);
		query.setParameter("maHang", maHang);
		return query.list();
	}
}
