package Hashing;
import java.util.*;

/*
- LeetCode 49. Group Anagrams
- Pattern: HashMap + Frequency Array
- Difficulty: Medium
-
- Problem:
- Given an array of strings, group the anagrams together.
-
- Approach:
- Create a frequency array of size 26 for each string to count occurrences of each letter.
- Convert the frequency array into a string and use it as the HashMap key.
- Strings with the same character frequencies are placed in the same group.
- Return all grouped anagrams from the HashMap.
-
- Time Complexity: O(n * k)
- Space Complexity: O(n * k)
-
- Key Learning:
- A frequency representation can act as a unique signature for anagrams.
- HashMap allows strings with the same signature to be grouped efficiently.
*/

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str:strs){
            int[] freq = new int[26];
            for(char ch: str.toCharArray()){
                freq[ch-'a']++;
            }
            String key = Arrays.toString(freq);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}