package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021013
 */
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int a = 1;
        int c = 0;
        int n = scn.nextInt();
        for(a=1;a<=n;a++){
        	if(n%a == 0){
        		c = c+1;
        		System.out.print(a+" ");
        	}
        }
        if(c == 2){
        	System.out.println("\n"+n+"為質數");
        }else{
        	System.out.println("\n"+n+"不為質數");
        }
	}
}

