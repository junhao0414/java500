import java.util.Scanner;

//输入整数,计算整数的10次方
public class P4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        double result = Math.pow(number,10);
        System.out.println(result);
    }
}
