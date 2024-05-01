package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Exercise5.CanBo;
import com.vti.entity.Exercise5.CanBo.GioiTinh;
import com.vti.entity.Exercise5.CongNhan;
import com.vti.entity.Exercise5.KySu;
import com.vti.entity.Exercise5.NhanVien;

public class QLCB {
	private ArrayList<CanBo> list;

	public QLCB() {
		this.list = new ArrayList<>();
	}

	public void themCB() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bạn muốn thêm mới ai?");
		System.out.println("1. Công nhân");
		System.out.println("2. Kỹ sư");
		System.out.println("3. Nhân viên");
		byte choice = -1;
		choice = sc.nextByte();
		switch (choice) {
		case 1:
			System.out.print("\tNhập họ tên công nhân: ");
			sc.nextLine();
			String hoTen = sc.nextLine();

			System.out.print("\tNhập tuổi: ");
			byte tuoi = sc.nextByte();

			System.out.println("\tChọn giới tính: ");
			System.out.println("\t\t1. Nam");
			System.out.println("\t\t2. Nữ");
			System.out.println("\t\t3. Khác");
			byte gt = sc.nextByte();
			GioiTinh gioiTinh = null;
			if (gt == 1) {
				gioiTinh = GioiTinh.NAM;
			} else if (gt == 2) {
				gioiTinh = GioiTinh.Nữ;
			} else {
				gioiTinh = GioiTinh.Khác;
			}

			System.out.print("\tNhập địa chỉ công nhân: ");
			sc.nextLine();
			String diaChi = sc.nextLine();

			System.out.print("\tNhập bậc công nhân (1-10): ");
			byte bac = sc.nextByte();

//			Tạo công nhân mới
			CanBo cn = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
			list.add(cn);
			break;
		case 2:
			System.out.print("\tNhập họ tên kỹ sư: ");
			sc.nextLine();
			String hoTenKS = sc.nextLine();

			System.out.print("\tNhập tuổi: ");
			byte tuoiKS = sc.nextByte();

			System.out.println("\tChọn giới tính: ");
			System.out.println("\t\t1. Nam");
			System.out.println("\t\t2. Nữ");
			System.out.println("\t\t3. Khác");
			byte gtKS = sc.nextByte();
			GioiTinh gioiTinhKS = null;
			if (gtKS == 1) {
				gioiTinhKS = GioiTinh.NAM;
			} else if (gtKS == 2) {
				gioiTinhKS = GioiTinh.Nữ;
			} else {
				gioiTinhKS = GioiTinh.Khác;
			}

			System.out.print("\tNhập địa chỉ công nhân: ");
			sc.nextLine();
			String diaChiKS = sc.nextLine();

			System.out.print("\tNhập ngành đào tạo kỹ sư: ");
			String nganh = sc.nextLine();

//			Tạo công nhân mới
			CanBo ks = new KySu(hoTenKS, tuoiKS, gioiTinhKS, diaChiKS, nganh);
			list.add(ks);
			break;
		case 3:
			System.out.print("\tNhập họ tên nhân viên: ");
			sc.nextLine();
			String hoTenNV = sc.nextLine();

			System.out.print("\tNhập tuổi: ");
			byte tuoiNV = sc.nextByte();

			System.out.println("\tChọn giới tính: ");
			System.out.println("\t\t1. Nam");
			System.out.println("\t\t2. Nữ");
			System.out.println("\t\t3. Khác");
			byte gtNV = sc.nextByte();
			GioiTinh gioiTinhNV = null;
			if (gtNV == 1) {
				gioiTinhNV = GioiTinh.NAM;
			} else if (gtNV == 2) {
				gioiTinhNV = GioiTinh.Nữ;
			} else {
				gioiTinhNV = GioiTinh.Khác;
			}

			System.out.print("\tNhập địa chỉ nhân viên: ");
			sc.nextLine();
			String diaChiNV = sc.nextLine();

			System.out.print("\tNhập công việc nhân viên: ");
			String congViec = sc.nextLine();

//			Tạo công nhân mới
			CanBo nv = new NhanVien(hoTenNV, tuoiNV, gioiTinhNV, diaChiNV, congViec);
			list.add(nv);
			break;
		}
		sc.close();
	}

	public void hienThiDanhSach() {
		for (CanBo l : this.list) {
			System.out.println(l);
		}
	}

	public void timKiemTheoTen() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào tên muốn tìm kiếm: ");
		String name = sc.nextLine();
		for (CanBo cb : list) {
			if (cb.getHoTen().equals(name)) {
				System.out.println(cb);
			}
		}
		sc.close();
	}

	public void xoaCB() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào tên muốn xóa: ");
		String name = sc.nextLine();
		list.removeIf(CanBo -> CanBo.getHoTen().equals(name));
		sc.close();
	}

	public void menu() {
		System.out.println("\n===============================Quản lý cán bộ===============================");
		String leftAlignFormat = "| %-72s |%n";
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format("|                               Mời bạn chọn                               |%n");
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format(leftAlignFormat, "1. Thêm mới cán bộ");
		System.out.format(leftAlignFormat, "2. Tìm kiếm theo họ tên");
		System.out.format(leftAlignFormat, "3. Hiển thị thông tin về danh sách các cán bộ");
		System.out.format(leftAlignFormat, "4. Nhập vào tên của cán bộ và delete cán bộ đó");
		System.out.format(leftAlignFormat, "5. Thoát khỏi chương trình");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}
}
