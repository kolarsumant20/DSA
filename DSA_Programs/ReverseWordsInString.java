public class ReverseWordsInString {
    public static String Reverse(String s){
        StringBuilder result = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        //\\s → whitespace, + → one or more

        for(int i = words.length - 1; i >= 0; i--){
            result.append(words[i]);
            if(i !=0){
                result.append(" ");
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        //String s = "the sky is blue";
        String s = "  hello world  ";
        //String s = "a good   example";

        System.out.println(Reverse(s));
        
    }
}
