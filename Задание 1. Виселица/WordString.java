import java.util.ArrayList;
import java.util.List;

public class WordString {
    private String word;
    private char[] wordArray;
    List<Character> wordArrayHide = new ArrayList<>();
    List<Character> missedLetters = new ArrayList<>();

    public WordString(String guessedWord) {
        this.word = guessedWord;
        wordArray = word.toCharArray();
        createWordArrayHide();
    }

    protected String getWord() {
        return word;
    }

    protected int getNumOfMissed() {
        return missedLetters.size();
    }

    public boolean isWordGuessed() {
        boolean isUnderlineInHideString = false;

        for (Character character : wordArrayHide) {
            if (character == '_') {
                isUnderlineInHideString = true;
                break;
            }
        }

        return !isUnderlineInHideString;
    }

    public void printHideString() {
        System.out.println("\nУгадываемое слово:");
        for (Character character : wordArrayHide) {
            System.out.print(character + " ");
        }
        System.out.println();
    }

    public void printMissedLetters() {
        System.out.println("\nПропуски:");
        for (Character character : missedLetters) {
            System.out.print(character + " ");
        }
        System.out.println();
    }

    public void printInfo() {
        printHideString();
        printMissedLetters();
    }

    public boolean isLetterConsists(char letter) {
        boolean isConsists = false;

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i] == letter) {
                wordArrayHide.set(i, letter);
                isConsists = true;
            }
        }

        if (!isConsists) {
            missedLetters.add(letter);
        }

        return isConsists;
    }

    private void createWordArrayHide() {
        for (int i = 0; i < wordArray.length; i++) {
            wordArrayHide.add('_');
        }
    }
}
