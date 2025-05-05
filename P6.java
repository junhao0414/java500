import java.util.Scanner;

//用户输入摄氏度,计算华氏度
//华氏度 = (摄氏度*9/5) + 32
public class P6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入摄氏度:");
        double degree = sc.nextDouble();
        System.out.println("华氏度是: " + ((degree * 9 / 5)+32));
    }
}
