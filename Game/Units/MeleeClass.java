package Units;

public abstract class MeleeClass extends BaseHero {
     public MeleeClass(String name, int level, int maxHp, int baseDamage, int baseProtection) {
          super(name, level, maxHp, baseDamage, baseProtection);
     }

     public void attack(BaseHero target) {
          damage = baseDamage * level / 10;
          target.GetDamage(damage);
     }
     @Override
     public String getInfo() {
          // return String.format(" %s Type: %s - Level: %d\n Hp: %d/%d",
          // super.getInfo());
          return " ";
     }

     public void step() {
          System.out.println(" ");
          ;
     }
}
