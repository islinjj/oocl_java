package team.ita.polymorphism;

public class ColorPrinter extends  Printer{

    public ColorPrinter(String type) {
        super(type);
    }

    @Override
    public void print() {
        System.out.println("彩色打印");
    }
}
