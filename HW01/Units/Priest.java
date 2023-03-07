package Units;

public class Priest extends BaseHero {

     protected int maxMp;
     protected int mp = maxMp;

     public Priest(String name, int level, int maxHp, int maxMp, int baseDamage, int baseProtection) {
          super(name, level, maxHp, baseDamage, baseProtection);
     }

     public String getInfo() {
          return String.format(" %s Type: %s - Level: %d\n Hp: %d/%d  Mp: %d/%d ",
                    super.getInfo(), this.mp, this.maxMp);
     }

     public void heal(BaseHero target) {
          if (mp > 100) {
               damage = -(baseDamage * level / 2);
               target.GetDamage(damage); // лечит
               mp -= 100;
          }
     }

     public int getMaxMp() {
          return maxMp;
     }

     public int getMp() {
          return mp;
     }
}