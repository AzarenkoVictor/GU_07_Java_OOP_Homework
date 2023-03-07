package Units;

public class Countryman extends BaseHero {

     public Countryman(String name, int level, int maxHp, int baseDamage, int baseProtection) {
          super(name, level, maxHp, baseDamage, baseProtection);
     }

     public void attack(BaseHero target) {
          damage = baseDamage * level / 10;
          target.GetDamage(damage);
     }
}