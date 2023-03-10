package Units;

public class Rogue extends MeleeClass {
     public Rogue(String name) {
          super(name, 1, 1000, 200, 50);
     }

     @Override
     public String getInfo() {
          // return String.format(" %s Type: %s - Level: %d\n Hp: %d/%d",
          // super.getInfo());
          return "Разбойник";
     }

     @Override
     public void step() {
          System.out.println("Разбойник ударил дубиной");
          ;
     }
}
