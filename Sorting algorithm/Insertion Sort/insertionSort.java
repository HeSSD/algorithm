package org.algorithm.sorting_algorithm;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertion_Sort();
	}
	
	public static void insertion_Sort(){
		int[] a=new int[15];
		int b=15;
		for(int i=0;i<b;i++){
			a[i]=(int) (Math.random()*20);     //fill the array with random functions
		}

		//insert the main code portion of the sort
		for(int m=1;m<b;m++){
			int v=a[m];
			int j=m-1;
			while(j>=0 && a[j]>v){
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=v;
		}
		
		for(int n=0;n<b;n++){
			System.out.print(a[n]+"\t");
		}
	}

}
