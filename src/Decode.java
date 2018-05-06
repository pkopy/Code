public class Decode extends Code {


    public Decode(String word, String key) {
        super(word, key);
    }

    @Override
    public String[] splitWord(String word) {
        String[] wordArray = getWord().split("");
        for (int i = 0; i < wordArray.length; i++) {
            if(wordArray[i].equals(".")){
                wordArray[i] = " ";
            }
        }
        return wordArray;
    }

    @Override
    public StringBuilder getResult() {
        init();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < getWord().length(); i++) {
            int x = getArrayWordNumber()[i] - getArrayKeyNumber()[i];
            if (x < 0) {
                x = 36 + x;
                result.append(Code.alphabet[x].toUpperCase());
            } else {
                result.append(Code.alphabet[x].toUpperCase());
            }
        }
        return result;
    }
}
