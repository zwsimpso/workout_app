//Workout class 

import java.util.*;

public class Workouts{

   String cutWork1;
   String cutWork2;
   String cutWork3;
   String cutWork4;
   String cutWork5;
   
   String buildWork1;
   String buildWork2;
   String buildWork3;
   String buildWork4;
   String buildWork5;

   String maintainWork1;
   String maintainWork2;
   String maintainWork3;
   String maintainWork4;
   String maintainWork5;

   public void Workouts(){
      this.cutWork1 = "Rowing Machine: 2 sets, 15 min low intesity, 30 sec rest";
      this.cutWork2 = "Jumping Rope: 3 sets, 2 min, 30 sec rest";
      this.cutWork3 = "Treadmill: 3 sets, 2 min good pacing, 30 sec walking rest";
      this.cutWork4 = "Bench: 4 sets, 12 reps";
      this.cutWork5 = "Squat: 4 sets, 12 reps";
      
      this.buildWork1 = "Bench: 3 sets, 7,6,5 reps";
      this.buildWork2 = "Squat: 3 sets, 7,6,5 reps";
      this.buildWork3 = "Barbell Deadlift: 3 sets, 7,6,5 reps";
      this.buildWork4 = "Seated Overhead Shoulder Press: 3 sets, 7,6,5 reps";
      this.buildWork5 = "Potential Supplementary Lifts: Lateral Raises, Bicep Curls, Tricep Pushdowns";
      
      this.maintainWork1 = "Kettlebell Front Squat: 3 sets, 10 reps";
      this.maintainWork2 = "Kettlebell High Pull: 3 sets, 20 reps";
      this.maintainWork3 = "Kettlebell Romanian Deadlift: 3 sets, 10 reps";
      this.maintainWork4 = "Kettlebell Swings: 3 sets, 20 reps";
      this.maintainWork5 = "Kettlebell Clean and Press: 3 sets, 10 reps each side";
   }//end constructor

   //allow display of workout to user
   public void getCutWork(){
      System.out.println("Cut Workout Plan:");
      System.out.println(" " + this.cutWork1);
      System.out.println(" " + this.cutWork2);
      System.out.println(" " + this.cutWork3);
      System.out.println(" " + this.cutWork4);
      System.out.println(" " + this.cutWork5); 
   }// end get cut workout

   //allows admin to change workout
   public void setCutWork(){
      System.out.println("Change workout here:");
      System.out.println("Workout 1:");
      Scanner input1 = new Scanner(System.in);
      String work1 = input1.nextLine();
      this.cutWork1 = work1;

      System.out.println("Workout 2:");
      Scanner input2 = new Scanner(System.in);
      String work2 = input2.nextLine();
      this.cutWork2 = work2;

      System.out.println("Workout 3:");
      Scanner input3 = new Scanner(System.in);
      String work3 = input3.nextLine();
      this.cutWork3 = work3;

      System.out.println("Workout 4:");
      Scanner input4 = new Scanner(System.in);
      String work4 = input4.nextLine();
      this.cutWork4 = work4;

      System.out.println("Workout 5:");
      Scanner input5 = new Scanner(System.in);
      String work5 = input5.nextLine();
      this.cutWork5 = work5;
   }

   //allow display of workout to user
   public void getBuildWork(){
      System.out.println("Build Workout Plan:");
      System.out.println(" " + this.buildWork1);
      System.out.println(" " + this.buildWork2);
      System.out.println(" " + this.buildWork3);
      System.out.println(" " + this.buildWork4);
      System.out.println(" " + this.buildWork5);
   }// end get build workout

   //allow for user to change workout
   public void setBuildWork(){
      System.out.println("Change workout here:");
      System.out.println("Workout 1:");
      Scanner input1 = new Scanner(System.in);
      String work1 = input1.nextLine();
      this.buildWork1 = work1;

      System.out.println("Workout 2:");
      Scanner input2 = new Scanner(System.in);
      String work2 = input2.nextLine();
      this.buildWork2 = work2;

      System.out.println("Workout 3:");
      Scanner input3 = new Scanner(System.in);
      String work3 = input3.nextLine();
      this.buildWork3 = work3;

      System.out.println("Workout 4:");
      Scanner input4 = new Scanner(System.in);
      String work4 = input4.nextLine();
      this.buildWork4 = work4;

      System.out.println("Workout 5:");
      Scanner input5 = new Scanner(System.in);
      String work5 = input5.nextLine();
      this.buildWork5 = work5;
   }// end set build workout

   //allow display of workout to user
   public void getMaintainWork(){
      System.out.println("Maintain Workout Plan:");
      System.out.println("2 Rounds of:");
      System.out.println(" " + this.maintainWork1);
      System.out.println(" " + this.maintainWork2);
      System.out.println(" " + this.maintainWork3);
      System.out.println(" " + this.maintainWork4);
      System.out.println(" " + this.maintainWork5);
   }//end get maintain workout

   //allow admin to change workout
   public void setMaintainWork(){
      System.out.println("Change workout here:");
      System.out.println("Workout 1:");
      Scanner input1 = new Scanner(System.in);
      String work1 = input1.nextLine();
      this.maintainWork1 = work1;

      System.out.println("Workout 2:");
      Scanner input2 = new Scanner(System.in);
      String work2 = input2.nextLine();
      this.maintainWork2 = work2;

      System.out.println("Workout 3:");
      Scanner input3 = new Scanner(System.in);
      String work3 = input3.nextLine();
      this.maintainWork3 = work3;

      System.out.println("Workout 4:");
      Scanner input4 = new Scanner(System.in);
      String work4 = input4.nextLine();
      this.maintainWork4 = work4;

      System.out.println("Workout 5:");
      Scanner input5 = new Scanner(System.in);
      String work5 = input5.nextLine();
      this.maintainWork5 = work5;
   }//end set maintain workout

}//end workout class
