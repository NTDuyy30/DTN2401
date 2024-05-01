package fontend.exercise2;

import entity.exercise2.question5.DTCoDien;
import entity.exercise2.question5.DTThongMinh;

public class Project5 {
	public static void main(String[] args) {
		DTThongMinh dttm = new DTThongMinh();
		dttm.nghe();
		dttm.goi();
		dttm.guiTN();
		dttm.nhanTN();
		dttm.tanCongKeXau();
		dttm.suDung3G();
		dttm.chupHinh();

		DTCoDien dtcd = new DTCoDien();
		dtcd.nghe();
		dtcd.goi();
		dtcd.guiTN();
		dtcd.nhanTN();
		dtcd.tanCongKeXau();
		dtcd.ngheRadio();
	}

}
