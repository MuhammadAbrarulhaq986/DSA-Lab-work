import java.util.*;

void main() {

Scanner sc = new Scanner(System.in);

    IO.println("Enter Numbers for 2D Array: ");
    int[][] arr = new int[4][3];

    for (int rows = 0; rows < 4; rows++) {
        for (int cols = 0; cols < 3; cols++) {
            arr[rows][cols] = sc.nextInt();
        }
    }
    for (int rows = 0; rows < 4; rows++) {
        for (int cols = 0; cols < 3; cols++) {
            IO.print(arr[rows][cols] + "\t");
        }
        System.out.println();
    }
    sc.close();


/*
******** Looping Over Array Index ********

    int[] arr = {5,6,4,7,10};
    for (int i = 0; i < arr.length; i++) {
        IO.println("Value at index " + i + " = " + arr[i]);
    }
*/

    /*
    ******** Simple Name Print and Sum of two numbers by using ********

    Scanner name = new Scanner(System.in);

    System.out.print("Enter Your Name: ");

    String n = name.next();

    Scanner sca = new Scanner(System.in);

    System.out.print("Enter 2 Numbers: ");

    int num1 = sca.nextInt();
    int num2 = sca.nextInt();

    int sum = num1 + num2;

    System.out.println("Welcome: " + n);
    System.out.println("The Sum is: " + sum);

    sca.close();
    */
}