class Main {
  public static void main(String[] args) {
    String[] roster1 = {"chris ", "mike ", "jhon ", "jack ", "bob ", "fredrick ", "joe ", "han ", "jones ", "dasher "};
      String[] roster2 = new String[10];

    for (int i = 3; i < 10; i++)
        {
          roster2 = roster1;
          System.out.println(roster2[5] + "is next to a confession stand.");
        }
  }
}