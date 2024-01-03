package Testing.Examples;

import java.util.HashMap;
import java.util.Map;

public class ParameterizedExample {
    private Map<String,String>myMap;

    public ParameterizedExample(){
        myMap=new HashMap<String,String>();
        myMap.put("Denmark","Copenhagen");
        myMap.put("Italy","Rome");
        myMap.put("Japan","Tokyo");
        myMap.put("Brazil","Brasilia");
    }

    public boolean isOdd(int num){
        return (num % 2 != 0);
    }

    public String getCapital(String country){
        return myMap.get(country);
    }

    public boolean findNumber(int num){
        int[] myList=new int[]{3,4,2,1,5,7,9,6,8,0};
        for(int i=0;i<myList.length;i++){
            if(num==myList[i])
                return true;
        }
        return false;
    }

    public int  mult(int a, int b){
        return a*b;
    }
}
