//Mitchell Grohoski
//CSE2
//hw02
/*This program takes the number of specific items bought
and prints the total cost of those items along with how much
tax is being added onto them. It then prints the total cost of all items
 with the tax included in that calculation (tax is 6%).
 */
 
 // define a class
 public class Arithmetic{
     
    //  add main method
    public static void main(String[] args){
        
        //  number of pairs of socks
        int nSocks=3;
        //  Cost per pair of socks ($ is included in variable name)
        double sockCost$= 2.58;
        //  Total sock Cost
        double totalSockCost$=nSocks*sockCost$;
        
        //  Number of drinking glasses
        int nGlasses=6;
        //   Cost per glass 
        double glassCost$=2.29;
        //  Total drinking glass cost
        double totalGlassCost$=nGlasses*glassCost$;
        
        //  Number of boxes of envelopes
        int nEnvelopes=1;
        //  Cost per box of envelopes
        double envelopeCost$=3.25;
        //  Total Envelope cost
        double totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        
        //  tax on items
        double  taxPercent=.06;
        double  taxSocks=taxPercent*totalSockCost$;
        double  taxGlasses=taxPercent*totalGlassCost$;
        double  taxEnvelopes=taxPercent*totalEnvelopeCost$;

        
        //  total cost of combined items
        double  totalCost$=(totalEnvelopeCost$+totalGlassCost$+totalSockCost$);
        int     totalCost2$= (int)totalCost$;       //convert to int
        double  totalCost3$= totalCost2$*100/100.0;    // make up to two decimal places
        
        /*I chose not to round here due to the miniscule amount of money the tax totals up to be, 
        converting to an integer would drop significant value from the already insignificant price of
        the tax and eliminate the practicallity of the program and for a user trying to view how much
        extra they would pay with tax.*/
        double  taxTotal$=taxSocks+taxGlasses+taxEnvelopes;
        
        double  orderTotal$= totalCost$+taxTotal$;
        int     orderTotal2$= (int)orderTotal$;     //convert to int
        double  orderTotal3$= orderTotal2$*100/100.0;      //make up to two decimal places
        
        //  Print out which item, how many of that item, and the cost per item.
        //  Print out of socks
        System.out.println("The items being purchased are: socks" );
        System.out.println("The number of pairs of socks being purchased is: " +nSocks);
        System.out.println("Each pair of socks is being bought at a price of: $" +sockCost$);
        System.out.println("The total price for the socks is: $"+totalSockCost$);
        System.out.println("The tax on the socks is: $"+taxSocks);
        System.out.println("\n");
        
        //  Print out of glasses
        System.out.println("The items being purchased are: drinking glasses" );
        System.out.println("The number of drinking glasses being purchased is:" +nGlasses);
        System.out.println("Each drinking glass is being bought at a price of: $" +glassCost$);
        System.out.println("The total price for the drinking glasses is: $"+totalGlassCost$);
        System.out.println("The tax on the glasses is: $"+taxGlasses);
        System.out.println("\n");
        //  Print out of envelopes
        System.out.println("The items being purchased are: envelopes" );
        System.out.println("The number of envelopes being purchased is: " +nEnvelopes);
        System.out.println("Each envelope is being bought at a price of: $" +envelopeCost$);
        System.out.println("The total price for the envelope is: $"+totalEnvelopeCost$);
        System.out.println("The tax on the envelope is: $"+taxEnvelopes);
        System.out.println("\n");
        
        //  Print total cost without tax
        System.out.println("The total cost of all items without tax is: $"+totalCost3$);
        
        //  Print total tax
        System.out.println("The total tax of the entire order is: $"+taxTotal$);
        
        //  Total order cost
        System.out.println("The total order including tax is: $"+orderTotal3$);
        
        
     }
}