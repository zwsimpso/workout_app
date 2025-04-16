//User class
//this will implement the calorie interface and allow the user to 
//keep track of the calorie intake and calories burned.

import java.util.*;

public class User implements Calories{
   
   int cutCalBurned;
   int buildCalBurned;
   int maintainCalBurned;

   public void User(){
      this.cutCalBurned = 0;
      this.buildCalBurned = 0;
      this.maintainCalBurned = 0;
   }

   public void getCutCalBurned(){
      System.out.println("Calorie Surplus: " + this.cutCalBurned);
   }

   public void getBuildCalBurned(){
      System.out.println("Calorie Surplus: " + this.buildCalBurned);
   }

   public void getMaintainCalBurned(){
      System.out.println("Calorie Surplus: " + this.maintainCalBurned);
   }

   public int cutCaloriesLost(){
      System.out.println("Did you follow the meal/workout plan? y/n");
      Scanner input = new Scanner(System.in);
      String answer = input.nextLine();
      if(answer.equals("y")){
         cutCalBurned =  cutMealCalories - cutWorkCalories;
      }else {
         System.out.println("We fear you haven't made any progress");
      }
      return cutCalBurned;
   }

   public int buildCaloriesLost(){
      System.out.println("Did you follow the meal/workout plan? y/n");
      Scanner input = new Scanner(System.in);
      String answer = input.nextLine();
      if(answer.equals("y")){
         buildCalBurned = buildMealCalories - buildWorkCalories;
      }else {
         System.out.println("We fear you haven't made any progress");
      }
      return buildCalBurned;
   }

   public int maintainCaloriesLost(){
      System.out.println("Did you follow the meal/workout plan? y/n");
      Scanner input = new Scanner(System.in);
      String answer = input.nextLine();
      if(answer.equals("y")){
         maintainCalBurned = maintainMealCalories - maintainWorkCalories;
      }else {
         System.out.println("We fear you haven't made any progress");
      }
      return maintainCalBurned;
   }

}
