  public class Main {
  public static void main(String [] args) {

   //CODE FOR PART B STARTS HERE
   String highSchoolName = "Birch Wathen Lenox";
   double priceDrink = 2.99;
   double priceCandy = 1.25;
   double priceHotDog = 4.75;
   double priceHamburger = 6.25;

   int orderNumber = (int) (Math.random()*100);
   int numberDrink = (int) (Math.random()*100);
   int numberCandy = (int) (Math.random()*100);
   int numberHotDog = (int) (Math.random()*100);
   int numberHamburger = (int) (Math.random()*100);
   double taxRate = 0.08;
   double subtotal = priceDrink*numberDrink+priceCandy*numberCandy+priceHotDog*numberHotDog+priceHamburger*numberHamburger;
   double taxTotal = subtotal*taxRate;
   double total = subtotal*taxTotal;
   
     // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*    "+ highSchoolName + " Snack Bar    *");
     System.out.println("*                                    *");
     System.out.println("*     Drink .......... $"+ priceDrink + "         *");                      
     System.out.println("*     Candy .......... $"+ priceCandy + "         *");     
     System.out.println("*     Hot Dog ........ $"+ priceHotDog + "         *");     
     System.out.println("*     Hamburger ...... $"+ priceHamburger + "         *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");
  }
  }