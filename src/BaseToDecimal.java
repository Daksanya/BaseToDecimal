import java.util.Scanner;

public class BaseToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String base=scanner.next();
        int sum=0;
        int power=0;
        for(int i=base.length()-1;i>=0;i--){
            char ch=base.charAt(i);
            int a=Integer.parseInt(String.valueOf(ch));
            sum+=a*Math.pow(2,power);
            power++;
        }
        System.out.println(sum);
    }
}
