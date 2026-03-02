public class Hanama {
    public String replaceLastCharacter(String str){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length()-1; i++){
            char ch = str.charAt(i);
            result.append(ch);
            
        }
        result.append('\\');
        return result.toString();
    }
    public static void main(String[] args) {

        String str = "Sumant";
        Hanama obj = new Hanama();
        System.out.println(obj.replaceLastCharacter(str));
        
    }
}
