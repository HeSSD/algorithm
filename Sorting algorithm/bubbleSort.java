package org.algorithm.sorting_algorithm;

import java.util.Random;

public class bubbleSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bubble_Sort();
	}
	
	public static void bubble_Sort() {
		int[] a=new int[20];
		int b=20;
		Random random=new Random();
		for(int i=0;i<b;i++){
			a[i]=random.nextInt(50);
		}
		for(int j=0;j<b;j++){
			System.out.print(a[j]+"\t");
		}
		//冒泡排序主体部分
		for(int m=0;m<b-1;m++){
			for(int n=0;n<b-1-m;n++){
				if(a[n]>a[n+1]){
					int c=a[n];
					a[n]=a[n+1];
					a[n+1]=c;
				}
			}
		}
		System.out.println("\n");
		for(int j=0;j<b;j++){
			System.out.print(a[j]+"\t");
		}
	}

}
