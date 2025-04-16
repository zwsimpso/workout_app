//Calorie interface 
//This will allow for the user to track their calories.
public interface Calories{
    int cutMealCalories = 1187;
    int buildMealCalories = 2514;
    int maintainMealCalories = 1220;
    int cutWorkCalories = 2000;
    int buildWorkCalories = 1500;
    int maintainWorkCalories = 1000;
 
    public int cutCaloriesLost();
    public int buildCaloriesLost();
    public int maintainCaloriesLost();
 }//end interface 