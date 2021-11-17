public class Radio {
  
  boolean isItOn = false;
  int volume = 3;
  double station = 92.5;

  void turnOn() {

    isItOn = true;

  }


  void turnOff() {

    isItOn = false;

  }


  void increaseVolume(int increment) {

    volume += increment;

  }


  void decreaseVolume(int decrement) {

    volume -= decrement;

  }


  void changeStation(double newStation) {

    station = newStation;

  }


  void printState() {

    System.out.println("Is the radio on? " + isItOn + " at the volume: " + volume + " on the station " + station);
    
  }
}
