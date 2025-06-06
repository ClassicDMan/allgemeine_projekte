package Kapital_04_1;

public class KmpSearch {

	private static int[] initNext(String pat) {
		int[] next = new int[pat.length()];
		int i = 0, j = -1;
		next[0] = -1;
		while (i < pat.length() - 1) {
			while (j >= 0 && pat.charAt(i) != pat.charAt(j))
				j = next[j];
			i++;
			j++;
			next[i] = j;
		}
		return next;
	}

	public static int kmpSearch(String text, String pat) {
		int[] next = initNext(pat);
		int i = 0, j = 0;
		while (i < text.length()) {
			while (j >= 0 && pat.charAt(j) != text.charAt(i))
				j = next[j];
			i++;
			j++;
			if (j == pat.length())
				return i - pat.length(); // gefunden
		}
		return -1; // nicht gefunden
	}

	public static void main(String[] args) {
		String text = "abcabcabababccbaba";
		String pattern = "baba";
		int res = kmpSearch(text, pattern);
		System.out.println(res);
	}
}
