public class Main {

    public static void main(String[] args) {

        Uzumaki[] uzumakies = {
                new Nagato("Nagato", "Chibaku Tensei"),
                new Minato("Minato", 500),
                new Naruto("Naruto", "Ninjutsu")};

        for (int i = 0; i < uzumakies.length; i++) {
            System.out.println(uzumakies[i].getName());
            ((Printable) uzumakies[i]).print();
        }


        Uzumaki uzumaki1 = (Uzumaki) createObject("Nagato");
        System.out.println(uzumaki1.getName());
        ((Printable)uzumaki1).print();
        System.out.println("--------------------");
        Uzumaki uzumaki2 = (Uzumaki) createObject("Minato");
        System.out.println(uzumaki2.getName());
        ((Printable)uzumaki2).print();
        System.out.println("---------------------");
        Uzumaki uzumaki3 = (Uzumaki) createObject("Naruto");
        System.out.println(uzumaki3.getName());
        ((Printable)uzumaki3).print();
        System.out.println("----------------------");

        
        
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "uzumaki1":
                return new Nagato("Nagato", "Chibaku Tensei");
            case "uzumaki2":
                return new Minato("Minato", 500);
            case "uzumaki3":
                return new Naruto("Naruto", "Ninjutsu");
            default:
                return null;
        }
    }
}







