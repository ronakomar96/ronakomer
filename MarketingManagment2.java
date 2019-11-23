
package marketingmanagment2;


interface  MarketingManagment2 {

   public void milk1(); 
       
    public  void milk2();
public void fruitss();
   public void meals();
class Product  implements  MarketingManagment2{
     public void milk1(){
         System.out.println("expire ");
     }
     public  void milk2(){
         System.out.println("weight");
     }
     public void fruitss(){
         System.out.println("seosone");
     }
     public void meals(){
         System.out.println("weight");
     }
}
    
   
    public static void main(String[] args) {
       Product ob = new Product ();
       ob.milk1();
       ob.milk2();
    }
    
}
