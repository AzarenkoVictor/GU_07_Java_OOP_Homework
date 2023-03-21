package Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements UnitInterface {

     public static final int MAX_HP = 100000;
     public static final int MAX_MP = 10000;

     protected String name;
     protected String type;
     protected int attack;
     protected int protection;

     protected int maxHp;
     protected int hp = maxHp;
     protected int speed;
     protected int minDamage;
     protected int maxDamage;
     protected int damage;

     protected boolean isAlive = true;
     protected boolean canDelivery;
     protected Position position;

     public BaseHero(String name, String type, int maxHp, int attack, int minDamage, int maxDamage, int protection, int speed,
               boolean canDelivery, int x, int y) {
          this.name = name;
          this.type = type;
          this.maxHp = maxHp;
          this.attack = attack;
          this.protection = protection;
          this.speed = speed;
          this.canDelivery = canDelivery;
          this.minDamage = minDamage;
          this.maxDamage = maxDamage;
          position = new Position(x, y);
     }

     @Override
     public String getInfo() {
          return " ";
     }

     public String getName() {
          return name;
     }

     public String getType() {
          return type;
     }

     // @Override
     // public String toString() {
     //      return String.format("Имя: %s \n(Здоровье: %d/%d; Атака: %d; Защита: %d, Скорость: %d)",
     //                name, hp, maxHp, attack, protection, speed);
     // }

     @Override
     public String toString() {
         return String.format("\t%-12s\t⚔️ %-3d\t\uD83D\uDEE1 %-3d\t♥️%-3d%%", type, attack, protection, (int)(hp * 100 / maxHp));
     }

     public boolean isAlive() {
          return isAlive;
     }

     public boolean getDelivery() {
          return canDelivery;
     }

     public int getHp() {
          return hp;
     }

     public int getSpeed() {
          return speed;
     }


     public Position getPosition() {
          return position;
     }

     public int getProtection() {
          return protection;
     }

     public void getDamage(int attack, int minDamage, int maxDamage) {

          if (attack >= protection) {
               damage = new Random().nextInt(minDamage, maxDamage);
          } else {
               damage = minDamage;
          }

          if (hp > damage) {
               hp = hp - damage;
          } else {
               isAlive = false;
          }
     }

     public void healed(int Hp) {
          this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
     }

     protected BaseHero getNearest(ArrayList<BaseHero> team) {
          double minDistance = 10;
          int index = 0;
          for (int i = 0; i < team.size(); i++) {
               double distance = team.get(i).position.getDistance(team.get(i).position);
               if (distance < minDistance) {
                    minDistance = distance;
                    index = i;
               }
          }
          return team.get(index);
     }

     @Override
     public int compare(BaseHero o1, BaseHero o2) {
          return o1.getSpeed() - o2.getSpeed();
     }

}
