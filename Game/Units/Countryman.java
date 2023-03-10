package Units;

public class Countryman extends BaseHero {

     public Countryman(String name) {
          super(name, 1, 1000, 100, 100);
     }

     @Override
     public String getInfo() {
          // return String.format(" %s Type: %s - Level: %d\n Hp: %d/%d",
          // super.getInfo());
          return "Крестьянин";
     }

     @Override
     public void step() {
          System.out.println("Крестьянин ударил вилами");
          ;
     }

}
