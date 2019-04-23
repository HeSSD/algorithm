package org.algorithm.sorting_algorithm;

import java.util.Arrays;

public class quickSort1 {
    public static void sort(int a[], int low, int hight) {
        int i, j, index;
        if (low > hight) {
            return;
        }
        i = low;
        j = hight;
        index = a[i]; // ���ӱ�ĵ�һ����¼����׼
        while (i < j) { // �ӱ�����˽������м�ɨ��
            while (i < j && a[j] >= index)
                j--;
            if (i < j)
                a[i++] = a[j];// �ñȻ�׼С�ļ�¼�滻��λ��¼
            while (i < j && a[i] < index)
                i++;
            if (i < j) // �ñȻ�׼��ļ�¼�滻��λ��¼
                a[j--] = a[i];
        }
        a[i] = index;// ����׼��ֵ�滻�� a[i]
        sort(a, low, i - 1); // �Ե��ӱ���еݹ�����
        sort(a, i + 1, hight); // �Ը��ӱ���еݹ�����

    }

    public static void quickSort(int a[]) {
        sort(a, 0, a.length - 1);
    }

    public static void main(String[] args) {

        int a[] = { 49, 38, 65, 97, 76, 13, 27, 49 };
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}
