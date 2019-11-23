
class milk extends MarketingMangment {

    String typemilk;
   int  wight;

    public void milk1(String s) {
        typemilk = s;
        typemilk = "cows";
        System.out.println(" " + s);
    

      
    }

    void milk1(double i) {
         wight = (int) i;
        wight =(int) 3.2 ;
          System.out.println(""+ wight);
    }

}

class meals extends MarketingMangment {

    String typemeals;
    int Releasedata;

    void mealss(String d) {
        typemeals = d;
        typemeals = "cows";
        System.out.println(d);
    }

   void mealss1(int g) {

        Releasedata = g;
        int Releasedata = 2023;
        System.out.println(g);
    }
    
}
    class fruits extends MarketingMangment{
        String fruitsSesons;
        
        public void fruitss(String f){
        fruitsSesons=f;
        fruitsSesons="winter";
            System.out.println(f);
        }
        
        class drinks extends MarketingMangment{
            String drinks;
        private String n;
             void drinkss(String u){
                drinks=u;
                drinks="natural";
                System.out.println(u);
                
            }
            
        }
    }
    

        
        
        
        
        
        
        
        
        
        
        
    











