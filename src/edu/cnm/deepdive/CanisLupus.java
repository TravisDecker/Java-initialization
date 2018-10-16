package edu.cnm.deepdive;

public class CanisLupus extends Canis {


  private static String someText = getSomeText();
// happens first thing after super static methods

  private int woldData = getValue();
  // even though this is below the constructor its still initialization first.
  // non constructor instance initialization.

  {
    System.out.println("Entering CanisLupus initialization block");
  }

  public CanisLupus() {
    // Do superclass initialization first
    // Do other instance initialization before constructor
    System.out.println("Entering CanisLupus::new");
  }

  private int getValue() {
    System.out.println("Entering CanisLupus::getValue");
    return 1;
  }

  private static String getSomeText() {
    System.out.println("Entering CanisLupus::getSomeText");
    return "hello";
  }
}
/**
 * non constructor init happens in order by super/sub order then finally the constructor.
 **/
