import java.lang.String;
public class CheakTheLetter {
        String Wrong="+";
        String Cheak(String word, String letter)
        {
           if (word.contains(letter))
           {
             // System.out.println(letter);
             String Letter=letter;
             return letter;
           }
           else
           {
              Wrong="*";
             //System.out.println("*");
             return "*";
           }
        }
        int WrongCounter(String IDK,int CCount)
        {
        if(IDK=="*")
           {
               CCount++;
               return CCount;
           }
         return CCount;
        }
    String ReturnTheWrong(String word, String letter,String W)
    {
        if (!(word.contains(letter))){
            W=W+letter;
            return W;}
        W=W+"";
       return W;
    }
}
