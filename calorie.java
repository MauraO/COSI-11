import java.util.Scanner;

public class calorie {

  public static String[] breakfast_items = {"eggs", "bacon", "bread",
  "cereal", "bagel", "pancakes", "tator totts"};
  public static String[] lunch_items = {"burger", "pizza", "salad", "buritto",
  "chicken soup", "BLT sandwich", "sushi", "pasta", "stir fried rice"};
  public static int[] lunch_calories = {350, 285, 291, 440, 87, 364, 375, 75, 228};
  return breakfast_items;

  public static void main(String[] args){
    System.out.println(breakfast_calories(welcome()));
  }

    public static String welcome() {
      // breakfast food name array

      // calorie count array
      System.out.println("Welcome to Calorie Counter!");
      System.out.println("Please choose an item for breakfast" +
      java.util.Arrays.toString(breakfast_items));

      Scanner console = new Scanner (System.in);
      String breakfast = console.next();

      // displays to user selected breakfast food
      System.out.printf("You have entered %s%n", breakfast);
      return breakfast;
    }

    public static int breakfast_calories(String breakfast){
      String[] breakfast_items = {"eggs", "bacon", "bread",
      "cereal", "bagel", "pancakes", "tator totts"};
      int[] calories = {72, 763, 77, 140, 289, 290, 200};
      int cal_index = 0;
      for(int i = 0; i<breakfast_items.length; i++){
        if(breakfast_items[i].equals(breakfast)){
          cal_index = i;
        }
      }
      return calories[cal_index];
    }

  }
