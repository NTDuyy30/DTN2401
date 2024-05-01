package entity;

import java.time.LocalDate;

public class SinhVien {
	private String id;
	private String ten;
	private LocalDate dob;
	private MonHoc mon;

	public SinhVien() {

	}

	public SinhVien(String id, String ten, LocalDate dob, MonHoc mon) {
		this.id = id;
		this.ten = ten;
		this.dob = dob;
		this.mon = mon;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public MonHoc getMon() {
		return mon;
	}

	public void setMon(MonHoc mon) {
		this.mon = mon;
	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", ten=" + ten + ", dob=" + dob + ", mon=" + mon + "]";
	}

}
