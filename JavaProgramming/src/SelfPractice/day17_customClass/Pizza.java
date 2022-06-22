package SelfPractice.day17_customClass;

public class Pizza {

    public char size;
    public int numberOfCheeseToppings, numberOfPeperoniToppings;

    //calculates of the total price of the pizza, returns it as double
    public double calcCost(){
        double totalPrice=0;

        switch (size){
            case 'S':
            case 's':
                totalPrice = 10 + 2*(numberOfCheeseToppings+numberOfPeperoniToppings);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2*(numberOfCheeseToppings+numberOfPeperoniToppings);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2*(numberOfCheeseToppings+numberOfPeperoniToppings);
                break;

            default:
                System.out.println("Invalid Size: " + size);
        }

        return totalPrice;
    }

    public void setInfo(char size, int numberOfCheeseToppings, int numberOfPeperoniToppings) {
        this.size = size;
        this.numberOfCheeseToppings = numberOfCheeseToppings;
        this.numberOfPeperoniToppings = numberOfPeperoniToppings;
    }

    //displays the pizza information when the pizza object is passed in the print statement
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPeperoniToppings=" + numberOfPeperoniToppings +
                ", total price=" + calcCost()+
                '}';
    }






}

/*
 Create a class named Pizza:
            Attributes:
                1. size
                2. numberOfCheeseTopping
                3. numberOfPepperoniTopping

            Actions:
                calcCost(): returns the total cost of the pizza
                toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */
