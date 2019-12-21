package spring.qlbh.QUANLYBANHANG.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hang")
public class Hang {
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
	@Id
	@Column(name="MAHANG")
	public int getMaHang() {
		return maHang;
	}
	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}
	@Column(name="TENHANG")
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	@Column(name="DONGIA")
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	@Column(name="IMAGELINK")
	public String getImageLink() {
		return imageLink;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	@Column(name="VAT")
	public float getvAT() {
		return vAT;
	}
	public void setvAT(float vAT) {
		this.vAT = vAT;
	}
	@Column(name="MALOAI")
	public int getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}
	@Column(name="NHASX")
	public String getNhaSX() {
		return nhaSX;
	}
	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}
	@Column(name="NGAYSX")
	public String getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(String ngaySX) {
		this.ngaySX = ngaySX;
	}
	@Column(name="TGBAOHANH")
	public String gettGBaoHanh() {
		return tGBaoHanh;
	}
	public void settGBaoHanh(String tGBaoHanh) {
		this.tGBaoHanh = tGBaoHanh;
	}
	@Column(name="TTTHEM")
	public String gettTThem() {
		return tTThem;
	}
	public void settTThem(String tTThem) {
		this.tTThem = tTThem;
	}
	@Column(name="SOLUONGHANG")
	public int getSoLuongHang() {
		return soLuongHang;
	}
	public void setSoLuongHang(int soLuongHang) {
		this.soLuongHang = soLuongHang;
	}
	@Column(name="TRANGTHAIHANG")
	public int getTrangThaiHang() {
		return trangThaiHang;
	}
	public void setTrangThaiHang(int trangThaiHang) {
		this.trangThaiHang = trangThaiHang;
	}
	
	
}
