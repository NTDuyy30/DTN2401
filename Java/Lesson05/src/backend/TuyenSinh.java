package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.exercise1.ITuyenSinh;
import entity.exercise1.ThiSinh;

public class TuyenSinh implements ITuyenSinh {
	private static List<ThiSinh> list = new ArrayList<>();

	public TuyenSinh() {

	}

	@Override
	public void themTS() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Thêm mới thí sinh");
		System.out.print("\tNhập số báo danh: ");
		int sbd = sc.nextInt();
		System.out.print("\tNhập họ tên: ");
		sc.nextLine();
		String hoTen = sc.nextLine();
		System.out.print("\tNhập địa chỉ: ");
		String diaChi = sc.nextLine();
		System.out.print("\tNhập mức ưu tiên: ");
		String mucUuTien = sc.nextLine();
		String khoi;
		do {
			System.out.print("\tNhập khối thi (A, B hoặc C): ");
			khoi = sc.next();
			if (!(khoi.equalsIgnoreCase("A") || khoi.equalsIgnoreCase("B") || khoi.equalsIgnoreCase("C"))) {
				System.out.println("Bạn chỉ được nhập 1 trong 3 khối thi A, B, C");
			}
		} while (!(khoi.equalsIgnoreCase("A") || khoi.equalsIgnoreCase("B") || khoi.equalsIgnoreCase("C")));
		ThiSinh ts = new ThiSinh(sbd, hoTen, diaChi, mucUuTien, khoi);
		list.add(ts);
		System.out.println("=> Thêm mới thành công!!!");
	}

	@Override
	public void hienThiTS() {
		System.out.println("=======================Thông tin thí sinh=======================");
		for (ThiSinh ts : list) {
			System.out.println(ts);
		}
	}

	@Override
	public void timKiemTS() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số báo danh của thí sinh muốn tìm: ");
		int sbd = sc.nextInt();
		byte count = 0;
		for (ThiSinh ts : list) {
			if (ts.getSoBaoDanh() == sbd) {
				System.out.println(ts);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("=> Không tìm thấy thí sinh nào có số báo danh này");
		} else {
			System.out.println("=> Tìm được " + count + " thí sinh");
		}
	}

	@Override
//	public void xoaTS() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhập số báo danh của thí sinh muốn xóa: ");
//		int delSBD = sc.nextInt();
//		if (list.removeIf(ThiSinh -> ThiSinh.getSoBaoDanh() == delSBD)) {
//			System.out.println("=> Đã xóa thành công");
//		} else {
//			System.out.println("=> Không tồn tại sinh viên có số báo danh này");
//		}
//	}

	public void xoaTS() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số báo danh của thí sinh muốn xóa: ");
		int delSBD = sc.nextInt();
		byte count = 0;
		for (byte i = 0; i < list.size(); i++) {
			if (list.get(i).getSoBaoDanh() == delSBD) {
				list.remove(i);
				i--;
				count++;
			}
		}
		System.out.println(count == 0 ? "=> Không tồn tại sinh viên có số báo danh này"
				: "=> Đã xóa thành công " + count + " thí sinh");
	}

	public static void menu() {
		System.out.println("\n===================================Quản lý thí sinh==================================");
		String leftAlignFormat = "| %-72s |%n";
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format("|                               Hãy lựa chọn                               |%n");
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format(leftAlignFormat, "1. Thêm mới thí sinh");
		System.out.format(leftAlignFormat, "2. Hiện thị thông tin của thí sinh và khối thi của thí sinh");
		System.out.format(leftAlignFormat, "3. Tìm kiếm theo số báo danh");
		System.out.format(leftAlignFormat, "4. Xóa thí sinh theo số báo danh");
		System.out.format(leftAlignFormat, "5. Thoát khỏi chương trình");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}
}
