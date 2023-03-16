import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Units.*;

public class Game {

     public static void main(String[] args) {

          ArrayList<BaseHero> lightHeroes = new ArrayList<>();
          ArrayList<BaseHero> darkHeroes = new ArrayList<>();

          for (int i = 0; i < 10; i++) {

               switch (new Random().nextInt(3)) {

                    case 0:
                         darkHeroes.add(new Archer("Стрелок",0, i));
                         break;
                    case 1:
                         lightHeroes.add(new Countryman("Деревеньщина",0,i));
                         break;

                    case 2:
                         lightHeroes.add(new Magician("Маг",0, i));
                         break;

                    case 3:
                         lightHeroes.add(new Rogue("Разбойник",0, i));
                         break;
               }

               switch (new Random().nextInt(3)) {

                    case 0:
                         darkHeroes.add(new Countryman("Деревеньщина",9, i));
                         break;

                    case 1:
                         darkHeroes.add(new Spearman("Копейщик",9, i));
                         break;

                    case 2:
                         darkHeroes.add(new Crossbowman("Арбалетчик",9, i));
                         break;

                    case 3:
                         darkHeroes.add(new Priest("Лекарь",9, i));
                         break;

               }
          }

          // System.out.println(" Light Heroes\n");

          // for (BaseHero heroes : lightHeroes) {
          // System.out.println(heroes.getInfo());
          // System.out.println(heroes.toString());
          // System.out.println(" ");
          // }
          // System.out.println(" ");
          // System.out.println(" Dark Heroes\n");

          // for (BaseHero heroes : darkHeroes) {
          // System.out.println(heroes.getInfo());
          // System.out.println(heroes.toString());
          // System.out.println(" ");
          // }

          ArrayList<BaseHero> heroes = new ArrayList<>();
          heroes.addAll(darkHeroes);
          heroes.addAll(lightHeroes);

          heroes.sort(new Comparator<BaseHero>() {
               @Override
               public int compare(BaseHero o1, BaseHero o2) {
                    return o1.getSpeed() - o2.getSpeed();
               }
          });
          System.out.println("Отсортированные герои:");
          for (BaseHero hero : heroes)
               System.out.println(hero.getInfo() + " " + hero.toString() + "\n");
     }
}
