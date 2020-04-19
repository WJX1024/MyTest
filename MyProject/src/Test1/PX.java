package Test1;

import java.lang.reflect.Method;
import java.util.Arrays;

public class PX {

	public static void main(String[] args) {
		int a[] = {24,156,5,63,11,84};
		Method(a);
	}

	private static void Method(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length-1; i < j; j--) {
				if (a[j]>a[j-1]) {
					int t =a[j-1];
					a[j-1]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
