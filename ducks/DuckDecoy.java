package ducks;
public class DuckDecoy {
  QuackBehavior quackBehavior;

  public DuckDecoy() {
    quackBehavior = new Quack();
  }

  public void performQuack() {
    quackBehavior.quack();
  }
}
