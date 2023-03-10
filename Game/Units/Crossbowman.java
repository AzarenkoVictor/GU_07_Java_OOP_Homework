package Units;

public class Crossbowman extends RangedClass {
     public Crossbowman(String name) {
          super(name, 1, 1000, 200, 50, 100);
     }

     @Override
     public String getInfo() {
          // return String.format(" %s Type: %s - Level: %d\n Hp: %d/%d Arrows: %d ",
          // super.getInfo());
          return "Арбалетчик";
     }

     @Override
     public void step() {
          System.out.println("Арбалетчик выстрелил болт");
     }
}