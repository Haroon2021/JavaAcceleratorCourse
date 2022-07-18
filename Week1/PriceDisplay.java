class PriceDisplay {


    public static void main(String[] args) {
        String item = "Coffee Machine";
        Double price = 15.99; 
        // My solution
        // System.out.println("The price for the item "+item+" is "+price);
        // Solution from vide:
        System.out.printf("The price for the item %s is %.2f \n", item, price);

    }    


}