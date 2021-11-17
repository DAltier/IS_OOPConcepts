public class Lamp {

  boolean isItOn = false;


  void turnOn() {

    isItOn = true;

  }


  void turnOff() {

    isItOn = false;

  }

  void printState() {

    System.out.println("Is the lamp on? " + isItOn);
    
  }
}