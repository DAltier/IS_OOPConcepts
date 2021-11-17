public class Lamp implements ILamp {

  boolean isItOn = false;


  public void turnOn() {

    isItOn = true;

  }


  public void turnOff() {

    isItOn = false;

  }

  public void printState() {

    System.out.println("Is the lamp on? " + isItOn);
    
  }
}