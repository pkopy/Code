public class Code {
    static String [] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","ą","ć","ę","ł","ń","ó","ś","ż","ź"," "};
    private String word;
    private String key;
    private int [] arrayKeyNumber;
    private  int [] arrayWordNumber;

    public Code(String word, String key){
        this.word = word.toUpperCase();
        this.key = key.toUpperCase();
    }

    public void init(){

        StringBuilder alignKey = alignKey(key);
        String[] wordArray = splitWord(word);
        String[] keyArray = alignKey.toString().split("");

        ChangeLetterToNumber keyToNumber = new ChangeLetterToNumber();
        ChangeLetterToNumber wordToNumber = new ChangeLetterToNumber();

        arrayKeyNumber = keyToNumber.getArrayOfNumber(keyArray);
        arrayWordNumber = wordToNumber.getArrayOfNumber(wordArray);
    }

    public StringBuilder alignKey(String key){
        StringBuilder key1 = new StringBuilder(key);
        while(word.length() >= key1.length() ){
            key1.append(key);
        }
        return key1;
    }

    public String[] splitWord(String word) {
        return word.split("");
    }


    public StringBuilder getResult(){

        StringBuilder result = new StringBuilder();
        init();

        for (int i = 0; i < word.length(); i++){
            int x = arrayWordNumber[i] + arrayKeyNumber[i];
            if (x == 35){
                result.append(".");
            }else if(x > 35){
                x = x - 36;
                result.append(alphabet[x].toUpperCase());

            }else{
                result.append(alphabet[x].toUpperCase());
            }
        }
        return result;
    }



    public int[] getArrayKeyNumber() {
        return arrayKeyNumber;
    }

    public int[] getArrayWordNumber() {
        return arrayWordNumber;
    }

    public String getWord() {
        return word;
    }


}

