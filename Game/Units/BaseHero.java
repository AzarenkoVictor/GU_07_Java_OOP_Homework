package Units;

import java.util.Random;

public abstract class BaseHero implements UnitInterface {

     public static final int MAX_HP = 100000;
     public static final int MAX_MP = 10000;

     protected String name;
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

     public BaseHero(String name, int maxHp, int attack, int minDamage, int maxDamage, int protection, int speed,
               boolean canDelivery) {
          this.name = name;
          this.maxHp = maxHp;
          this.attack = attack;
          this.protection = protection;
          this.speed = speed;
          this.canDelivery = canDelivery;
          this.minDamage = minDamage;
          this.maxDamage = maxDamage;
     }

     @Override
     public String getInfo() {
          return " ";
     }

     public String getName() {
          return name;
     }

     @Override
     public String toString() {
          return String.format("Имя: %s \n(Здоровье: %d/%d; Атака: %d; Защита: %d, Скорость: %d)",
                    name, hp, maxHp, attack, protection, speed);
     }

     public boolean isAlive() {
          return isAlive;
     }

     public boolean getDelivery() {
          return canDelivery;
     }

     public int getSpeed() {
          return speed;
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

     @Override
     public int compare(BaseHero o1, BaseHero o2) {
          return o1.getSpeed() - o2.getSpeed();
     }
}
