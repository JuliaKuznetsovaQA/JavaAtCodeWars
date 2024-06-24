public class countSheep {
    public static void main(String[] args) {
        System.out.println(countingSheep(5));
    }

    public static String countingSheep(int num) {
        String murmur = "";
        for (int i = 0; i < num; i++) {
            murmur += i + 1 + " sheep...";
        }
        return murmur;
    }
}
