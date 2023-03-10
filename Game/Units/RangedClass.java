package Units;

public abstract class RangedClass extends BaseHero {

    public static final int MAX_ARROWS = 1000;
    protected int arrows;

    public RangedClass(String name, int level, int maxHp, int baseDamage, int baseProtection, int arrows) {
        super(name, level, maxHp, baseDamage, baseProtection);
        this.arrows = arrows;
    }
    @Override
    public String getInfo() {
        // return String.format(" %s Type: %s - Level: %d\n Hp: %d/%d",
        // super.getInfo(), this,arrows);
        return " ";
    }

    public void rangeAttack(BaseHero target) {
        if (arrows > 0) {
            damage = baseDamage * level / 10;
            target.GetDamage(damage);
            arrows -= 1;
        }
    }

    public void step() {
        System.out.println(" ");
    }
}
