package team.ita.polymorphism;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int i,j;
        for (i = 3; i < 100; i += 3)
        {
            for (j = 1; j < 100-i ; j++)
            {
                if (i / 3 + j * 3 + (100 - i - j) * 5 == 100 && 100 - i - j > 0)
                {
                    System.out.println("小鸡 "+i+"\t母鸡 "+j+"\t公鸡 "+(100-i-j));
                }
            }
        }
    }
}
