package Units;

public class Archer extends RangedClass {

     public Archer(String name) {
          super(name, 1, 1000, 150, 70, 100);
     }

     @Override
     public String getInfo() {
          // return String.format(" %s Type: %s - Level: %d\n Hp: %d/%d Arrows: %d ",
          // super.getInfo());
          return "Лучник ";
     }

     @Override
     public void step() {
          System.out.println("Лучник выстрелил");
     }
}