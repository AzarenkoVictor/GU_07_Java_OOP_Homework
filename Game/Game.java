import java.util.ArrayList;
import java.util.Comparator;
// import java.util.Comparator;
import java.util.Random;

import Units.*;

public class Game {

     public static void createHeroes(String[] args) {

          Main.lightHeroes = new ArrayList<>();
          Main.darkHeroes = new ArrayList<>();

          for (int i = 1; i < Main.GANG_SIZE + 1; i++) {

               switch (new Random().nextInt(3)) {

                    case 0:
                         Main.lightHeroes.add(new Archer(getName(), 1, i));
                         break;
                    case 1:
                         Main.lightHeroes.add(new Countryman(getName(), 1, i));
                         break;

                    case 2:
                         Main.lightHeroes.add(new Magician(getName(), 1, i));
                         break;

                    case 3:
                         Main.lightHeroes.add(new Rogue(getName(), 1, i));
                         break;
               }

               switch (new Random().nextInt(3)) {

                    case 0:
                         Main.darkHeroes.add(new Countryman(getName(), 10, i));
                         break;

                    case 1:
                         Main.darkHeroes.add(new Spearman(getName(), 10, i));
                         break;

                    case 2:
                         Main.darkHeroes.add(new Crossbowman(getName(), 10, i));
                         break;

                    case 3:
                         Main.darkHeroes.add(new Priest(getName(), 10, i));
                         break;
               }
          }
     }

     private static String getName() {
          return Names.values()[new Random().nextInt(Names.values().length)].toString();
     }

     public static boolean heroesAlive(ArrayList<BaseHero> team) {
          for (BaseHero unit : team) {
               if (unit.isAlive())
                    return true;
          }
          return false;
     }

     public static void makeStep() {

          Main.lightHeroes.sort(new Comparator<BaseHero>() {
               @Override
               public int compare(BaseHero o1, BaseHero o2) {
                    return o2.getSpeed() - o1.getSpeed();
               }
          });

          Main.darkHeroes.sort(new Comparator<BaseHero>() {
               @Override
               public int compare(BaseHero o1, BaseHero o2) {
                    return o2.getSpeed() - o1.getSpeed();
               }
          });

          for (int i = 0; i < Main.GANG_SIZE; i++) {
               Main.lightHeroes.get(i).step(Main.lightHeroes, Main.darkHeroes);
               Main.darkHeroes.get(i).step(Main.darkHeroes, Main.lightHeroes);
          }
     }
}