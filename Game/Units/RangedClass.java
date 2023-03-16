package Units;

import java.util.ArrayList;

public abstract class RangedClass extends BaseHero {

    public static final int MAX_ARROWS = 1000;
    protected int arrows;

    public RangedClass(String name, int maxHp, int attack, int minDamage, int maxDamage, int protection, int speed,
            int arrows, boolean hasDelivery, int x, int y) {
        super(name, maxHp, attack, minDamage, maxDamage, protection, speed, hasDelivery, x, y);
        this.arrows = arrows;
    }

    @Override
    public String getInfo() {
        return " ";
    }

    public void rangeAttack(BaseHero target) {
        if (arrows > 0) {
            target.getDamage(attack, minDamage, maxDamage);
            arrows -= 1;
        }
    }

    public void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets) {
        System.out.println(" ");
    }
}
