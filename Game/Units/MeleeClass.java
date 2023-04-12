package Units;

import java.util.ArrayList;

public abstract class MeleeClass extends BaseHero {
     public MeleeClass(String name, String type, int maxHp, int attack, int minDamage, int maxDamage, int protection,
               int speed,
               boolean hasDelivery, int x, int y) {
          super(name, type, maxHp, attack, minDamage, maxDamage, protection, speed, hasDelivery, x, y);
     }

     public void attack(BaseHero target) {
          target.getDamage(attack, minDamage, maxDamage);
     }

     @Override
     public String getInfo() {
          return " ";
     }

     @Override
     public void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets) {
          BaseHero target = findTarget(targets);
          if (isAlive) {
               if (position.getDistance(target.position) < 1.5) {
                    target.getDamage(this.attack, this.minDamage, this.maxDamage);
               }
          } else {
               this.move(target, attackers);
          }
     }

     public void move(BaseHero target, ArrayList<BaseHero> friendlyTarget) {
          Position temp = this.position;
          int dX = this.position.getX() - target.position.getX();
          int dY = this.position.getY() - target.position.getY();
          if (Math.abs(dX) >= Math.abs(dY)) {
               if (dX > 0) {
                    temp.setX(temp.getX() - 1);
                    if (checkCells(temp, friendlyTarget)) {
                         this.position.setX(this.position.getX() - 1);
                    }
               } else {
                    temp.setX(temp.getX() + 1);
                    if (checkCells(temp, friendlyTarget)) {
                         this.position.setX(this.position.getX() + 1);
                    }
               }
          } else {
               if (dY > 0) {
                    temp.setY(temp.getY() - 1);
                    if (checkCells(temp, friendlyTarget)) {
                         this.position.setY(this.position.getY() - 1);
                    }
               } else {
                    temp.setY(temp.getY() + 1);
                    if (checkCells(temp, friendlyTarget)) {
                         this.position.setY(this.position.getY() + 1);
                    }
               }
          }
     }

     public boolean checkCells(Position newPosition, ArrayList<BaseHero> friends) {
          for (BaseHero friend : friends) {
               if (newPosition.isEquals(friend.position))
                    return false;
          }
          return true;
     }
}
