public interface IRadio {
  
  void turnOn();
  void turnOff();
  void increaseVolume(int increment);
  void decreaseVolume(int decrement);
  void changeStation(double newStation);
  void printState();
  
}
