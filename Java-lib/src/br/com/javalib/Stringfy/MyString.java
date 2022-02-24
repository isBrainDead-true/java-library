package br.com.javalib.Stringfy;

public abstract class MyString {
	
	public static int anagram(String wrd) {
		int idx = wrd.length();
		int sum = idx;	
		while(idx > 1) {
			sum = sum * (idx - 1);
			idx--;
		}
		return sum;
	}
	
	public static boolean isVowel(char tkn) {
		char tmp = Character.toLowerCase(tkn);
		return tmp == 'a' || tmp == 'e' || tmp == 'i' || tmp == 'o'
				|| tmp == 'u';
	}

	public static String removeAllVowels(String wrd) {
		String out = "";
		for (int i = 0; i <= wrd.length() -1; i++) {
			if(!isVowel(wrd.charAt(i))) {
				out += wrd.charAt(i);
			}
		}
		return out;
	}
	
	public static String reverse(String wrd) {
		String out = "";
		for (int i = wrd.length() -1; i >= 0; i-- ) {
			out += wrd.charAt(i);
		}
		return out;
	}
	
	public static boolean isPalindron(String wrd) {
		return wrd.toLowerCase().equals(reverse(wrd.toLowerCase()));
	}
	
	public static int countVowels(String wrd) {
		int count = 0;
		for(int i = 0; i <= wrd.length() -1; i++) {
			if (isVowel(wrd.charAt(i))) count++;
		}
		return count;
	}
	
	public static int countConsoants(String wrd) {
		int count = 0;
		for(int i = 0; i <= wrd.length() -1; i++) {
			if (!isVowel(wrd.charAt(i))) count++;
		}
		return count;
	}
	
	public static String shuffle(String wrd) {
		String out = "";
		char arr[] = new char[wrd.length()];
		arr = wrd.toCharArray();
		int idxLastObj = wrd.length() -1;
		for(int i = 0; i < wrd.length(); i++) {
			swap(arr, Math.random() * idxLastObj, Math.random() * i);
			out += arr[i];
		}
		return out;
	}
	
	public static void swap(char[] arr, double idxI, double idxJ) {
		char tmp = arr[(int) idxI];
		arr[(int) idxI] = arr[(int) idxJ];
		arr[(int) idxJ] = tmp;
	}
	
	public static String toString(String wrd) {
		return "Palavra: " + wrd
				+ "\nTamanho: " + wrd.length()
				+ "\nQuantidade de vogais: " + countVowels(wrd) 
				+ "\nQuantidade de consoantes: " + countConsoants(wrd)
				+ "\nReversa: " + reverse(wrd)
				+ "\nPalavra palindrona: " + isPalindron(wrd)
				+ "\nPalavra sem vogais: " + removeAllVowels(wrd)
				+ "\nPalavra Aleatoria: " + shuffle(wrd)
				+ "\nAnagrama: " + anagram(wrd); 
	}
}
