package Test1;

import java.util.Arrays;
import java.util.Random;
//ð������
public class MaoPao {
	public static void main(String[] args) {
		
	   int[] a = suzu();
		System.out.println(Arrays.toString(a));
		System.out.println();
		paixu(a);
        System.out.println(Arrays.toString(a));
	}
//	private static void paixu(int[] s) {
//		for(int i=0;i<s.length;i++) {
//			for(int j=s.length;i<j;j--) {
//				if(s[j]<s[j-1]) {
//					int t = s[j];
//					s[j] = s[j-1];
//					s[j-1] = t; 
//				}
//			}
//		}
//		
//	}
	private static void paixu(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=a.length-1;i<j;j--) {
				if(a[j]<a[j-1]) {
					int t=a[j];
					   a[j]=a[j-1];
					   a[j-1]= t;
				}
			}
		}
		
	}

	private static int[] suzu() {
		int n = new Random().nextInt(5)+3;
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] =  new Random().nextInt(100);
		}
		return a;
	}
}
