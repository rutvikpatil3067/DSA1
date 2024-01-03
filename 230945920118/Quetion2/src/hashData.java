
import java.util.Scanner;

public class hashData {

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		HashMap<String , Integer> hm = new HashMap<>();
		
		System.out.println("Enter Course name");
		String name = sc.next();
		
		System.out.println("Enter Duration in days");
		int days = sc.nextInt();
		
		hm.put(name, days);
		
		System.out.println(hm);
		
		

	}

}
