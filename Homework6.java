
package homework6;
class Market{
    String name;
    Sections  s [] ;
    Market (String name , Sections d []){
        this.name=name;
        this.s= d;
    }
    public Sections [] getsections (){
        return s;
    }
}
class Sections {
    String name;
    int id ;
    Sections (String  name , int id ){
        this.id=id;
        this.name= name;
        
    }
    
}
public class Homework6 {

  
    public static void main(String[] args) {
      Sections ob= new Sections("milk" , 1);
      Sections ob1[] = new Sections[2];
      ob1 [0] = new Sections("fruit" , 2);
      ob1 [1]= new Sections ("drink" ,3);
      Market ob2 = new Market("karfour Market" , ob1);
        for (int i = 0; i < ob1.length; i++) {
            System.out.println("Name  " + ob1[i].name);
              System.out.println("Id   " + ob1[i].id);
            
        }
    }
    
}
