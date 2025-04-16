Workouts.class: Workouts.java
	javac -g Workouts.java

Meals.class: Meals.java
	javac -g Meals.java

Calories.class: Calories.java
	javac -g Calories.java

User.class: User.java
	javac -g User.java

Main.class: Main.java User.class Workouts.class Meals.class Calories.class
	javac -g Main.java

clean:
	rm *.class

run: Main.class
	java Main

debug: Main.class
	jdb Main