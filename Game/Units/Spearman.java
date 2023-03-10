package Units;

public class Spearman extends MeleeClass {
     public Spearman(String name) {
          super(name, 1, 1000, 150, 70);
     }

     @Override
     public String getInfo() {
          // return String.format(" %s Type: %s - Level: %d\n Hp: %d/%d",
          // super.getInfo());
          return "Копейщик";
     }

     @Override
     public void step() {
          System.out.println("Копейщик ударил копьем");
          ;
     }
}
