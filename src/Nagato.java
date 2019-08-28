public class Nagato extends Uzumaki implements Printable {

    private String power;



    public Nagato(String name, String power) {
        super(name);
        this.power = power;

    }

    public String getPower() {
        return power;
    }

    @Override
    public void print() {
        System.out.println(getPower());

    }




}
