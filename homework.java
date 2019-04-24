import java.io.*;
import java.util.Scanner;
public class homework {
    public static void main(String[] args) {
        class hhw {
            int[][] homework = new int[5][10];
            class hw {
                hw() {
                    System.out.println("I was called!");
                }
            }
            hw newHW = new hw();
        }
        hhw newHomework = new hhw();
        for(int i = 0; i < newHomework.homework.length; i++) {
            System.out.println(newHomework.homework[i]);
        }
    }
}