

public class ChangeLetterToNumber {


    public int [] getArrayOfNumber(String [] word){

        int[] arrayOfNumber = new int [word.length];
        for(int i = 0; i < word.length; i++){
            switch(word[i]) {
                case "A":
                    arrayOfNumber[i] = 0;
                    break;
                case "B":
                    arrayOfNumber[i] = 1;
                    break;
                case "C":
                    arrayOfNumber[i] = 2;
                    break;
                case "D":
                    arrayOfNumber[i] = 3;
                    break;
                case "E":
                    arrayOfNumber[i] = 4;
                    break;
                case "F":
                    arrayOfNumber[i] = 5;
                    break;
                case "G":
                    arrayOfNumber[i] = 6;
                    break;
                case "H":
                    arrayOfNumber[i] = 7;
                    break;
                case "I":
                    arrayOfNumber[i] = 8;
                    break;
                case "J":
                    arrayOfNumber[i] = 9;
                    break;
                case "K":
                    arrayOfNumber[i] = 10;
                    break;
                case "L":
                    arrayOfNumber[i] = 11;
                    break;
                case "M":
                    arrayOfNumber[i] = 12;
                    break;
                case "N":
                    arrayOfNumber[i] = 13;
                    break;
                case "O":
                    arrayOfNumber[i] = 14;
                    break;
                case "P":
                    arrayOfNumber[i] = 15;
                    break;
                case "Q":
                    arrayOfNumber[i] = 16;
                    break;
                case "R":
                    arrayOfNumber[i] = 17;
                    break;
                case "S":
                    arrayOfNumber[i] = 18;
                    break;
                case "T":
                    arrayOfNumber[i] = 19;
                    break;
                case "U":
                    arrayOfNumber[i] = 20;
                    break;
                case "V":
                    arrayOfNumber[i] = 21;
                    break;
                case "W":
                    arrayOfNumber[i] = 22;
                    break;
                case "X":
                    arrayOfNumber[i] = 23;
                    break;
                case "Y":
                    arrayOfNumber[i] = 24;
                    break;
                case "Z":
                    arrayOfNumber[i] = 25;
                    break;
                case "Ą":
                    arrayOfNumber[i] = 26;
                    break;
                case "Ć":
                    arrayOfNumber[i] = 27;
                    break;
                case "Ę":
                    arrayOfNumber[i] = 28;
                    break;
                case "Ł":
                    arrayOfNumber[i] = 29;
                    break;
                case "Ń":
                    arrayOfNumber[i] = 30;
                    break;
                case "Ó":
                    arrayOfNumber[i] = 31;
                    break;
                case "Ś":
                    arrayOfNumber[i] = 32;
                    break;
                case "Ż":
                    arrayOfNumber[i] = 33;
                    break;
                case "Ź":
                    arrayOfNumber[i] = 34;
                    break;
                case " ":
                    arrayOfNumber[i] = 35;
                    break;
                default:
            }

        }
        return arrayOfNumber;
    }

}
