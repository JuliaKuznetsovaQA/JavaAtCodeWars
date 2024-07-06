public class TheFeastOfManyBeasts {

    public static boolean feast(String beast, String dish) {
        if (beast.toCharArray()[0] == dish.toCharArray()[0] && beast.toCharArray()[beast.length()-1] == dish.toCharArray()[dish.length()-1]) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(feast("great blue heron","garlic nann"));
        System.out.println(feast("brown bear","bear claw"));
    }
}
