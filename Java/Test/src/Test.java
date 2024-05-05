import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {

		Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);

		String emailStr = "ntd.forwo@rk@vti.edu.com";

		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		System.out.println(matcher.matches());

	}
}
