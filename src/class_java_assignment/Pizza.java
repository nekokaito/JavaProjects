package class_java_assignment;
import java.util.Scanner;

public class Pizza {
    private String sizeOfPizza;
    private int numCheese;
    private int numPepperoni;
    private int numBeef;

    public Pizza(String sizeOfPizza, int numCheese, int numPepperoni, int numBeef) {
        this.sizeOfPizza = sizeOfPizza;
        this.numCheese = numCheese;
        this.numPepperoni = numPepperoni;
        this.numBeef = numBeef;
    }

    public String getSizeOfPizza() {
        return sizeOfPizza;
    }

    public void setSizeOfPizza(String sizeOfPizza) {
        this.sizeOfPizza = sizeOfPizza;
    }

    public int getNumCheese() {
        return numCheese;
    }

    public void setNumCheese(int numCheese) {
        this.numCheese = numCheese;
    }

    public int getNumPepperoni() {
        return numPepperoni;
    }

    public void setNumPepperoni(int numPepperoni) {
        this.numPepperoni = numPepperoni;
    }

    public int getNumBeef() {
        return numBeef;
    }

    public void setNumBeef(int numBeef) {
        this.numBeef = numBeef;
    }

    public double calcCost() {
        double mainPizza = 0;
        double topping;
        if (sizeOfPizza.equals("Small")) {
            mainPizza = 10.00;
        } else if (sizeOfPizza.equals("Medium")) {
            mainPizza = 12.00;
        } else if (sizeOfPizza.equals("Large")) {
            mainPizza = 14.00;
        }
        topping = (getNumCheese() + getNumPepperoni() + getNumBeef()) * 2.00;
        return mainPizza + topping;
    }

    public void getDescription() {
        System.out.println("Pizza size: " + getSizeOfPizza());
        System.out.println("Cheese toppings: " + getNumCheese());
        System.out.println("Pepperoni toppings: " + getNumPepperoni());
        System.out.println("Beef toppings: " + getNumBeef());
        System.out.println("--------------------------------------");
    }
    public static class PizzaOrder{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userPizzaSize;
        int userCheese, userPepperoni, userBeef;
        double TotalCost = 0;
        Pizza[] userPizza = new Pizza[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter pizza size (Small/Medium/Large):");
            userPizzaSize = in.nextLine();
            System.out.println("Enter number of cheese toppings:");
            userCheese = in.nextInt();
            System.out.println("Enter number of pepperoni toppings:");
            userPepperoni = in.nextInt();
            System.out.println("Enter number of beef toppings:");
            userBeef = in.nextInt();
            in.nextLine(); 

            userPizza[i] = new Pizza(userPizzaSize, userCheese, userPepperoni, userBeef);
            userPizza[i].getDescription();
            System.out.println("Cost of Pizza: $" + userPizza[i].calcCost());
            TotalCost = userPizza[i].calcCost();
            TotalCost += TotalCost;
        }
        System.out.println("--------------------------------------");
        System.out.println("Total Bill: $" + TotalCost);
    }
}
}