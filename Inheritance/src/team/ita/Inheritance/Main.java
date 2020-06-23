package team.ita.Inheritance;

public class Main {
  public static void main(String[] args) {
      Tiger tiger = new Tiger("tiger",2,45);
      System.out.println(tiger.toString());
      tiger.setSound("meowing");
      tiger.shout();
  }
}
