import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx01 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("(\\S{2}\\s\\S{2}\\s\\S{2})");
		Pattern p1 =Pattern.compile("www.hackerrank.com");
		Matcher m=p.matcher("12 12 12");
		
		Matcher w=p1.matcher("\\w");
		//while (m.find())
		System.out.println(w.find());

	}

}
