package Units;

import java.util.ArrayList;

public class Archer extends RangedClass {

     public Archer(String name, int x, int y) {
          super(name, 15, 12, 8, 10, 10, 9,
                    32, false, x, y);
     }

     @Override
     public String getInfo() {
          return "Лучник ";
     }

     @Override
     public void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets) {
          if ((arrows > 0) && isAlive) {
               BaseHero target = getNearest(targets);
               if (target.isAlive()) {
                    System.out.println("Атакующий " + this);
                    System.out.println("Цель " + target + " " + target.getInfo());
                    if (target.getProtection() < attack)
                         target.getDamage(attack, minDamage, maxDamage);
                    arrows--;
                    for (BaseHero unit : attackers) {
                         if (unit.getInfo().equals("Countryman")) {
                              Countryman deliver = (Countryman) unit;
                              if (deliver.getDelivery()) {
                                   arrows++;
                                   System.out.println("Стрела возвращена" + deliver.getName());
                                   deliver.canDelivery = false;
                                   break;
                              }
                         }
                    }
                    if (target.isAlive()) {
                         System.out.println("Атакующий: " + this + " Цель: " + target + "\n");
                    } else {
                         System.out.println("Атакующий:  " + this + " Цель: " + target.getName()
                                   + " был убит\n");
                    }
               }
          }
     }
}