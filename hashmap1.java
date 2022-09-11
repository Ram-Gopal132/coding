import java.util.*;
class HasMap{
    public static void main(String[] args) {
        // country(key),population(value)
        HashMap<String,Integer>map=new HashMap<>();


        // insertion 
        map.put("india",125);
        map.put("china",150);
        map.put("up",22);
        // updation
        map.put("india",120);
        System.out.println(map);

        // search

        if(map.containsKey("india")){
            System.out.println("key persent in the map");
        }
        else{
            System.out.println("key is not present in the map");
        }
        if(map.containsKey("basti")){
            System.out.println("key is persent in the map");

        }
        else{
            System.out.println("key is not persent");
        }


        //  find the value


        System.out.println(map.get("india"));
        map.remove("china");
        System.out.println(map);
    }
} 