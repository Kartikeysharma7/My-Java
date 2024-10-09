import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt(); 
        int output = 1;
        for(int i = 1;i <=3;i++){
            output = output*number;
        }    
        System.out.println(output);
    }
}
