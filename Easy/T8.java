package Easy;


import java.util.Arrays;

public class T8 {
    public void rotateString(char[] str, int offset) {
        // write your code here
        String s = String.valueOf(str);
        String left = s.substring(s.length()-offset, s.length());
        String right = s.substring(0, s.length()-offset);
        String res = left + right;
        char[] resChar = res.toCharArray();
        System.arraycopy(resChar, 0, str, 0, str.length);
        //System.out.println(str);

    }


}
