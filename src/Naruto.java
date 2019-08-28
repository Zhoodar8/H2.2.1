public class Naruto extends Uzumaki implements Printable {
    private String jutsu;



    public Naruto(String name, String jutsu) {
        super(name);
        this.jutsu = jutsu;

    }

    public String getJutsu() {
        return jutsu;
    }



    @Override
   public void print() {
        System.out.println(getJutsu());


    }


}
