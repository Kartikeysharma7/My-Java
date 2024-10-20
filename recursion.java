public class recursion {
    public static void main(String[] args) {
       int a = fact(3);
       System.out.println(a);
    }
    public static int fact(int n) {
        if(n<1){
            return 1;
        }
        else{
            return n * fact(n-1);
        
        }
    }
}
