import java.util.Scanner;

public class ThietKeMenu {
    public static void main(String[] args) {
        System.out.println("----Thiet Ke Menu bang Java ---------");

        System.out.println("--- Noi Dung -------");


        System.out.println("1. Mon  ");
        System.out.println("2. Tue ");
        System.out.println("3. Wed ");
        System.out.println("4. Thu ");
        System.out.println("5. Fri ");
        System.out.println("6. Sat ");
        System.out.println("7. Sun ");
        System.out.println("0. Exit");


        int choice;

        System.out.println("Enter number your choose: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        while (choice >= 0 && choice <=7) {
            switch (choice) {
                case 1:
                    System.out.println("Thu 2");
                    break;
                case 2:
                    System.out.println("Thu 3 ");
                    break;
                case 3:
                    System.out.println("Thu 4 ");
                    break;
                case 4:
                    System.out.println("Thu 5 ");
                    break;
                case 5:
                    System.out.println("Thu 6 ");
                    break;
                case 6:
                    System.out.println("Thu 7 ");
                    break;
                case 0:
                    System.out.println("Thoat ra ngoai ");
                    System.exit(0);
                default:
                    System.out.println(" Chu nhat ");
            }
            break;

        }

    }
}
