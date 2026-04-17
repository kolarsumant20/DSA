public class firstUniqCharacter {
    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        // Count occurrences
        for (int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        // Find first unique
        for (int i = 0; i < s.length(); i++){
            if (freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";

        System.out.println(firstUniqChar(s));
        System.out.println('b'+'i'+'t');
    }
}
