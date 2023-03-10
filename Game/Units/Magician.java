package Units;

public class Magician extends WizzardClass {

     public Magician(String name) {
          super(name, 1, 1000, 1000, 100, 50);
     }

     @Override
     public String getInfo() {
          // return String.format(" %s Type: %s - Level: %d\n Hp: %d/%d Mp: %d/%d ",
          // super.getInfo());
          return "Маг ";
     }

     public void magicAttack(BaseHero target) {
          if (mp > 100) {
               damage = baseDamage * level / 2;
               target.GetDamage(damage);
               mp -= 100;
          }
     }

     @Override
     public void step() {
          System.out.println("Маг скастовал заклинание");
          ;
     }
}