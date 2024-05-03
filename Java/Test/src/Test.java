import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {

		String pattern = "dd-MM-yyyy hh:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String time = simpleDateFormat.format(new Date(102, 10, 14, 6, 0, 0));
		System.out.println(time);
	}

}
