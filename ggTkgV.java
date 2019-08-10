import java.util.Scanner;

public class ggTkgV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Imput?");
        boolean invalid = scanner.hasNextInt();
        if (invalid) {
            int first = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Second Imput?");
            invalid = scanner.hasNextInt();
            if (invalid) {
                int second = scanner.nextInt();
                scanner.nextLine();
                System.out.println("kgV (k) or ggT (g)");
                String operator = scanner.nextLine();
                if (operator.equals("k")) {
                    System.out.println(kgV(first, second));
                } else if (operator.equals("g")) {
                    System.out.println(ggT(first, second));
                } else {
                    System.out.println("Du Hurrensohn!");
                }
            } else {
                System.out.println("Diagnose Hurrensohn!");
            }
        } else {
            System.out.println("Diagnose Hurrensohn!");
        }
    }

    public static int kgV(int first, int second) {
        int result = first * second;
        int n = result;
        n--;
        while (n != 0) {
            if (n % first == 0 && n % second == 0) {
                result = n;
                n--;
            } else {
                n--;
            }
        }
        return result;
    }

    public static int ggT(int first, int second) {
        int result;
        if(first>second) {
            result = second;
        } else {
            result = first;
        }
        while (first%result!=0||second%result!=0) {
            result--;
        }
        return result;
    }
}

