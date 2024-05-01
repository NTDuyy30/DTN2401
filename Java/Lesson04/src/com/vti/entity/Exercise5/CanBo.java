package com.vti.entity.Exercise5;

public class CanBo {
	public enum GioiTinh {
		NAM, Nữ, Khác;
	}

//	Properties
	private String hoTen;
	private byte tuoi;
	private GioiTinh gioiTinh;
	private String diaChi;

//	Constructor
	public CanBo(String hoTen, byte tuoi, GioiTinh gioiTinh, String diaChi) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

//	Method get, set
	public String getHoTen() {
		return hoTen;
	}

	public byte getTuoi() {
		return tuoi;
	}

	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setTuoi(byte tuoi) {
		this.tuoi = tuoi;
	}

	public void setGioiTinh(GioiTinh gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "CanBo [hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + "]";
	}

}
