package mypackage;

import java.util.Scanner;

public class SudokuSetupTestcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String ans = "{";
		
		for(int i=0; i<9; i++) {
			
			ans += "{";
			
			String s = sc.nextLine();
			for(char c : s.toCharArray()) {
				ans += c + ", ";
			}
			ans = ans.substring(0, ans.length()- 2) + "},\n";
			
		}
		
		ans = ans.substring(0, ans.length()- 2) + "\n};";
		
		System.out.println(ans);
	}

}
