package Units;

import java.util.ArrayList;

public class Spearman extends MeleeClass {
     public Spearman(String name) {
          super(name, 10, 4, 1, 3, 5, 4, false);
     }

     @Override
     public String getInfo() {
          return "Копейщик";
     }

     @Override
     public void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets) {
          System.out.println("Копейщик ударил копьем");
          ;
     }
}
