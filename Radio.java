public class Radio implements IRadio {
  
  boolean isItOn = false;
  int volume = 3;
  double station = 92.5;

  public void turnOn() {

    isItOn = true;

  }


  public void turnOff() {

    isItOn = false;

  }


  public void increaseVolume(int increment) {

    volume += increment;

  }


  public void decreaseVolume(int decrement) {

    volume -= decrement;

  }


  public void changeStation(double newStation) {

    station = newStation;

  }


  public void printState() {

    System.out.println("Is the radio on? " + isItOn + " at the volume: " + volume + " on the station " + station);
    
  }
}
