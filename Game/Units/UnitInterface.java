package Units;

import java.util.ArrayList;

public interface UnitInterface {

     void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets);

     String getInfo();

     int compare(BaseHero o1, BaseHero o2);

}
