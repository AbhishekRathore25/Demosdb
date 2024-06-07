package java12;

public class CountVowel {

	public static void main(String[] args)
	{
		String word = "programming";
		int vowelCount = 0;

		for (int i = 0; i < word.length(); i++) {
			char currentChar = word.charAt(i);
			if (currentChar == 'a' || currentChar == 'e'
				|| currentChar == 'i' || currentChar == 'o'
				|| currentChar == 'u' || currentChar == 'A'
				|| currentChar == 'E' || currentChar == 'I'
				|| currentChar == 'O' || currentChar == 'U') {
				vowelCount++;
			}
		}

		System.out.println("Number of vowels: "
						+ vowelCount);
	}
}