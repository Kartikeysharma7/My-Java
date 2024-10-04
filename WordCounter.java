
public class WordCounter {
    
    public static void main (String[] args){ 
        
        String s = "hello how are you";
        int count = countWords(s);
        System.out.println("Number of words:" + count);
       
 
    }
   public static int countWords(String s){
    String[] words = s.split("\\s+");
    return words.length;
   }
}
