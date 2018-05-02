public class Main {
    public static void main(String[] args) {
        Code code = new Code("Taaaka ryba jadła grzyyyba","most");
        System.out.println(code.getResult());
        Decode decode = new Decode("ÓOSTWORAAPSSVOVMMNYABCGHNO", "most");

        System.out.println(decode.getResult());



    }
}
