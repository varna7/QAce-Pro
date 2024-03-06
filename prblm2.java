import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Main
{
    public static String[] getArrayList(String[] elements){
        
        ArrayList<String> modifiedArrayList = new ArrayList<>();
        modifiedArrayList.addAll(Arrays.asList(elements));
        Collections.sort(modifiedArrayList);
        
        String modifiedArray[] = modifiedArrayList.toArray(new String[modifiedArrayList.size()]);
        int len = modifiedArray.length;
        for(int i=0;i<len;i++){
            if(i<=len/2){
                modifiedArray[i]=modifiedArray[i].toUpperCase();
            }
            else{
                modifiedArray[i]=modifiedArray[i].toLowerCase();
            }
        }
        return modifiedArray;
        
    }
    
	public static void main(String[] args) {
	    String[] days = {"Sunday","Monday","Tuesday","wednesday","Thursday","Friday","Saturday"};
	
	    String[] modified = getArrayList(days);
	    System.out.println(Arrays.toString(modified));
	
		
	}
}
