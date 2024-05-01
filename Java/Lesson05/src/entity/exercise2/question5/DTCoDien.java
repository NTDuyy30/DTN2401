package entity.exercise2.question5;

public class DTCoDien extends DienThoaiDiDong {

	@Override
	public void tanCongKeXau() {
		System.out.println("Dùng điện thoại cổ điển tấn công kẻ xấu");
	}

	@Override
	public void nghe() {
		System.out.println("Dùng điện thoại cổ điển để nghe điện");
	}

	@Override
	public void goi() {
		System.out.println("Dùng điện thoại cổ điển để gọi điện");
	}

	@Override
	public void guiTN() {
		System.out.println("Dùng điện thoại cổ điển để gửi tin nhắn");
	}

	@Override
	public void nhanTN() {
		System.out.println("Dùng điện thoại cổ điển để nhận tin nhắn");
	}

	public void ngheRadio() {
		System.out.println("Nghe đài radio");
	}

}
