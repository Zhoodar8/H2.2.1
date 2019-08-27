public class Naruto extends Uzumaki implements Printable {
    private String jutsu;
    private int hit;


    public Naruto(String name, String jutsu, int hit) {
        super(name);
        this.jutsu = jutsu;
        this.hit = hit;
    }

    public String getJutsu() {
        return jutsu;
    }

    public int getHit() {
        return hit;
    }

    @Override
    public String prinT() {
     return   getJutsu() + " " + getHit();

    }


}
