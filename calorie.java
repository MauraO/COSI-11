import java.util.Scanner;

public class calorie {

  public static String[] breakfast_items = {"eggs", "bacon", "bread",
  "cereal", "bagel", "pancakes", "tator totts"};
  public static String[] lunch_items = {"burger", "pizza", "salad", "buritto",
  "chicken soup", "BLT sandwich", "sushi", "pasta", "stir fried rice"};
  public static int[] lunch_calories = {350, 285, 291, 440, 87, 364, 375, 75, 228};


  public static void main(String[] args){
<<<<<<< HEAD
<<<<<<< HEAD

    welcome();
  }


    public static void welcome() {
      System.out.println("Welcome to Calorie Counter!");
      System.out.println("Please choose an item for breakfast: eggs, bacon, bread,
      cereal, bagel, pancakes, tater tots");
      String breakfast = TextIO.getln();
      System.out.printf("You have entered %s%n", breakfast);
=======
    System.out.println(breakfast_calories(welcome()));
=======
    int total_calories = breakfast_calories(welcome());
    System.out.printf("Your total calories are %d%n", total_calories);
    cal_stats(total_calories);
>>>>>>> da3fd625a02813d986f4cae4c27a7376c9ffbffe
  }

    public static String[] welcome() {
      // breakfast food name array
      String[] food = new String[2];
      // calorie count array
      System.out.println("Welcome to Calorie Counter!");
      System.out.println("You have 1500 calories for the day.");

      System.out.println("Please choose an item for breakfast: " +
      java.util.Arrays.toString(breakfast_items));
>>>>>>> 715ee9d46c75eda239d3bc027610413acbb638aa

      Scanner console = new Scanner (System.in);
      String breakfast = console.next();



      System.out.println("Please choose an item for lunch: " +
      java.util.Arrays.toString(lunch_items));
      String lunch = console.next();
      food[0] = breakfast;
      food[1] = lunch;
      return food;
    }

    public static int breakfast_calories(String[] food){
      int[] calories = {72, 763, 77, 140, 289, 290, 200};
      int cal_index_brk = 0;
      int cal_index_lnch = 0;

      for(int i = 0; i<breakfast_items.length; i++){
        if(breakfast_items[i].equals(food[0])){
          cal_index_brk = i;
        }
      }
      for(int i = 0; i<lunch_items.length; i++){
        if(lunch_items[i].equals(food[1])){
          cal_index_lnch = i;
        }
      }
      return (calories[cal_index_brk] + lunch_calories[cal_index_lnch]);
    }

    public static void cal_stats(int total_calories){

      System.out.println();
      int cals_left;
      if(total_calories > 1500){
        System.out.printf("You have exceeded your calorie limit!");
      }
      else if(total_calories < 1500){
        cals_left = 1500 - total_calories;
        System.out.printf("You have %d calories left for dinner. %n", cals_left);
      }


    }


  }
