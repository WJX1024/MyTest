package Test1;

import java.util.Arrays;

public class MP {

	public static void main(String[] args) {
		paixu();
	}

	private static void paixu() {
		int a[] = {89,12,45,110,6,64};
		for(int i=0;i<a.length;i++) {
			for(int j=a.length-1;i<j;j--) {
				if(a[j]<a[j-1]) {
					int t=a[j];
					   a[j]=a[j-1];
					   a[j-1]= t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
