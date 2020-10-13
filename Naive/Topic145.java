package Naive;

public class Topic145 {
    public char lowercaseToUppercase(char character) {

//        String s = Character.toString(character);
//        String s1 = s.toUpperCase();
//        return s1.toCharArray()[0];
        return (char)(character - 32);

    }
}
