public class calorie {
  public static void main(String[] args){
    welcome();
  }

    public static void welcome() {
      System.out.println("Welcome to Calorie Counter!");
      System.out.println("Please enter an item for breakfast: ");
      String breakfast = TextIO.getln();
      System.out.printf("You have entered %s%n", breakfast);
    

    }
}
