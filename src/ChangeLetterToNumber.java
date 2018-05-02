import java.util.Arrays;

public class ChangeLetterToNumber {

    private int [] arrayOfNumber;


    public int [] getArrayOfNumber(String [] word){

        this.arrayOfNumber = new int [word.length];
        for(int i = 0; i < word.length; i++){
            switch(word[i]) {
                case "A":
                    this.arrayOfNumber[i] = 0;
                    break;
                case "B":
                    this.arrayOfNumber[i] = 1;
                    break;
                case "C":
                    this.arrayOfNumber[i] = 2;
                    break;
                case "D":
                    this.arrayOfNumber[i] = 3;
                    break;
                case "E":
                    this.arrayOfNumber[i] = 4;
                    break;
                case "F":
                    this.arrayOfNumber[i] = 5;
                    break;
                case "G":
                    this.arrayOfNumber[i] = 6;
                    break;
                case "H":
                    this.arrayOfNumber[i] = 7;
                    break;
                case "I":
                    this.arrayOfNumber[i] = 8;
                    break;
                case "J":
                    this.arrayOfNumber[i] = 9;
                    break;
                case "K":
                    this.arrayOfNumber[i] = 10;
                    break;
                case "L":
                    this.arrayOfNumber[i] = 11;
                    break;
                case "M":
                    this.arrayOfNumber[i] = 12;
                    break;
                case "N":
                    this.arrayOfNumber[i] = 13;
                    break;
                case "O":
                    this.arrayOfNumber[i] = 14;
                    break;
                case "P":
                    this.arrayOfNumber[i] = 15;
                    break;
                case "Q":
                    this.arrayOfNumber[i] = 16;
                    break;
                case "R":
                    this.arrayOfNumber[i] = 17;
                    break;
                case "S":
                    this.arrayOfNumber[i] = 18;
                    break;
                case "T":
                    this.arrayOfNumber[i] = 19;
                    break;
                case "U":
                    this.arrayOfNumber[i] = 20;
                    break;
                case "V":
                    this.arrayOfNumber[i] = 21;
                    break;
                case "W":
                    this.arrayOfNumber[i] = 22;
                    break;
                case "X":
                    this.arrayOfNumber[i] = 23;
                    break;
                case "Y":
                    this.arrayOfNumber[i] = 24;
                    break;
                case "Z":
                    this.arrayOfNumber[i] = 25;
                    break;
                case "Ą":
                    this.arrayOfNumber[i] = 26;
                    break;
                case "Ć":
                    this.arrayOfNumber[i] = 27;
                    break;
                case "Ę":
                    this.arrayOfNumber[i] = 28;
                    break;
                case "Ł":
                    this.arrayOfNumber[i] = 29;
                    break;
                case "Ń":
                    this.arrayOfNumber[i] = 30;
                    break;
                case "Ó":
                    this.arrayOfNumber[i] = 31;
                    break;
                case "Ś":
                    this.arrayOfNumber[i] = 32;
                    break;
                case "Ż":
                    this.arrayOfNumber[i] = 33;
                    break;
                case "Ź":
                    this.arrayOfNumber[i] = 34;
                    break;
                case " ":
                    this.arrayOfNumber[i] = 35;
                    break;
                default:
            }

        }
        return arrayOfNumber;
    }

    @Override
    public String toString() {
        return "ChangeLetterToNumber{" +
                "arrayOfNumber=" + Arrays.toString(arrayOfNumber) +
                '}';
    }

}
