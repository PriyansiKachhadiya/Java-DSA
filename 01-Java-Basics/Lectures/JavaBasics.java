public class JavaBasics {

  public static void main(String args[]) {
    Pen p1 = new Pen();
    p1.changeColor("Blue");
    System.out.println(p1.color);
    p1.changeTip(5);
    System.out.println(p1.tip);
  }

}

class Pen {
  String color;
  int tip;

  void changeColor(String newColor) {
    color = newColor;
  };

  void changeTip(int newTip) {
    tip = newTip;
  };
}