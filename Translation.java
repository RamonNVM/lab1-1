import java.util.Scanner;
class Final {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String t = in.nextLine();
		String s = in.nextLine();
		int tl = t.length();
		int sl = s.length();
		boolean same = true;

		if (tl != sl) {
			System.out.println("NO");
		} else {
			int i = 0;
			while (same && i<tl){
				if(t.charAt(i) != s.charAt(sl-1-i))
					same = false;
				i++;
			}

			if(same){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
