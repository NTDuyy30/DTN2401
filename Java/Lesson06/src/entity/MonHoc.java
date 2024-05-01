package entity;

public class MonHoc {
	public enum TenMonHoc {
		PHAN_TICH_YEU_CAU, THIET_KE_PHAN_MEM, LAP_TRINH_JAVA, CODE_VA_UNIT_TEST, MANAGEMENT_TOOL;
	}

	private TenMonHoc ten;
	private float diem;

	public MonHoc(TenMonHoc ten, float diem) {
		this.ten = ten;
		this.diem = diem;
	}

}
