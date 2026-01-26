package Recursion;

public class Temp {
    public static void printDown(int n) {
    if (n == 0) return;

    printDown(n - 1);
    System.out.println(n);
}

public static void main(String[] args) {
    printDown(5);
}

}
