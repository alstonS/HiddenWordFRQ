public class HiddenWord {
    private String word;

    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String Puzzle) {
        String hint = "";
        for (int i = 0; i < word.length(); i++) {

            if (Puzzle.substring(i, i + 1).equals(word.substring(i, i + 1))) {
                hint += Puzzle.substring(i, i + 1);
            } else if (word.indexOf(Puzzle.substring(i, i + 1)) >= 0) {
                hint += "+";
            } else {
                hint += "*";
            }

        }

        return hint;
    }
}
