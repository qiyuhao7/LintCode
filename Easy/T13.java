package Easy;

public class T13 {
    public int strStr(String source, String target) {
        // Write your code here

        if(target.length() == 0){
            return 0;
        }
        if(source.length() < target.length()){
            return -1;
        }
        for(int i=0;i<source.length() - target.length() + 1; i++){
            for(int j=0;j<target.length();j++){
                if(source.charAt(i+j) != target.charAt(j)){
                    break;
                }
                if(j == target.length()-1){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String source = "abcdabcdefg";
        String target = "bcd";
        T13 t13 = new T13();
        int result = t13.strStr(source, target);
        System.out.println(result);
    }
}
