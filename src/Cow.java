public class Cow extends Enimals{
    private String parado;
    private int baasy;
    public Cow(String name, int ves, String color) {
        super(name, ves, color);
    }

    public Cow(String name, int ves, String color, String parado, int baasy) {
        super(name, ves, color);
        this.parado = parado;
        this.baasy = baasy;
    }

    @Override
    public void metoth() {
        System.out.println("java");

    }

    @Override
    public String toString() {
        return "Cow{" +
                "name :"+getName()+
                "ves "+getVes()+
                "color "+getColor()+
                "parado='" + parado + '\'' +
                ", baasy=" + baasy +
                '}';
    }
}

