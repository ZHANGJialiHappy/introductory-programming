package Testing.Examples;


public class NumbersProc{


    public int findMax(int [] numbers) {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<numbers.length;i++){
          if(numbers[i]>max){
            max=numbers[i];
          }
        }
      return max;
      }
          
    }
                