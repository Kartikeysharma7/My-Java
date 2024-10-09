import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        int output = sc.nextInt();
        while(number != 0){
            output = output * number;
            number--;
        }
        System.out.println(output);
    }
}
