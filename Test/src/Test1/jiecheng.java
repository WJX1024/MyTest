package Test1;

import java.util.Scanner;

public class jiecheng {
    public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		System.out.println(n+"的阶乘为"+fd(n));
	}

	private static int fd(int n) {
		if (n<1) {
			return 1;
		}else{
			return n*fd(n-1);
		}
	}
}
