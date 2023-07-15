public class Enimals {
private String name;
private int ves;
private String color;

    public Enimals(String name, int ves, String color) {
        this.name = name;
        this.ves = ves;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void  metoth(){
         System.out.println("hello");
    }
    
    @Override
    public String toString(){
        return "Enimals "+"name "+getName()+getVes()+getColor();
    }
}
