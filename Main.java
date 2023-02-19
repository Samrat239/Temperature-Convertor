import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your degree celsius value: ");
        float a = sc.nextFloat();
        float b = (a*1.8f)+32.0f;
        System.out.println("Your answer in degree fahrenhiet is: "+b);
    }
}