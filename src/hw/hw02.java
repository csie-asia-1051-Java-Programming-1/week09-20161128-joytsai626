package hw;
import java.util.*;
/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
           數列一:1 2 4 7 11 16 22 29…
           數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 105021013
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int n = scn.nextInt();
        for(a=0;a<=n;a++){
        	if(b<=n){
        		b = b+a;
        		System.out.print(b+" ");
        }
        }
	}
	}
