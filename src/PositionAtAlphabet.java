public class PositionAtAlphabet {
    public static void main(String[] args) {
        System.out.println(position('z'));
    }

    public static String position(char alphabet)
    {
        int result = (int)alphabet - 96;
        return "Position of alphabet: " + result;
    }

}
