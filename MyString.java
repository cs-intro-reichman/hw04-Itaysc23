public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if ( ch>= 'A' && ch <= 'Z'){
                sb.append((char) (ch + 32)); 
        } else {
            sb.append(ch);
        }
    }
    return sb.toString(); 
    }


    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str1.length() == 0 || str2.length()>str1.length()){ //if str1 is empty or str2>str1
            return false;
        } else if (str2.length() == 0){ //if str2 empty
            return true;
        }
        for (int i = 0 ; i<=str1.length()-str2.length() ; i++){ //loop over str1 until there isnt space for str2
            Boolean match = true;
            for (int j =0 ; j<str2.length() ; j++){ // loop over str2
                if (str1.charAt(i+j) != str2.charAt(j)){ //checks for mismatch. if non, will stay true
                    match = false;
                    break; //exit inner loop 
                }
            }
            if (match){
                return true;
            }
        }
        return false;
    }
}