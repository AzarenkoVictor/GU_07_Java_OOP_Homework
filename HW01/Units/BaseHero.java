package Units;

// import java.util.Random;

public class BaseHero {

     public static final int MAX_LEVEL = 99;
     public static final int MAX_HP = 100000;
     public static final int MAX_MP = 10000;

     protected String name;

     protected int level;
     protected int maxHp;
     protected int hp = maxHp;
     protected int baseDamage;
     protected int baseProtection;

     protected int damage;

     public BaseHero(String name, int level, int maxHp, int baseDamage, int baseProtection) {
          this.name = name;
          this.level = level;
          this.maxHp = maxHp;
          this.baseDamage = baseDamage;
          this.baseProtection = baseProtection;
     }

     public String getInfo() {
          return String.format(" %s Type: %s - Level: %d\n Hp: %d/%d",
                    this.name, this.getClass().getSimpleName(), this.level, this.hp, this.maxHp);
     }

     public void GetDamage(int damage) {
          int currDamage = damage - baseProtection * level;
          if (this.hp - currDamage > 0) {
               this.hp -= currDamage;
          }
     }

     public void healed(int Hp) {
          this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
     }

     public String getName() {
          return name;
     }

     public int getLevel() {
          return level;
     }

     public int getMaxHp() {
          return maxHp;
     }

     public int getHp() {
          return hp;
     }

     public int getBaseDamage() {
          return baseDamage;
     }

     public int getBaseProtection() {
          return baseProtection;
     }

}
