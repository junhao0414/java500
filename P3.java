import java.util.Scanner;

//输入整数,输入并计算三次方
public class P3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(a*a*a);
    }
}
