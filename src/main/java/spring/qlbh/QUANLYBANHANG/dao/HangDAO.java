package spring.qlbh.QUANLYBANHANG.dao;

import java.util.List;

import javax.transaction.Transactional;

import spring.qlbh.QUANLYBANHANG.entity.Hang;
import spring.qlbh.QUANLYBANHANG.model.HangInfo;


@Transactional
public interface HangDAO {
	public List<HangInfo> loadHang();
	public List<HangInfo> loadHangTheoLoai(int maLoai);
	public HangInfo loadHangTheoTen(String tenHang);
	public HangInfo loadHangTheoId(int maHang);
	public void insertHang(HangInfo hangInfo);
	public void uploadHang(HangInfo hangInfo);
<<<<<<< HEAD
	public Hang findHang(int maHang);
	public void xoaHang(int maHang);
	public void suaHang(int maHang);
=======
	public List<HangInfo> timKiemHangTheoTen(String tenHang);
	public List<HangInfo> timKiemHangTheoNXS(String tenNSX);
>>>>>>> 954d58d93d679435b551805b586c1aff26b9ed8d
	
}
