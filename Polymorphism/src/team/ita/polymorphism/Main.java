package team.ita.polymorphism;

public class Main {
  public static void main(String[] args) {
      Printer blackPrinter = new BlackPrinter("黑白印");
      blackPrinter.print();
      Printer colorPrinter = new ColorPrinter("彩印");
      colorPrinter.print();
  }
}
