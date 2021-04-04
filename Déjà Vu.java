import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//learnings
// if the string has all 'a' , then print no
//else check for not palindrome

public class Main {

    public static void main(String[] args)throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            String s = br.readLine();
            String p = new StringBuilder(s).reverse().toString();
            p = p + "a";
            int i = 0;
            for(i = 0; i < s.length(); i++){
                if(s.charAt(i) != 'a') break;
            }
            if(i == s.length()) System.out.println("NO");
            else{
                System.out.println("YES");
                if(p.equals('a'+s)) System.out.println(s+'a');
                else System.out.println('a'+s);
            }
        }
        br.close();
    }
}
