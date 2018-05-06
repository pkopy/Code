public class Main {
    public static void main(String[] args) {

        Code code = new Code("komary jedzą chlep","dar");
        System.out.println(code.getResult());

        Decode decode = new Decode("NOŁDRFCJVGZHCCYOEŚ", "dar");
        System.out.println(decode.getResult());

    }
}
