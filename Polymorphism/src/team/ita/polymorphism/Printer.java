package team.ita.polymorphism;

public class Printer {

    private String type;

    public Printer(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void print(){
        System.out.println("打印"+type);
    }
}
