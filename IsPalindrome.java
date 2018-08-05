
public class IsPalindrome {

    /*  the idea here is you may be given any input string but only check the letters, a-z & A-Z
     *  all symbols or numbers are to be excluded
     *  additionally, all letters are to be lowercase
     */
    public static boolean isSentencePalindrome(String sentence) {
        String s = "";
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                s += (c);
        }

        s = s.toUpperCase();

        int a = s.length();
        for (int i = 0; i < a / 2; i++) {
            if (s.charAt(i) != s.charAt(a - 1 - i))
                return false;
        }

        return true;
    }

/*
Someone much cooler than me came up with this:
Object isSentencePalindrome(String s) {
    s = s.replaceAll("\\W", "");
    
    return s.matches("(?i)" + new StringBuffer(s).reverse());
}

*/

}
