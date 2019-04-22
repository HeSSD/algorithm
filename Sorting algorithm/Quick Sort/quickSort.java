package org.algorithm.sorting_algorithm;

public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[15];
		int b=15;
		for(int i=0;i<b;i++){
			a[i]=(int) (Math.random()*20);     //fill the array with random functions
		}
		
		for(int n=0;n<b;n++){
			System.out.print(a[n]+"\t");
		}
		System.out.println("\n");
		quickSort quick=new quickSort();
		quick.quick_Sort(a, 0,b-1);
		
		for(int n=0;n<b;n++){
			System.out.print(a[n]+"\t");
		}
	}
	
	public  void quick_Sort(int[] a,int left,int right){
		if(a.length<=0 || left>=right){
			return;
		}
		int v=a[left];
		int l=left;
		int r=right;
		while(l<r){
			/**
			 * start from the last and find a number smaller than v
			 */
			while(l<r && a[r]>v){
				r--;
			}
			/**
			 * place the number found in the position of a[left], then left+1, and move back one bit
			 */
			if (l<r) {
				a[l]=a[r];
				l++;
			}
			/**
			 * then at this time, we will start from the position of left+1 to find a number larger than v
			 */
			while(l<r && a[l]>v){
				l++;
			}
			/**
			 * place the number found in the position of a[right], and then right-1, move forward one bit.
			 */
			if(l<r){
				a[r]=a[l];
				r--;
			}
		}
		
		/**
		 * at this time, the number of subscripts not greater than l is not greater than v, 
		 * and the number of subscripts not less than l is not less than v.
		 */
		a[l]=v;
		quick_Sort(a, left, l);
		quick_Sort(a, l+1, right);
	}
	

}
