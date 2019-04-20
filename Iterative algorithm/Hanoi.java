package test;
public class Hanoi {
    public static void move(int n, String begin, String buffer, String end) {
        if (n == 1) {
            System.out.println("from " + begin + " to " + end);    //ֱ�Ӵӵ�һ�������õ�����������
            return;
        }
        move(n - 1, begin, end, buffer);  //�Ե���������Ϊ�м�����������1--n-1�����õ��ڶ���������
        move(1, begin, buffer, end);   //����n�����ӣ��������ӣ��õ������������ϣ�ʵ��ת��
        move(n - 1, buffer, begin, end);   //�ٰѵ�1--n-1�������õ������������ϣ��Ե�һ������Ϊ�м�����
    }

    public static void main(String[] args) {
        Hanoi.move(3, "H1", "H2", "H3");     //��������
    }
}