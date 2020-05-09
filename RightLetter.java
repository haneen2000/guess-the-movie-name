public class RightLetter {

    char[] Right (int x, String y,String z,char[] out) {



        for (int i = 0; i < z.length(); i++) {
            char[] Z = z.toCharArray();
            char[] Y = y.toCharArray();
            if (Z[i] == Y[0]) {
                out[i] = Y[0];
            } else if(out[i]=='-') {
                out[i] = '-';
            }
        }

        return out;
    }
}
