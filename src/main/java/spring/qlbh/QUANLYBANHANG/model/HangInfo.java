package spring.qlbh.QUANLYBANHANG.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class HangInfo {
	private int maHang;
	private String tenHang;
	private int donGia;
	private String imageLink;
	private float vAT;
	private int maLoai;
	private String nhaSX;
	private String ngaySX;
	private String tGBaoHanh;
	private String tTThem;
	private int soLuongHang;
	private int trangThaiHang;
	private CommonsMultipartFile anh;
	public HangInfo(int maHang, String tenHang, int donGia, String imageLink, float vAT, int maLoai, String nhaSX,
			String ngaySX, String tGBaoHanh, String tTThem, int soLuongHang, int trangThaiHang) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.imageLink = imageLink;
		this.vAT = vAT;
		this.maLoai = maLoai;
		this.nhaSX = nhaSX;
		this.ngaySX = ngaySX;
		this.tGBaoHanh = tGBaoHanh;
		this.tTThem = tTThem;
		this.soLuongHang = soLuongHang;
		this.trangThaiHang = trangThaiHang;
	}
	
	public HangInfo(CommonsMultipartFile anh) {
		super();
		this.anh = anh;
	}

	public HangInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaHang() {
		return maHang;
	}
	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public String getImageLink() {
		return imageLink;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	public float getvAT() {
		return vAT;
	}
	public void setvAT(float vAT) {
		this.vAT = vAT;
	}
	public int getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}
	public String getNhaSX() {
		return nhaSX;
	}
	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}
	public String getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(String ngaySX) {
		this.ngaySX = ngaySX;
	}
	public String gettGBaoHanh() {
		return tGBaoHanh;
	}
	public void settGBaoHanh(String tGBaoHanh) {
		this.tGBaoHanh = tGBaoHanh;
	}
	public String gettTThem() {
		return tTThem;
	}
	public void settTThem(String tTThem) {
		this.tTThem = tTThem;
	}
	public int getSoLuongHang() {
		return soLuongHang;
	}
	public void setSoLuongHang(int soLuongHang) {
		this.soLuongHang = soLuongHang;
	}
	public int getTrangThaiHang() {
		return trangThaiHang;
	}
	public void setTrangThaiHang(int trangThaiHang) {
		this.trangThaiHang = trangThaiHang;
	}

	public CommonsMultipartFile getAnh() {
		return anh;
	}

	public void setAnh(CommonsMultipartFile anh) {
		this.anh = anh;
	}
	
	
}
