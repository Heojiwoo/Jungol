package operator;

import java.util.Scanner;

public class Self4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int i = (a++) * (--b);
		
		System.out.println(a + " " + b + " " + i);
	}

}