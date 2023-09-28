public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        // Following the same camelcase naming convention,
        // create drink price variables for drip coffee, latte, and cappuccino.
        double mochaPrice = 3.75;
        double dripCoffee = 2.25;
        double latte = 5.75;
        double cappucino = 4.25;
    
        // Customer name variables (add yours below)
        // Create customer variables for Sam, Jimmy, and Noah.
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4  = "Noah";
    
        // Order completions (add yours below)
        // Create the order status flag (true/false) for each customer.
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        // Cindhuri ordered a coffee. Based on her order status,
        // print the correct status message to the console.

        if (isReadyOrder1){
            System.out.println(customer1 + readyMessage + displayTotalMessage + dripCoffee);
        }
        else{
            System.out.println(customer1 + pendingMessage);
        }
        // Noah ordered a cappucino. Use an if statement to check the status of his order 
        // and print the correct status message.
        // If it is ready, also print the message to display the total.
        // Note: Outcomes may be different depending on what you assigned as the status.
        if (isReadyOrder4){
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappucino);
        }
        else{
            System.out.println(customer4 + pendingMessage);
        }
        // Sam just ordered 2 lattes, print the message to display their total. 
        // Next, use an if statement to print the appropriate order status message. 
        // Change the isReady flag value from true to false 
        // or vice versa in order to test your control logic (if-statement).
        System.out.println(customer2 + ", " + displayTotalMessage + (latte + latte));
        if (isReadyOrder2){
            System.out.println(customer2 + readyMessage);
            isReadyOrder2 = false;
        }
        else{
            System.out.println(customer2 + pendingMessage);
            isReadyOrder2 = true;
        }
        System.out.println(customer3 + ", " + displayTotalMessage + (latte - dripCoffee));
    }
}
