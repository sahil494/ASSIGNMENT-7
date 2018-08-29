interface Animals
{
public void eat();
public void speak();
}
class Cat implements Animals
{
public void eat()
{
System.out.println("Cat eats food");
}
public void speak()
{
System.out.println("Cats meow");
}
}
class Dog implements Animals
{
public void eat()
{
System.out.println("Dogs eats food");
}
public void speak()
{
System.out.println("Dogs barks");
}
}
class Interface1
{
public static void main(String[] args)
{
Animals a=new Cat();
a.eat();
a.speak();
Animals b=new Dog();
b.eat();
b.speak();
}
}