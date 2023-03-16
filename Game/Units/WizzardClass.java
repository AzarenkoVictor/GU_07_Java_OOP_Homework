package Units;

public abstract class WizzardClass extends BaseHero {

    protected int maxMp;
    protected int mp = maxMp;

    public WizzardClass(String name, int maxHp, int attack, int minDamage, int maxDamage, int protection, int speed,
            int maxMp, boolean hasDelivery, int x, int y) {
        super(name, maxHp, attack, minDamage, maxDamage, protection, speed, hasDelivery, x, y);
        this.maxMp = maxMp;
    }

    @Override
    public String getInfo() {
        return " ";
    }

    public void step() {
        System.out.println("");
    }
}
