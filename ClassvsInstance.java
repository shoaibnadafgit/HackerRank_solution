import java.util.Scanner;

public class ClassvsInstance {
	private int age;

	public ClassvsInstance(int initialage) {
		if(initialage>0)
		{
			age=initialage;
		}
		else {
			age=0;
			System.out.println("Age is not valid, setting age to 0 .");
		}
	}
	
	
	private void yearPasses() {
		age+=1;
		
	}

	private void amIOld() {
		if(age<13)
			System.out.println("You are young.");
		else if (age>=13 && age<18)
			System.out.println("You are a teenager.");
		else 
			System.out.println("You are old.");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			ClassvsInstance p = new ClassvsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }

	

}
