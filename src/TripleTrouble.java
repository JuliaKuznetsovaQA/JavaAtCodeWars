public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        String result = "";
        for (int i = 0; i < one.length(); i++) {
            result += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(tripleTrouble("LLh","euo","xtr"));
    }
}
