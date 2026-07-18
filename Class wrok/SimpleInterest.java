import java.util.Scanner;

class SimpleInterest {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt(); 
        int T = sc.nextInt(); 
        int R = sc.nextInt(); 

        float SI = (P * T * R) / 100.0f;

        System.out.println("Simple Interest = " + SI);

        sc.close();
    }
}