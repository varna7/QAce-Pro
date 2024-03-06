// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashMap;


class HelloWorld {
    
    public static HashMap<Integer,String> eligibilityCheck( HashMap<Integer,Integer> Marks){
        HashMap<Integer,String> Medal = new HashMap<>();
        for(Integer k: Marks.keySet()){
            int value = Marks.get(k);
            if(value>=90){
                Medal.put(k,"Gold");
                 
            }
            else if(value>=80 && value<90){
                Medal.put(k,"Silver");
            }
            else if(value>=70 && value<80){
                Medal.put(k,"Bronze");
            }
        }
        return Medal;
    }
    
    public static void main(String[] args) {
        HashMap<Integer,Integer> Marks = new HashMap<>();
        
        
        Marks.put(1,92);
        Marks.put(2,85);
        Marks.put(3,74);
        Marks.put(4,98);
        Marks.put(5,77);
        System.out.println(Marks);
        
        HashMap<Integer,String> Medal = eligibilityCheck(Marks);
        System.out.println(Medal);
    }
}