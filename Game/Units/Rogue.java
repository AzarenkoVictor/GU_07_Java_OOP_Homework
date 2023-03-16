package Units;

import java.util.ArrayList;

public class Rogue extends MeleeClass {
     public Rogue(String name) {
          super(name, 10, 8, 2, 4, 3, 6, false);
     }

     @Override
     public String getInfo() {
          return "Разбойник";
     }

     @Override
     public void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets) {
          System.out.println("Разбойник ударил дубиной");
     }
}
