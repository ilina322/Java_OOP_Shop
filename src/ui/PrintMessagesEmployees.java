package ui;

public class PrintMessagesEmployees {

    public void printMessageSuccessfulLoginEmployee() {
        System.out.println("Welcome");
    }

    public void printMessageWrongLogin() {
        System.out.println("Please try again!");
    }

    public void printMessageEnterProductID() {
        System.out.println("Please enter product ID: " );
    }

    public void printMessageEnterNewProductPrice() {
        System.out.println("Please enter new product price: " );
    }

    public void printMessageDeleteProduct() {
        System.out.println("Please enter Product ID which want to delete: ");
    }

    public void printMessageAddQuantity() {
        System.out.println("Please enter quantity: ");
    }

    public void printMessageTypeOfSortingEmployees() {
        System.out.println("Please, choose type of sorting:\n1.Sort by name\n2.Sort by salary ");
    }
}
