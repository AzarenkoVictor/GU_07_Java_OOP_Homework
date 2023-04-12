package Units;

import java.util.ArrayList;

public abstract class WizzardClass extends BaseHero {

    protected int maxMp;
    protected int mp = maxMp;

    public WizzardClass(String name, String type, int maxHp, int attack, int minDamage, int maxDamage, int protection,
            int speed,
            int maxMp, boolean hasDelivery, int x, int y) {
        super(name, type, maxHp, attack, minDamage, maxDamage, protection, speed, hasDelivery, x, y);
        this.maxMp = maxMp;
    }

    @Override
    public String getInfo() {
        return " ";
    }

    @Override
    public void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets) {
        if (isAlive && (mp > 0)) {
            BaseHero target = findTarget(targets);
            target.getDamage(this.attack, this.minDamage, this.maxDamage);
            mp -= 50;
        }
    }
}
