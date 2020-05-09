import java.lang.String;
import java.util.*;
public class Main {
    public static void main(String[]args){
   Scanner input =new Scanner(System.in);
   movieName moviename= new movieName();
   CountClass count =new CountClass();
   CheakTheLetter cheakt =new CheakTheLetter();
   RightLetter rightLetter=new RightLetter();

   int MistakeTime=0;
   String wrongletter=" ";
        String xXx=" ";

        System.out.println("hi there this guess the movie name game \n" +
                "you have 10 mistake after them you will lose\n" +
                "good luck*-*");

        String Movie = moviename.output();
        int x = count.Count(Movie);

        String DashLine = "-";
        String dashline=DashLine.repeat(x);
        char[] out=dashline.toCharArray();
        System.out.println("You are guessing: " + dashline);
        int done=0;
        while (MistakeTime<10&&done==0) {
            done = 1;
            String lett = input.nextLine();
            String StarOrNo = cheakt.Cheak(Movie, lett);
            MistakeTime = cheakt.WrongCounter(StarOrNo, MistakeTime);
            out = rightLetter.Right(x, lett, Movie, out);
            wrongletter = cheakt.ReturnTheWrong(Movie, lett, wrongletter);

            System.out.print("You are guessing: ");
            for (int i = 0; i < x; i++) {
                System.out.print(out[i]);
            }
            System.out.println(" ");
            System.out.println("You have guessed (" + MistakeTime + ") Wrong letter :" + wrongletter);

            for (int i = 0; i < x; i++) {
                if (out[i] == '-' ) {
                    done = 0;
                }
            }
        }

        if (MistakeTime==10){System.out.println("you lose");}
        if (MistakeTime<10){System.out.println("you win");}
    }
}
