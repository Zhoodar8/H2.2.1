public class Nagato extends Uzumaki implements Printable {

    private int power;
    private int healing;


    public Nagato(String name, int power, int healing) {
        super(name);
        this.power = power;
        this.healing = healing;
    }

    public int getPower() {
        return power;
    }

    public int getHealing() {
        return healing;
    }


    @Override
    public String prinT() {

      return   getPower() + " " + getHealing();

    }


}
