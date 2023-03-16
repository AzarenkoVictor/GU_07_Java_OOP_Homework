package Units;

public abstract class MeleeClass extends BaseHero {
     public MeleeClass(String name, int maxHp, int attack, int minDamage, int maxDamage, int protection, int speed,
               boolean hasDelivery, int x, int y) {
          super(name, maxHp, attack, minDamage, maxDamage, protection, speed, hasDelivery, x, y);
     }

     public void attack(BaseHero target) {
          target.getDamage(attack, minDamage, maxDamage);
     }

     @Override
     public String getInfo() {
          return " ";
     }
}
