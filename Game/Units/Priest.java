package Units;

import java.util.ArrayList;

public class Priest extends WizzardClass {

     public Priest(String name) {
          super(name, 30, 12, 4, 4, 7, 5,
                    1000, false);
     }

     @Override
     public String getInfo() {
          return "Лекарь ";
     }

     public void heal(BaseHero target) {
          if (mp > 100) {
               target.getDamage(attack, minDamage, maxDamage);
               mp -= 100;
          }
     }

     @Override
     public void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets) {
          System.out.println("Лекарь произнес заклинание");
     }
}