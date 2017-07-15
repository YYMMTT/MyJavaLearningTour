class Animal{
    public int age=10;
    public String name;
    public void eat(){
     System.out.println("动物具有吃东西的能力");
    }
    public Animal(){
        System.out.println("年龄："+age+"Animal类执行了");
    }

}
 class Cat extends Animal {
     public int age=20;
     public void eat() {
         System.out.println("年龄：" + age + "小猫可以吃东西");
     }
     public Cat() {
         System.out.println("Cat类执行了");
     }
     public void test(){
         super.eat();
     }
 }
public class initail {
    public static void main(String[]args){
        Animal animal=new Animal();
        Cat c=new Cat();
        c.eat();
        c.test();
    }
    }

