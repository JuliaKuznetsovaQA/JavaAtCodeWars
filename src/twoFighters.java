public class twoFighters {
    public static void main(String[] args) {
//        declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew");
//        declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry");
//        declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry");
        declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry");
    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter[] fighters = {fighter1, fighter2};
        int start;
        String winner = "";
        if (firstAttacker.equals(fighter1.name)) {
            start = 1;
        } else start = 0;
        while (fighter1.health > 0 && fighter2.health > 0) {
            System.out.println(fighters[start].health);
            fighters[start].health = fighters[start].health - fighters[(start+1) % 2].damagePerAttack;
            System.out.println(fighters[start].health);
            start = (start+1) % 2;
        }
        winner = fighters[start].name;
        System.out.println(fighters[0].name + fighters[0].health + fighters[1].name + fighters[1].health);
        System.out.println(winner);

        return winner;
    }
}
