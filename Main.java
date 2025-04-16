//Main class for main menu
//this will direct the entire program

import java.util.*;

public class Main{
  
   public String cutMenu(){
      System.out.println("Please choose from the following");
      System.out.println("1) See current workout plan");
      System.out.println("2) See current meal plan");
      System.out.println("3) Change workout plan");
      System.out.println("4) Change meal plan");
      System.out.println("0) Exit");
      Scanner input = new Scanner(System.in);
      String cutAnswer = input.nextLine();
      return cutAnswer;
   }

   public void cutAnswer(){
      boolean keepGoing = true;
      Workouts myWork1 = new Workouts();
      Meals myMeal1 = new Meals();
      myWork1.Workouts();
      myMeal1.Meals();
      while(keepGoing){
         String cutAnswer = cutMenu();
         if (cutAnswer.equals("1")){
            myWork1.getCutWork();
         }else if (cutAnswer.equals("2")){
            myMeal1.getCutMeal();
         }else if (cutAnswer.equals("3")){
            myWork1.setCutWork();
         }else if (cutAnswer.equals("4")){
            myMeal1.setCutMeal();
         }else if (cutAnswer.equals("0")){
            keepGoing= false;
         }else{
            System.out.println("Not sure I follow, try again.");
         }
      }
   }

   public String buildMenu(){
      System.out.println("Please choose from the following");
      System.out.println("1) See current workout plan");
      System.out.println("2) See current meal plan");
      System.out.println("3) Change workout plan");
      System.out.println("4) Change meal plan");
      System.out.println("0) Exit");
      Scanner input = new Scanner(System.in);
      String buildAnswer = input.nextLine();
      return buildAnswer;
   }

   public void buildAnswer(){
      boolean keepGoing = true;
      Workouts myWork1 = new Workouts();
      Meals myMeal1 = new Meals();
      myWork1.Workouts();
      myMeal1.Meals();
      while(keepGoing){
         String buildAnswer = buildMenu();
         if (buildAnswer.equals("1")){
            myWork1.getBuildWork();
         }else if (buildAnswer.equals("2")){
            myMeal1.getBuildMeal();
         }else if (buildAnswer.equals("3")){
            myWork1.setBuildWork();
         }else if (buildAnswer.equals("4")){
            myMeal1.setBuildMeal();
         }else if (buildAnswer.equals("0")){
            keepGoing= false;
         }else{
            System.out.println("Not sure I follow, try again.");
         }
      }
   }

   public String maintainMenu(){
      System.out.println("Please choose from the following");
      System.out.println("1) See current workout plan");
      System.out.println("2) See current meal plan");
      System.out.println("3) Change workout plan");
      System.out.println("4) Change meal plan");
      System.out.println("0) Exit");
      Scanner input = new Scanner(System.in);
      String maintainAnswer = input.nextLine();
      return maintainAnswer;
   }

   public void maintainAnswer(){
      boolean keepGoing = true;
      Workouts myWork1 = new Workouts();
      Meals myMeal1 = new Meals();
      myWork1.Workouts();
      myMeal1.Meals();
      while(keepGoing){
         String maintainAnswer = maintainMenu();
         if (maintainAnswer.equals("1")){
            myWork1.getMaintainWork();
         }else if (maintainAnswer.equals("2")){
            myMeal1.getMaintainMeal();
         }else if (maintainAnswer.equals("3")){
            myWork1.setMaintainWork();
         }else if (maintainAnswer.equals("4")){
            myMeal1.setMaintainMeal();
         }else if (maintainAnswer.equals("0")){
            keepGoing= false;
         }else{
            System.out.println("Not sure I follow, try again.");
         }
      }
   }

   public String mainMenu(){
      System.out.println("Please choose from the following");
      System.out.println("1) See cut plan");
      System.out.println("2) See build plan");
      System.out.println("3) See maintain plan");
      System.out.println("4) Admin");
      System.out.println("0) Exit");
      Scanner input = new Scanner(System.in);
      String mainAnswer = input.nextLine();
      return mainAnswer;
   }

   public void mainAnswer(){
      boolean keepGoing= true;
      Workouts myWork = new Workouts();
      Meals myMeal = new Meals();
      User myUser = new User();
      myUser.User();
      myWork.Workouts();
      myMeal.Meals();
      while(keepGoing){
         String mainAnswer= mainMenu();
         if (mainAnswer.equals("1")){
	    myWork.getCutWork();
            myMeal.getCutMeal();
            myUser.cutCaloriesLost();
            myUser.getCutCalBurned();
         }else if (mainAnswer.equals("2")){
            myWork.getBuildWork();
            myMeal.getBuildMeal();
            myUser.buildCaloriesLost();
            myUser.getBuildCalBurned();
         }else if (mainAnswer.equals("3")){
	    myWork.getMaintainWork();
            myMeal.getMaintainMeal();
            myUser.maintainCaloriesLost();
            myUser.getMaintainCalBurned();
         }else if (mainAnswer.equals("4")){
            System.out.println("Please enter the passcode:");
            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();
            if(answer.equals("1232")){
	       adminAnswer();
            }else{
               System.out.println("Code is incorrect, please try again.");
            }
         }else if (mainAnswer.equals("0")){
 	    keepGoing= false;
         }else{
            System.out.println("Not sure I follow, try again.");
         }
      }
   }

    public void adminAnswer(){
      boolean keepGoing = true;
      while(keepGoing){
         String answer = adminMenu();
         if (answer.equals("1")){
            cutAnswer();
         }else if (answer.equals("2")){
            buildAnswer();
         }else if (answer.equals("3")){
            maintainAnswer();
         }else if (answer.equals("0")){
            System.out.println("Have a good one!");
            keepGoing = false;
         }else {
            System.out.println("Not sure I follow, try again. ");
         }
      }
   }

   public String adminMenu(){
      System.out.println("Please choose from the following");
      System.out.println("1) Cut plan");
      System.out.println("2) Build plan");
      System.out.println("3) Maintain plan");
      System.out.println("0) Exit");
      Scanner input = new Scanner(System.in);
      String answer = input.nextLine();
      return answer;
   }// end admin menu

   public static void main(String[] args){
      Main myMain = new Main();
      myMain.mainAnswer();
   }
}
