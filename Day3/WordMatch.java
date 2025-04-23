public class WordMatch {

    private String secret;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
        // TYPE UP YOUR PART A CODE HERE
        // then test with WordMatchTester
		int count = 0;
		for (int i = 0; i < secret.length(); i++) {
	if (i + guess.length() <= secret.length() && secret.substring(i, i + guess.length()).equals(guess)) {
	count++;
}
}
return count * guess.length() * guess.length();
    }

    public String findBetterGuess(String guess1, String guess2) {
        // TYPE UP YOUR PART B CODE HERE
        // then test with WordMatchTester
		int score1 = scoreGuess(guess1);
		int score2 = scoreGuess(guess2);
		if (score1 > score2) {
            return guess1;
    } else if (score2 > score1) {
        return guess2;
    } else if (guess1.compareTo(guess2) > 0) {
        return guess1;
    } else {
        return guess2;
    }
    }
}
