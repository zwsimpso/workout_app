//Meal plan class

import java.util.*;

public class Meals{
   String cutMeal1;
   String cutMeal2;
   String cutMeal3;
   String cutMeal4;
   
   String buildMeal1;
   String buildMeal2;
   String buildMeal3;
   String buildMeal4;

   String maintainMeal1;
   String maintainMeal2;
   String maintainMeal3;
   String maintainMeal4;

   public void Meals(){
      this.cutMeal1 = "Breakfast: 1 serving Overnight oats";
      this.cutMeal2 = "Lunch: 1 serving Chicken Cauliflower Fried Rice";
      this.cutMeal3 = "Dinner: 1 serving Lemon Roasted Salmon With Asparagus";
      this.cutMeal4 = "Potential Snacks: Almonds, Popcorn, Yogurt";
      
      this.buildMeal1 = "Breakfast: 2 servings Vegan Freezer Breakfast Burritos, 1 cup strawberries";
      this.buildMeal2 = "Lunch: 2 servings Vegetable & Tuna Pasta Salad, 1 cup Mango Chuncks";
      this.buildMeal3 = "Dinner: 1 serving Sheet-Pan Maple-Mustard Pork Chops & Carrots, 1 1/2 cups Brown Rice";
      this.buildMeal4 = "Potential Snacks: Protien Bars, Fruits, Yogurt";
      
      this.maintainMeal1 = "Breakfast: 3 servings Eggs with Toast";
      this.maintainMeal2 = "Lunch: 1 serving Greek Meatball Mezze Bowl";
      this.maintainMeal3 = "Dinner: 1 serving Pork Chops with Garlicky Broccoli";
      this.maintainMeal4 = "Potential Snacks: Protien Bar, Protien Shake, Fruits, Smoothies";
   }//end constructor

    
   public void getCutMeal(){
      System.out.println("Cut Meal Plan:");
      System.out.println(" " + this.cutMeal1);
      System.out.println(" " + this.cutMeal2);
      System.out.println(" " + this.cutMeal3);
      System.out.println(" " + this.cutMeal4);
   }// end get cut meal plan

      
   public void setCutMeal(){
      System.out.println("Change Meal here:");
      System.out.println("Meal 1:");
      Scanner input1 = new Scanner(System.in);
      String meal1 = input1.nextLine();
      this.cutMeal1 = meal1;

      System.out.println("Meal 2:");
      Scanner input2 = new Scanner(System.in);
      String meal2 = input2.nextLine();
      this.cutMeal2 = meal2;

      System.out.println("Meal 3:");
      Scanner input3 = new Scanner(System.in);
      String meal3 = input3.nextLine();
      this.cutMeal3 = meal3;

      System.out.println("Meal 4:");
      Scanner input4 = new Scanner(System.in);
      String meal4 = input4.nextLine();
      this.cutMeal4 = meal4;

   }// end set cut meal plan
      
      
   public void getBuildMeal(){
      System.out.println("Build Meal Plan:");
      System.out.println(" " + this.buildMeal1);
      System.out.println(" " + this.buildMeal2);
      System.out.println(" " + this.buildMeal3);
      System.out.println(" " + this.buildMeal4);
   }// end get build meal plan

   public void setBuildMeal(){
      System.out.println("Change Meal here:");
      System.out.println("Meal 1:");
      Scanner input1 = new Scanner(System.in);
      String meal1 = input1.nextLine();
      this.buildMeal1 = meal1;

      System.out.println("Meal 2:");
      Scanner input2 = new Scanner(System.in);
      String meal2 = input2.nextLine();
      this.buildMeal2 = meal2;

      System.out.println("Meal 3:");
      Scanner input3 = new Scanner(System.in);
      String meal3 = input3.nextLine();
      this.buildMeal3 = meal3;

      System.out.println("Meal 4:");
      Scanner input4 = new Scanner(System.in);
      String meal4 = input4.nextLine();
      this.buildMeal4 = meal4;

   }// end set build meal plan

   public void getMaintainMeal(){
      System.out.println("Maintain Meal Plan:");
      System.out.println(" " + this.maintainMeal1);
      System.out.println(" " + this.maintainMeal2);
      System.out.println(" " + this.maintainMeal3);
      System.out.println(" " + this.maintainMeal4);
   }//end get maintain meal plan

   public void setMaintainMeal(){
      System.out.println("Change Meal here:");
      System.out.println("Meal 1:");
      Scanner input1 = new Scanner(System.in);
      String meal1 = input1.nextLine();
      this.maintainMeal1 = meal1;

      System.out.println("Meal 2:");
      Scanner input2 = new Scanner(System.in);
      String meal2 = input2.nextLine();
      this.maintainMeal2 = meal2;

      System.out.println("Meal 3:");
      Scanner input3 = new Scanner(System.in);
      String meal3 = input3.nextLine();
      this.maintainMeal3 = meal3;

      System.out.println("Meal 4:");
      Scanner input4 = new Scanner(System.in);
      String meal4 = input4.nextLine();
      this.maintainMeal4 = meal4;

   }//end set maintain meal plan
}//end meal class
