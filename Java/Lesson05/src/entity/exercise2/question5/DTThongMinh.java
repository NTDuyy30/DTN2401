package entity.exercise2.question5;

public class DTThongMinh extends DienThoaiDiDong {

	@Override
	public void tanCongKeXau() {
		System.out.println("Dùng điện thoại thông minh tấn công kẻ xấu");
	}

	@Override
	public void nghe() {
		System.out.println("Dùng điện thoại thông minh để nghe điện");
	}

	@Override
	public void goi() {
		System.out.println("Dùng điện thoại thông minh để gọi điện");
	}

	@Override
	public void guiTN() {
		System.out.println("Dùng điện thoại thông minh để gửi tin nhắn");
	}

	@Override
	public void nhanTN() {
		System.out.println("Dùng điện thoại thông minh để nhận tin nhắn");
	}

	public void suDung3G() {
		System.out.println("Sử dụng 3G");
	}

	public void chupHinh() {
		System.out.println("Chụp ảnh");
	}
}
