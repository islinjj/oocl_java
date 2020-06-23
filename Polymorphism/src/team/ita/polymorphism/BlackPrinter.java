package team.ita.polymorphism;

public class BlackPrinter extends Printer {

    public BlackPrinter(String type) {
        super(type);
    }

    @Override
    public void print() {
        System.out.println("黑白打印");
    }
}
