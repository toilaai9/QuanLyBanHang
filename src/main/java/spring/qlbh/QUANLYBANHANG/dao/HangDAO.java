package spring.qlbh.QUANLYBANHANG.dao;

import java.util.List;

import javax.transaction.Transactional;

import spring.qlbh.QUANLYBANHANG.model.HangInfo;

@Transactional
public interface HangDAO {
	public List<HangInfo> loadHang();
	public List<HangInfo> loadHangTheoLoai(int maLoai);
	public List<HangInfo> loadHangTheoId(int maHang);
}
