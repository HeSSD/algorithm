package test;
public class Hanoi {
    public static void move(int n, String begin, String buffer, String end) {
        if (n == 1) {
            System.out.println("from " + begin + " to " + end);    //直接从第一根柱子拿到第三根柱子
            return;
        }
        move(n - 1, begin, end, buffer);  //以第三根柱子为中间容器，将第1--n-1个盘拿到第二根柱子上
        move(1, begin, buffer, end);   //将第n个盘子（最大的盘子）拿到第三根柱子上，实现转移
        move(n - 1, buffer, begin, end);   //再把第1--n-1个盘子拿到第三个柱子上，以第一根柱子为中间容器
    }

    public static void main(String[] args) {
        Hanoi.move(3, "H1", "H2", "H3");     //三根柱子
    }
}