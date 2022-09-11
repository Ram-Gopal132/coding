public class Stringbuilders {
    public static void main(String args[])    {

        // this is a string form add character
      //  String s1="R";
      //s1 =s1+"a";
      //System.out.println(s1);

      StringBuilder sb=new StringBuilder("RamGopal");
      
     // System.out.println(sb);
      //System.out.println(sb.charAt(1)); // find the character at index value

      // set a value at index
      //sb.setCharAt(0,'s');



      // insert the value
     // sb.insert(1,'r');


      // remove

      sb.delete(1,3);
      System.out.println(sb);
    }
}
