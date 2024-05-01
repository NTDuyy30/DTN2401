package entity.exercise1;

public class ThiSinh {
	private int soBaoDanh;
	private String hoTen;
	private String diaChi;
	private String mucUuTien;
	private String khoi;
	private String monThi;

	public ThiSinh() {

	}

	public ThiSinh(int soBaoDanh, String hoTen, String diaChi, String mucUuTien, String khoi) {
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
		this.khoi = khoi;
		if (this.khoi.equalsIgnoreCase("A")) {
			this.monThi = "Toán, Lý, Hóa";
		} else if (this.khoi.equalsIgnoreCase("B")) {
			this.monThi = "Toán, Hóa, Sinh";
		} else {
			this.monThi = "Văn, Sử, Địa";
		}
	}

	public int getSoBaoDanh() {
		return soBaoDanh;
	}

	public void setSoBaoDanh(int soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMucUuTien() {
		return mucUuTien;
	}

	public void setMucUuTien(String mucUuTien) {
		this.mucUuTien = mucUuTien;
	}

	public String getKhoi() {
		return khoi;
	}

	public void setKhoi(String khoi) {
		this.khoi = khoi;
	}

	public String getMonThi() {
		return this.monThi;
	}

	public void setMonThi() {
		if (this.khoi.equals("A")) {
			this.monThi = "Toán, Lý, Hóa";
		} else if (this.khoi.equals("B")) {
			this.monThi = "Toán, Hóa, Sinh";
		} else {
			this.monThi = "Văn, Sử, Địa";
		}
	}

	@Override
	public String toString() {
		return "ThiSinh [soBaoDanh=" + soBaoDanh + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", mucUuTien="
				+ mucUuTien + ", khoi=" + khoi + ", monThi=" + monThi + "]";
	}

}
