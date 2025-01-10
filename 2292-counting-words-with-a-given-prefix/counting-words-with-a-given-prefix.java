// class Solution {

//     public static boolean isPrefix(String str, String pref){
//         if(str.length()<pref.length()) return false;
//         for(int i=0;i<pref.length();i++){
//             if(str.charAt(i)!=pref.charAt(i)) return false;
//         }
//         return true;
//     }
//     public int prefixCount(String[] words, String pref) {
//         int count = 0;
//         for(String word:words){
//             if(isPrefix(word,pref)){
//                 count++;
//             }
//         }
//         return count;
//     }

// }

// (or)

class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String word:words){
            if(word.startsWith(pref)){
                count++;
            }
        }
        return count;
    }

}