package StringClass;

public class CharacterCount {

    public static void main(String[] args) {

        String a = new String("ABCD");
        String b = a.toLowerCase();
        String c = b.toUpperCase();

        boolean t = (a == c);  //false  true


        String s = "abcdabcdab";

        int count = 0;

        //char a count?   Char a is present 3 times
        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == 'a'){
                count++;
            }
        }

        System.out.println("Char a is present "+count + " times");

        //String s = "abcdabcdab";  //a =3  b=3 c =2 d=2
    }
}
