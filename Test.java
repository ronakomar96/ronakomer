
 class overload {
   static int demo (int a){
      
      return a;
      
  }
   static int demo(int a, int b){
      return a+b;
  }
    static double demo(double a){
       
       return a*a;
   }       
} 
    
    class Methodoverloading{
      public static void main(String[]args){
     
       
 
          System.out.println(overload.demo(10));
          System.out.println(overload.demo(2,1));
          System.out.println(overload.demo(2.2));
         
          
}
    }



 
    
        
    
    
    
  


 }
    
