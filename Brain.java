import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		boolean x = true;
		String c = scan.nextLine();
		int a = Integer.parseInt(c.substring(0, c.indexOf(" 
")));
		for(int i = 0; i < a; i++){
			c = scan.nextLine();
			if(c.contains("M") || c.contains("C") || 
c.contains("Y")){
				x = false;
			}
		}
		if(!x){
			System.out.println("#Color");
		}
		else{
			System.out.println("#Black&White");
		}
	}
}
