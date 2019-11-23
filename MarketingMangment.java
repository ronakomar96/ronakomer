
public class MarketingMangment {

    private String itmes;
    private String place;
    private int price;
     private int expire ;
   

    public String getItmes() {
        return itmes;
    }

    public String getPlace() {

        return place;
    }

    public int getPrice() {
        return price;
    }

   private int getExpire(){
       return expire;
   }
   
    

    public void setItmes(String newItmes) {

        itmes = newItmes;
    }

    public void setPlace(String newPlace) {
        place = newPlace;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }
public void setExpire ( int newExpire) {
 expire=newExpire;
    }
}



class Marketing {
    private static class overriding {

        public overriding() {
              System.out.println("overriding method ");
        }
            public void HotDrinks() {
      
        System.out.println("Our Hot Drinks Are : ");
    }
    public void ColdDrinks () {
        System.out.println("Our Cold Drinks Are : ");
    }
    }

    public static void main(String[] args) {
        String itmes = "milk";
        String place = "first";
        int price = 1500;
        int expire=2023;

        MarketingMangment aro = new MarketingMangment();
      milk ad = new milk();
      overriding ob5 = new overriding();
        ob5.ColdDrinks();
        ob5.HotDrinks();
        
      
        meals ob = new  meals();
        fruits ob1 = new fruits();
        
        
        aro.setItmes(itmes);
        aro.setPlace(place);
        aro.setPrice(price);
       
        System.out.println("itmes" + aro.getItmes());
        System.out.println("place" + aro.getPlace());
        System.out.println("price" + aro.getPrice());
         
      ad.milk1("cows " );
      ad.milk1(2.4);
ob.mealss("Releasedata");
ob.mealss1(2023);
ob1.fruitss("winter");

//ob3.drinkss("natural");
    }
}

