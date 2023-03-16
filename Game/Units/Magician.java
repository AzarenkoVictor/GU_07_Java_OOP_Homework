package Units;

import java.util.ArrayList;

public class Magician extends WizzardClass {

     public Magician(String name) {
          super(name, 30, 17, 5, 5, 12, 9,100,false);
     }

     @Override
     public String getInfo() {
          return "Маг ";
     }

     public void magicAttack(BaseHero target) {
          if (mp > 100) {
               target.getDamage(attack, minDamage, maxDamage);
               mp -= 100;
          }
     }

     @Override
     public void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets) {
          System.out.println("Маг скастовал заклинание");
          ;
     }
}