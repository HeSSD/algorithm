package org.algorithm.sorting_algorithm;

public class selectionSort1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selection_Sort();
	}
	public static void selection_Sort(){
		int[] a=new int[15];
		int b=15;
		for(int i=0;i<b;i++){
			a[i]=(int) (Math.random()*20);
		}
		/**
		 * this place is reduced by one because the sorting is selected by comparing at least two numbers, 
		 * so at least two values need not be sorted in the last iteration.
		 */
		for(int j=0;j<b-1;j++){        
			int min=j;
			for(int m=j+1;m<b;m++){
				if(a[min]>a[m]){
					min=m;
				}
			}
			int n=a[min];
			a[min]=a[j];
			a[j]=n;
		}
		
		for(int i=0;i<b;i++){
			System.out.print(a[i]+"\t");
		}
	}

}
