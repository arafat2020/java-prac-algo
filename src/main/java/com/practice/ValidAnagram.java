package com.practice;

import java.util.HashMap;


public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()){
            if (!count.containsKey(c)) return false;
            count.put(c, count.get(c) - 1);
            if (count.get(c) == 0) count.remove(c);
        }
        
        return count.isEmpty();
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        boolean result = validAnagram.isAnagram(s, t);
        System.out.println("Are \"" + s + "\" and \"" + t + "\" anagrams? " + result);
    }
}
