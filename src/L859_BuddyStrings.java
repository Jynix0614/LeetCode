public class L859_BuddyStrings {
    public static void main(String[] args) {
        String s= "aaaaaacb";
        String goal = "aaaaaabc";
        System.out.println(buddyStrings(s,goal));
    }

    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()){
            return false;
        }
        if (s.equals(goal)){
           int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
                if (count[s.charAt(i) - 'a'] > 1){
                    return true;
                }
            }
            return false;
        }else {
            int first = -1, second = -1;
            for (int i = 0; i < goal.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)){
                    if (first == -1) first = i;
                    else if (second == -1) second = i;
                    else return false;
                }
            }
            return  (second != -1 && s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(second));
        }
    }
}
