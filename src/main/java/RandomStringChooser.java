import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList <String> wordsList;
 public RandomStringChooser(String[] arr){
   wordsList = new ArrayList <String>();
   for(int i = 0; i < arr.length; i++){
     wordsList.add(arr[i]);
   }
 }
 public String getNext(){
   if(wordsList.size() == 0){
     return "NONE";
   }
   int i = (int)(Math.random()* wordsList.size());
   return wordsList.remove(i);
} 
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
