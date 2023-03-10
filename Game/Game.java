import java.util.ArrayList;
import java.util.Random;

import Units.*;

public class Game {

     public static void main(String[] args) {

          ArrayList<BaseHero> LightHeroes = new ArrayList<>();
          ArrayList<BaseHero> DarkHeroes = new ArrayList<>();

          for (int i = 0; i < 10; i++) {

               switch (new Random().nextInt(5)) {
                    case 0:
                         LightHeroes.add(new Archer("Стрелок"));
                         break;

                    case 1:
                         LightHeroes.add(new Countryman("Деревеньщина"));
                         break;

                    case 2:
                         LightHeroes.add(new Magician("Маг"));
                         break;

                    case 3:
                         LightHeroes.add(new Priest("Лекарь"));
                         break;

                    case 4:
                         LightHeroes.add(new Rogue("Разбойник"));
                         break;

                    case 5:
                         LightHeroes.add(new Spearman("Копейщик"));
                         break;

                    case 6:
                         LightHeroes.add(new Crossbowman("Арбалетчик"));
                         break;
               }

               switch (new Random().nextInt(5)) {
                    case 0:
                         DarkHeroes.add(new Archer("Стрелок"));
                         break;

                    case 1:
                         DarkHeroes.add(new Countryman("Деревеньщина"));
                         break;

                    case 2:
                         DarkHeroes.add(new Magician("Маг"));
                         break;

                    case 3:
                         DarkHeroes.add(new Priest("Лекарь"));
                         break;

                    case 4:
                         DarkHeroes.add(new Rogue("Разбойник"));
                         break;

                    case 5:
                         DarkHeroes.add(new Spearman("Копейщик"));
                         break;

                    case 6:
                         DarkHeroes.add(new Crossbowman("Арбалетчик"));
                         break;
               }
          }

          System.out.println("Light Heroes");

          for (BaseHero heroes : LightHeroes) {
               System.out.println(heroes.getInfo());
          }
          System.out.println("Dark Heroes");

          for (BaseHero heroes : DarkHeroes) {
               System.out.println(heroes.getInfo());
          }
     }
}