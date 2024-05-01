package com.vti.entity.Exercise5;

public class CongNhan extends CanBo {
	private byte bac;

	public CongNhan(String hoTen, byte tuoi, GioiTinh gioiTinh, String diaChi, byte bac) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.bac = bac;
	}

	public byte getBac() {
		return bac;
	}

	public void setBac(byte bac) {
		this.bac = bac;
	}

	@Override
	public String toString() {
		return "CongNhan [bac=" + bac + ", toString()=" + super.toString() + "]";
	}

}
