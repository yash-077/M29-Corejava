package conditions;
import java.util.Scanner;
public class switchcase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int songsinput=s.nextInt();
		switch(songsinput) {
		    
		case 1:
			System.out.println("Calm down");
			break;
		case 2:
			System.out.println("Perfect");
			break;
		case 3:
			System.out.println("Paradise");
			break;
		default:
			System.out.println("Invalid");
			s.close();
		}
	}

}
