package chap12;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class TokenPrintTest {
    public static void main(String[] args) {

        String s = "of the peaple, by the people, for the people";

        try{
            showTokens(s, ", ");
        }catch(NoSuchElementException e){
            System.out.println(e);
        }
    }

    private static void showTokens (String s, String delim) throws NoSuchElementException {

        StringTokenizer st = new StringTokenizer(s,  delim);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
