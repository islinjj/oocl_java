package team.ita.ab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float budge = sc.nextFloat();

        Transportation bus = new Bus();
        Transportation car = new Car();
        Transportation plane = new Plane();
        Transportation train = new Train();

        if (budge<300){
            System.out.println("Sorry,there is no suitable transportation for you.");
        }else if(budge>=1000){
            System.out.println("You can choose any transportation you want.");
        }else{
            if (budge<train.computePrice()){
                System.out.println("You can choose bus.");
            }else if (budge<car.computePrice()){
                System.out.println("You can choose bus,train.");
            }else if (budge<plane.computePrice()){
                System.out.println("You can choose bus,train,car.");

            }
        }
    }
}
