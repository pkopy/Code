public class Main {
    public static void main(String[] args) {

        Code code = new Code("ciasto","dar");
        System.out.println(code.getResult());

        Decode decode = new Decode("FIRVTÓ", "dar");
        System.out.println(decode.getResult());

    }
}
