package com.palindrome;


public class palindrome {

	public static boolean isPalindrome(String s) {
        
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "hello";
        System.out.println(isPalindrome(s1));   
        System.out.println(isPalindrome(s2));   
    }


	}


