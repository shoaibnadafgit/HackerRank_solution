import java.util.*;
public class CompareTriplates {
static int Size =3;
static int alice;
static int bob;

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int []alist=new int[Size];
		int []blist =new int[Size];
		for (int i =0;i<Size;i++) {
			alist[i]=in.nextInt();
		}
		for (int i =0;i<Size;i++) {
			blist[i]=in.nextInt();
		}
		//comparing the array for alice 
		for(int i =0;i<Size;i++){
			if(alist[i]>blist[i])
				alice++;
			else if (alist[i]<blist[i])
				bob++;
		
		}
		System.out.println(alice+" "+bob);

	}

}

/*
 * import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

 * */
