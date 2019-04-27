package org.algorithm.matching_algorithm;

public class Horspool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String P="aaabbbcccdddeeeffffabcdfegggg";
		String T="abcd";
		int locationNum=Horspool(P,T);
	}
	
	public static int  Horspool(String T, String P){
		int n = T.length();    //ĸ������
		int m = P.length();    //�Ӵ�����
		char[] p=P.toCharArray();
		char[] t=T.toCharArray();
		int k = 0;
		int[] table = new int[128];     //�ַ��ƶ���
		for(int i=0;i<128;i++){
			table[i]=0;
		}
		for (int i = 0; i < 128; i++){
			table[i] = m;            //�������ʼ��
		}
		for (int i = 0; i < m - 1; i++){
			table[p[i] - 32] = m - 1 - i;      //�����ƶ���     
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
				i += table[t[i] - 32];      //��ʱ�ö�������Ҷ��ַ�ȥ�ƶ�����Ѱ������ƶ��ľ���Ӹ�i���������ƥ��
		}

		return -1;
	}

}
