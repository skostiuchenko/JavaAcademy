/** Prints sum of entered numbers on the console. */
public class Sum {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < args.length; i++){
            s = s + " "+ args[i];
        }

        int i = 0, j = 0, k = 0;
        while(i<s.length()) {
            if (s.charAt(i) == '-') {
                int r = 0;
                for (j = i+1; s.charAt(j) != ' '; j++) {
                    r = r*10 +s.charAt(j) - '0';
                    if (j == s.length()-1) {
                        break;
                    }

                }
                k = k-r;
                i = j+1;
             } else if (s.charAt(i) != ' ') {
                 int r = 0;
                 for (j = i; s.charAt(j) != ' '; j++) {
                     r = r*10 +s.charAt(j) - '0';
                         if (j == s.length()-1) {
                             break;
                         }

                  }
                  k = k+r;
                  i = j+1;
             } else {
                 i++;
             }

             if (j == s.length()-1) {
                 break;
             }

        }
        System.out.println(k);
    }
}
