public class AbbreviateTwoWords {

    public static String abbrevName(String name) {

        return name;
    }

    public static void main(String[] args) {
        String name = "patrick Feenan";
        String result = "";
        for (String word : name.split(" ")) {
            result += word.substring(0, 1).toUpperCase() + ".";
        }
        System.out.println(result.substring(0,3));
    }
}
