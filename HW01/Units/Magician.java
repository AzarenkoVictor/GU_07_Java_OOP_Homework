package Units;

public class Magician extends BaseHero {

     private int maxMp;
     private int mp = maxMp;

     public Magician(String name, int level, int maxHp, int maxMp, int baseDamage, int baseProtection) {
          super(name, level, maxHp, baseDamage, baseProtection);
          this.maxMp = maxMp;
     }

     public String getInfo() {
          return String.format(" %s Type: %s - Level: %d\n Hp: %d/%d  Mp: %d/%d ",
                    super.getInfo(), this.mp, this.maxMp);
     }

     public void magicAttack(BaseHero target) {
          if (mp > 100) {
               damage = baseDamage * level / 2;
               target.GetDamage(damage);
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