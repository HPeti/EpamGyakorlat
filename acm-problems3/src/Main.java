import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        Scanner scanner= new Scanner(System.in);
        int stackNumber=0;
        int setNumber=0;
        while((stackNumber=scanner.nextInt())!=0) {
            int[] stackHeight = new int[stackNumber];
            setNumber++;
            int sum = 0;
            for (int i = 0; i < stackNumber; i++) {
                stackHeight[i] = scanner.nextInt();
                sum += stackHeight[i];
            }
            int optimalHeight = sum / stackNumber;
            int step = 0;
            for (int i = 0; i < stackNumber; i++) {
                if (stackHeight[i] > optimalHeight) {
                    while (stackHeight[i] != optimalHeight) {
                        stackHeight[i]--;
                        step++;
                        for (int j = 0; j < stackNumber; j++) {
                            if (stackHeight[j] < optimalHeight) {
                                stackHeight[j]++;
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println("Set #" + setNumber);
            System.out.println("The minimum number of moves is " + step + ".");
            System.out.println();
        }


    }
}
