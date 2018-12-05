

public static String[] lunch_items = {"burger", "pizza", "salad", "buritto",
  "chicken soup", "BLT sandwich", "sushi", "pasta", "stir fried rice"};
  public static int[] lunch_calories = {350, 285, 291, 440, 87, 364, 375, 75, 228};
  return breakfast_items;

   public static void main(String[] args){
    System.out.println(breakfast_calories(welcome()));
    int total_calories = breakfast_calories(welcome());
    System.out.printf("Your total calories are %d%n", total_calories);
    cal_stats(total_calories);
  }
    public static String[] welcome() {
      // breakfast food name array
       String[] food = new String[2];
      // calorie count array
      System.out.println("Welcome to Calorie Counter!");
      System.out.println("You have 1500 calories for the day.");
      System.out.println("Please choose an item for breakfast: ");
      java.util.Arrays.toString(breakfast_items));
       Scanner console = new Scanner (System.in);
      String breakfast = console.next();
       // displays to user selected breakfast food

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
       int cals_left;
      if(total_calories > 1500){
        System.out.printf("You have exceeded your calorie limit!");
      }
      else if(total_calories < 1500){
        cals_left = 1500 - total_calories;
        System.out.printf("You have %d calories left for the day. %n", cals_left);
  }
}
