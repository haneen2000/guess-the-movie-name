import java.util.Random;
public class movieName {

Random rand =new Random();
    String[] MovieVName = new String[]{"the godfather", "the dark knight", "schindlers list", "pulp fiction", "the lord of the rings", "forrest gump"
    ,"star wars","inception","the lord of the rings","the matrix","samurai","city of god","the silence of the lambs","batman begins",
"die hard"};

      /*  void readthem(){
       String[] x =MovieVName;
        for (int i=0 ;i<15;i++){
            System.out.println(x[i]);
      }    }*/
     int x=rand.nextInt(15);
     String output (){
         //System.out.println(MovieVName[x]);
         return MovieVName[x];
     }


}
