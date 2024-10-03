import java.util.Scanner;

public class Shop {

    Product items[] = new Product[20];
    Scanner sc = new Scanner(System.in);
    private static int count = 0;
    private static double revenue = 0;


    {
        items[0] = new Product("Laptop", 120000 , 30);
        items[1] = new Product("Mouse", 1000 , 50);
        items[2] = new Product("Headphones", 10000 , 40);
        items[3] = new Product("Keyboard", 3000 , 90);
        items[4] = new Product("wife device", 1500 , 100);
        count+=5;
    }

    public void addProduct(){

        System.out.println("\n\n");
        System.out.println("Enter the product details :- ");

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter product quantity: ");
        int quantity = sc.nextInt();

        items[count++]  = new Product(name, price, quantity);

        System.out.println("Product Added .. ");
        System.out.println("\n\n");

    }

    public void sellProduct(){

        System.out.println("\n\n");

        System.out.print("Enter the product id: ");
        String id = sc.nextLine();
        int index = findProductById(id);

        if(index!=-1){
            items[index].setQuantity(items[index].getQuantity()-1);
            revenue+=items[index].getPrice();
            System.out.println("Product sell\nYour current revenue is " + revenue);
        }
        else{
            System.out.println("Product Not Found");
        }

        System.out.println("\n\n");

    }

    public void editProduct(){

        int choice = 0;
        boolean updated = false;
        System.out.print("\nEnter the productId you want to edit : ");
        String id = sc.nextLine();

        int index = findProductById(id);

        if(index!=-1){

            while (true) {

                if(updated){
                    break;
                }

                System.out.print("\nEnter 1 to update the price\nEnter 2 to update the name\nEnter 3 to update the Quantity\nEnter 4 If the update is Complete: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch(choice){

                    case 1:
                        System.out.print("\nEnter the new price: ");
                        double price = sc.nextDouble();
                        items[index].setPrice(price);
                        System.out.println("Price Updated ..");
                        break;

                    case 2:
                        System.out.print("\nEnter the new name: ");
                        String name = sc.nextLine();
                        items[index].setProductName(name);
                        System.out.println("Name Updated ..");
                        break;

                    case 3:
                        System.out.println("\nEnter the new Quantity: ");
                        int quantity = sc.nextInt();
                        items[index].setQuantity(quantity);
                        System.out.println("Quantity Updated ..");
                        break;

                    case 4:
                        updated = true;
                        System.out.println("\n");
                        break;

                    default:
                        break;
                }

            }
        }
        else{
            System.out.println("Product not found");
        }

    }

    public void viewProducts(){

        System.out.println("\n\n");

        for(int i=0 ;i<count;i++){
            System.out.println(items[i]);
        }

        System.out.println("\n\n");

    }

    public void deleteProduct(){

        System.out.print("\nEnter productId to delete the product: ");
        String id = sc.nextLine();
        int index = findProductById(id);

        if(index!=-1){

            for(int i=index;i<count-1;i++){
                items[i] = items[i+1];
            }

            items[count-1] = null;
            count--;

            System.out.println("Product deleted .. ");

        }

        else{
            System.out.println("Product not found ..");
        }

    }


    int findProductById(String id){

        for(int i=0;i<count;i++){

            if(items[i].getProductId().equals(id)){
                return i;
            }

        }

        return -1;

    }

}