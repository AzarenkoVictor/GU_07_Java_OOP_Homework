package Units;

import java.util.ArrayList;

public class Crossbowman extends RangedClass {
     public Crossbowman(String name, int x, int y) {
          super(name, "Арбалетчик", 10, 6, 2, 3, 3, 4,
                    16, false, x, y);
     }

     @Override
     public String getInfo() {
          return "Арбалетчик";
     }

     @Override
     public void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets) {
          System.out.println("Арбалетчик выстрелил болт");
     }
}