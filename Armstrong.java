public class Armstrong {
    public static void main(String[] args) {
        int number = 534;
        int n = 0;
        int r;
        int temp = number;
        int  k = 0;
        int p = 1;
        while(temp != 0){
            temp = temp / 10;
            k++;
        }
        while(number != 0){
            r = number %10;
            for(int i=1;i<=k;i++){
                p = p*r;
                
                
            }
            n = n+p;
            number = number/10;

        }
        System.out.println(n);
    }
    
}
