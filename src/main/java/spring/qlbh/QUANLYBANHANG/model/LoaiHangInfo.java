package spring.qlbh.QUANLYBANHANG.model;

public class LoaiHangInfo {
	private int maLoai;
	private String tenLoai;
	
	public LoaiHangInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoaiHangInfo(int maLoai, String tenLoai) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
	}

	public int getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	
	
}
