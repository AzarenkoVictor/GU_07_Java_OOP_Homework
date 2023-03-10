package Units;

public abstract class WizzardClass extends BaseHero {

    protected int maxMp;
    protected int mp = maxMp;

    public WizzardClass(String name, int level, int maxHp, int maxMp, int baseDamage, int baseProtection) {
        super(name, level, maxHp, baseDamage, baseProtection);
        this.maxMp = maxMp;
    }
    @Override
    public String getInfo() {
        // return String.format(" %s Type: %s - Level: %d\n Hp: %d/%d Mp: %d/%d ",
        // super.getInfo(), this.mp, this.maxMp);
        return " ";
    }

    public void step() {
        System.out.println("");
        ;
    }
}
