class Main{
    char a;
    int x;
    public static void main(String args[]){
        Main obj=new Main();
        obj.a='p';
        obj.x=obj.a;
        System.out.println(obj.x);
        System.out.println((int)(obj.x));
        }
    }