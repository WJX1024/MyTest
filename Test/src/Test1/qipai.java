package Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class qipai {

//	public static void main(String[] args) {
//		int s[] = new int[10];
//		for (int i = 0; i < s.length; i++) {
//			s[i] = new Random().nextInt(13);
//			
//		}
//		System.out.println(Arrays.toString(s));
//	}
	public static void main(String [] args){
		List li = new ArrayList();  //存放花色
		List li2 = new ArrayList(); //表示存放A-K
		List li3 = new ArrayList(); //大王小王 + 生成总的扑克牌
		li.add("黑桃");
		li.add("红心");
		li.add("梅花");
		li.add("方片");
		for(int i = 2 ;i<11;i++){
			li2.add(i);
		}
		li2.add("J");
		li2.add("Q");
		li2.add("K");
		li2.add("A");
		for(int i =0;i<li.size();i++){
			for(int j=0;j<li2.size();j++){
				String str = (String)li.get(i) + li2.get(j);
				li3.add(str);
			}
		}
		li3.add("大王");
		li3.add("小王");
		//洗牌
		Collections.shuffle(li3);
		for(int i =0;i<li3.size();i++){
			System.out.println(li3.get(i)+" ");
		}
		System.out.println("总共"+li3.size()+"张扑克牌!!");
	}
}
