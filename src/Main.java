import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[] sumNums = new int[5];
        int comparisonsToMake = sumNums.length - 1;
        Scanner keyboard = new Scanner(System.in);
        int a,b,temp;

        for(a = 0; a < sumNums.length; a++){
            System.out.print("Enter number " + (a + 1) + " >> ");
            sumNums[a] = keyboard.nextInt();
        }

        for (a = 0; a < sumNums.length - 1; a++){
            for (b = 0; b < comparisonsToMake; b++){
                if (sumNums[b] > sumNums[b + 1]){
                    temp = sumNums[b];
                    sumNums[b] = sumNums[b + 1];
                    sumNums[b + 1] = temp;
                }
            }
            display(sumNums, (a + 1) );
            -- comparisonsToMake;
        }
    }
    public static void display(int[] sumNums, int a){
        System.out.print("Iteration " + a + ": ");
        System.out.println();
        for( int x = 0; x < sumNums.length; x++){
            System.out.print(sumNums[x] + " ");
            System.out.println();
        }

    }
}
