import java.util.Scanner;
public class Baseball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        int[] len = new int[input.nextInt() + 1];
        System.out.println("Now enter the state: ");
        int num = 0;
        while(num < len.length) {
            len[num] = input.nextInt();
            num++;
        }
        input.close();
        int[] copy = new int[len.length - 1];
        // Now we know the positions of each of the people.
        // Let's move along.
        for(int i = len[len.length - 1]; i < len.length - 1; i++) {
            copy[i - len[len.length - 1]] = len[i];
        }
        for(int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}