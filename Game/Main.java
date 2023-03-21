
import Units.*;

import java.util.*;

public class Main {

    public static final int GANG_SIZE = 10;
    public static ArrayList<BaseHero> lightHeroes;
    public static ArrayList<BaseHero> darkHeroes;

    public static void main(String[] args) {

        Game.createHeroes(args);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            ConsoleView.view();
            Game.makeStep();
            scanner.nextLine();
        }
    }
}
