package edu.cnm.deepdive;

public abstract class Canis {

  public static final int FINAL_DATA = -1;
  public static final double FINAL_RANDOM = Math.random();

  private static int staticData = getSomeValue();

  {
    System.out.println("Entering Canis initialization block");
  }

  static {
    System.out.println("Entering Canis static initialization block");
  }
  private int data = getValue();

  public Canis() {
    System.out.println("Entering Canis::new");
  }

  private int getValue() {
    System.out.println("Entering Canis::getValue");
    return 0;
  }

  private static int getSomeValue() {
    System.out.println("Entering Canis::getStaticValue");
    return 1;
  }
}
