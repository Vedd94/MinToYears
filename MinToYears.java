import java.util.Scanner;

class Min{
	float minutes; 
}
public class MinToYears {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float m;
		System.out.println("Enter the minutes");
		m = sc.nextInt();
		
		Min s = new Min();
		s.minutes = m;
		float years = s.minutes/525600;
		float c = years - (int)(years/(int)years)*(int)years;
		float days =(c*365);
		
		System.out.println((int)s.minutes + " minutes are approximately "+(int)years + " years and " + (int)days + " days");
}
}
