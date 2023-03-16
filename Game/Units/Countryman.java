package Units;

import java.util.ArrayList;

public class Countryman extends BaseHero {

     public Countryman(String name) {
          super(name, 1, 1, 1, 1, 1, 3, true);
     }

     @Override
     public String getInfo() {
          return "Крестьянин";
     }

     @Override
     public void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets) {
          System.out.println("Крестьянин ударил вилами");
          ;
     }

}
