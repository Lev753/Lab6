import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter number of numerals:");
        int n=scan.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Math.random()*100-50;
            arr[i]=Math.round(arr[i]);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] < 0){
                arr[i]=Math.abs(arr[i]);
            }
        }
        double temp=0;
        for (int i = 0; i < n/2; i++) {
            temp = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i] = temp;
        }
        System.out.println("\nBefore changes:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
