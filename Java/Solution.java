public class Solution {
    public static String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        String ans = "";
        if(n2>n1){    
        for(int i =0;i<n1;i++){
            ans=ans + word1.charAt(i) + word2.charAt(i);
        }
        ans = ans + word2.substring(n1);
        }else{
            for(int i =0;i<n2;i++){
            ans=ans + word1.charAt(i) + word2.charAt(i);
        }
        ans = ans + word1.substring(n2);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = mergeAlternately("ab", "pqrs");
        System.out.println(str);
    }
}