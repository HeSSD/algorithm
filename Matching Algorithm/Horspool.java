package org.algorithm.matching_algorithm;

public class Horspool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String P="aaabbbcccdddeeeffffabcdfegggg";
		String T="abcd";
		int locationNum=Horspool(P,T);
	}
	
	public static int  Horspool(String T, String P){
		int n = T.length();    //母串长度
		int m = P.length();    //子串长度
		char[] p=P.toCharArray();
		char[] t=T.toCharArray();
		int k = 0;
		int[] table = new int[128];     //字符移动表
		for(int i=0;i<128;i++){
			table[i]=0;
		}
		for (int i = 0; i < 128; i++){
			table[i] = m;            //对数组初始化
		}
		for (int i = 0; i < m - 1; i++){
			table[p[i] - 32] = m - 1 - i;      //生成移动表     
		}
		int i = m - 1;
		while (i < n)
		{
			k = 0;
			while (k < m && t[i - k] == p[m - 1 - k])
				k++;
			if (k == m)
				return i - m + 1;
			else
				i += table[t[i] - 32];      //此时用对其的最右端字符去移动表中寻找其该移动的距离加给i，往后继续匹配
		}

		return -1;
	}

}
