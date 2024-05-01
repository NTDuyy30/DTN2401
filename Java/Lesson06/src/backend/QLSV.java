package backend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entity.SinhVien;

public class QLSV {
	private static List<SinhVien> listSV = new ArrayList<>();

	public QLSV() {

	}

	public void themSV() {
		String[] ho = { "Nguyễn", "Trần", "Lê", "Phạm", "Vũ", "Ngô", "Ma" };
		String[] tenDem = { "Tiến", "Đức", "Việt", "Phương", "Thu", "Thị", "Văn" };
		String[] ten = { "Duy", "Bo", "Dũng", "Nga", "Hoài", "Hiếu", "Phái" };
		String[] tenDayDu = new String[10];
		for (byte i = 0; i < 7; i++) {
			tenDayDu[i] = ho[i] + " " + tenDem[i] + " " + ten[i];
		}
		tenDayDu[7] = "Nguyễn Thu Phương";
		tenDayDu[8] = "Ngô Gia Văn Phái";
		tenDayDu[9] = "Chim sun xoăn";

		String[] id = { "SV0000001", "SV0000002", "SV0000003", "SV0000004", "SV0000005", "SV0000006", "SV0000007",
				"SV0000008", "SV0000009", "SV0000010" };

		LocalDate[] dob = { LocalDate.of(1991, 2, 2), LocalDate.of(1991, 3, 2), LocalDate.of(1991, 4, 2),
				LocalDate.of(1991, 5, 2), LocalDate.of(1991, 6, 2), LocalDate.of(1991, 7, 2), LocalDate.of(1991, 8, 2),
				LocalDate.of(1991, 9, 2), LocalDate.of(1991, 10, 2), LocalDate.of(1991, 11, 2) };

//		MonHoc mh1 = new MonHoc(TenMonHoc.THIET_KE_PHAN_MEM, 9);

		for (byte i = 0; i < 10; i++) {
			listSV.add(new SinhVien(id[i], tenDayDu[i], dob[i], null));
		}
	}

	public void hienThiSV() {
		for (SinhVien sv : listSV) {
			System.out.println(sv);
		}
	}
}
