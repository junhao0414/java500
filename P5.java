import java.util.Scanner;

//输入并计算圆的面积
public class P5 {
    private static final double PI = 3.1415926;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径:");
        Double r = sc.nextDouble();
        double s = PI * r * r;
        System.out.println("圆的面积是:" + s);
    }
}
