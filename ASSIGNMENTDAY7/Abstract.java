abstract class Animals
{
  String color;
  String breed;
  String name;
  abstract void eat();
   void speak()
  {
     System.out.println("Animals speak their own language");
  }
}
class Dog extends Animals
{
  void eat()
  {
    System.out.println("Dog eats food");
  }
}
class Abstract
{
  public static void main(String[] args)
  {
    Animals a=new Dog();
    a.eat();
    a.speak();
  }
}