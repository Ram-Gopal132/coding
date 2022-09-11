class Student {
    String Name;
    int age;
    String address;
    public void study(){
        System.out.println("ram");
    }
  
// create a another method

    public void printname(){
        System.out.println(this.Name);
        System.out.println(this.age);
        System.out.println(this.address);
        System.out.println(this.color);
        System.out.println(this.type);
    }

 
    
    
   
    class Pen{
        String color;
        String type;
        public void write(){
            System.out.println();
        }
    
    
  public  class Ty{
        public static void main(String[] args) {
            Student s1=new Student();  //  create a object
            s1.Name="Ram";
            s1.age=22;
            s1.address="basti";
            s1.study();

            Student s2=new Student();
            s2.Name="vinay";

            Pen p1= new Pen();
            p1.color="green";
            p1.type="gel";




          s1.printname();
          s2.printname();
          p1.printname();
        }
    }
    
}}
