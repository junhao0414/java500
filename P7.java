import java.util.Scanner;

//输入大写字母,转化为小写字母
public class P7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字母:");
        char a = sc.nextLine().charAt(0);  //获取字母
        char result = (char) (a + 32);
        System.out.println(result);
        //可使用 Character.toLowerCase(a);
    }
}
