import java.util.Scanner;

public class productmain {

    public static void main(String[] args) {

        Shop s1 = new Shop();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("\nChoice List:-\nEnter 1 to add Product\nEnter 2 to view Products\nEnter 3 to sell Product\nEnter 4 to delete Product\nEnter 5 to edit Product : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    s1.addProduct();
                    break;

                case 2:
                    s1.viewProducts();
                    break;

                case 3:
                    s1.sellProduct();
                    break;

                case 4:
                    s1.deleteProduct();
                    break;
                case 5:
                    s1.editProduct();
                    break;
                default:
                    System.exit(0);
                    break;

            }

        }

    }

}