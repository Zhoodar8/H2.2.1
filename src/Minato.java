public class Minato extends Uzumaki implements Printable {

    private int speed;


    public Minato(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }



    @Override
    public void print() {
        System.out.println(getSpeed());

    }
}
