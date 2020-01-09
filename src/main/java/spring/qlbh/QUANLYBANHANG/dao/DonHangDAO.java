package spring.qlbh.QUANLYBANHANG.dao;
import java.util.List;

import javax.transaction.Transactional;

import spring.qlbh.QUANLYBANHANG.model.DonHangInfo;
@Transactional
public interface DonHangDAO {
	public List<DonHangInfo> loadDonHang();
}
