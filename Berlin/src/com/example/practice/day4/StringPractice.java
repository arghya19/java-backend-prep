package com.example.practice.day4;

import java.util.Arrays;

//Medium:
//Check palindrome
//Reverse words
//Count words
//Find duplicate characters
//Find frequency of characters
//Find first non-repeating character
//Find first repeating character
//Remove duplicate characters
//Check anagram
//Sort characters
//Find the largest word
//Find the smallest word

//Interview-Level:
//Longest substring without repeating characters
//Character frequency using arrays
//Character frequency using HashMap
//Check whether two Strings are anagrams
//Group anagrams
//String compression
//Longest palindromic substring — introduction
//Valid parentheses — introduction to stack-based String problems
//-------------------------------------------

//6. Find duplicate characters
//7. Remove duplicate characters
//8. Check whether two Strings are anagrams
//9. Reverse every word in a sentence
//10. Reverse the complete sentence
//11. Find the longest word
//12. Find the shortest word
//13. Count number of words
//14. Remove all spaces
//15. Replace duplicate spaces with one space
//16. Check whether a String contains only digits
//17. Find the character with maximum frequency
//18. Check whether two Strings are rotations
//19. String compression
//20. Longest substring without repeating characters

//-------------------------------------------
// Basic:
class StringBasic {

	// Reverse a String
	public String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		String reversed = sb.reverse().toString();
		return reversed;
	}

	// Count characters
	public int totalCharacters(String s) {
		if (s == null || s.length() == 0)
			return -1;
		return s.length();
	}

	// Count vowels/consonants
	public void countVoCon(String s) {
		if (s == null)
			return;
		int vowel = 0, consonant = 0;
		String str = s.toLowerCase();
		char[] ch = str.toCharArray();
		Arrays.sort(ch);

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
					vowel++;
				} else {
					consonant++;
				}
			}
		}

		System.out.println("Value: " + s);
		System.out.println("Consonant: " + consonant);
		System.out.println("Vowel: " + vowel);

	}

	// Convert lowercase
	public String convertStringToLower(String s) {
		return s.toLowerCase();
	}

	// Convert uppercase
	public String convertStringToUpper(String s) {
		return s.toUpperCase();
	}

	// Find String length without length()
	public int stringLength(String s) {
		if (s == null)
			return -1;
		int count = 0;
		for (char c : s.toCharArray()) {
			count++;
		}
		return count;
	}

	// Count Spaces
	public int countSpaces(String s) {
		if (s == null)
			return -1;
		char[] ch = s.toCharArray();
		int count = 0;
		for (char c : ch) {
			if (c == ' ') {
				count++;
			}
		}
		return count;
	}

	// Count digits
	public int countDigits(String s) {
		if (s == null)
			return -1;
		int count = 0;

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				count++;
			}
		}
		return count;
	}

	// Remove spaces
	public String removeSpaces(String s) {
		if (s == null)
			return null;
		String[] str = s.split(" ");
		String newString = "";
		for (int i = 0; i < str.length; i++) {
			newString += str[i];
		}
		return newString;
	}

	// Replace a character
	public String replaceCharacter(String s, char c, int index) {
		String newString = "";
		for(int i = 0;i < s.length(); i++) {
			if(index == i) {
				newString += c;
			}else {
				newString += s.charAt(i);
			}
		}
		return newString;
	}
	
	//Check whether two Strings are equal
	public boolean checkStringEqual(String s1, String s2) {
		if(s1.equals(s2)) {
			return true;
		}else {
			return false;
		}
	}

}

public class StringPractice {
	static String reverseString(String s) {
		// 1. Reverse a String
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

	static boolean isPalindrome(String s) {
		// 2. Check whether a String is palindrome
		String reversed = new StringBuilder(s).reverse().toString();
		if (s.equals(reversed)) {
			return true;
		} else {
			return false;
		}
	}

	static void countVowelConsonant(String s) {
		// 3. Count vowels and consonants
		int vowel = 0, consonant = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = Character.toLowerCase(s.charAt(i));
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			} else {
				consonant++;
			}
		}
		System.out.println("Vowel: " + vowel);
		System.out.println("Consonant: " + consonant);
	}

	static void countCharacterFrequency(String s) {
		// 4. Count frequency of every character
		char[] ch = s.toCharArray();
		Arrays.sort(ch);

		int i = 0;
		while (i < s.length()) {
			int j = i;
			char c = ch[j];
			while (i < s.length() && ch[i] == c) {
				i++;
			}
			int count = i - j;
			System.out.println(c + ": " + count);
		}
	}

	static char firstNonRepeatingCharacter(String s) {
		// 5. Find the first non-repeating character
		char[] chars = s.toCharArray();
		Arrays.sort(chars);

		int i = 0;
		while (i < s.length()) {
			int j = i;
			char ch = chars[j];
			while (i < s.length() && chars[i] != ch) {
				return ch;
			}
		}
		return '-';
	}

	static void findDuplicateCharacter(String s) {
		if (s == null || s.length() < 2)
			return;

		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		StringBuilder duplicates = new StringBuilder();

		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == chars[i - 1]) {
				if (duplicates.length() == 0 || duplicates.charAt(duplicates.length() - 1) != chars[i]) {
					duplicates.append(chars[i]);
				}
			}
		}
		System.out.println(duplicates.toString());

	}

	public static void main(String[] args) {
		String s = new StringBasic().replaceCharacter("arghya", 'r', 2);
		System.out.println(s);

	}

}
