import java.time.*;
import java.util.*;
public class DateAndTime {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int day =in.nextInt();
		int month=in.nextInt();
		int year=in.nextInt();
		
		LocalDate dt=LocalDate.of(year, month, day);
		System.out.println(dt.getDayOfWeek());
	}
}
/*class Result {

 
    public static String findDay(int month, int day, int year) {
         Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,day);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.ENGLISH).toUpperCase();

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/