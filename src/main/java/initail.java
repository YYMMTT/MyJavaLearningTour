class Animal{
    public int age=10;
    public String name;
    public void eat(){
     System.out.println("������гԶ���������");
    }
    public Animal(){
        System.out.println("���䣺"+age+"Animal��ִ����");
    }

}
 class Cat extends Animal {
     public int age=20;
     public void eat() {
         System.out.println("���䣺" + age + "Сè���ԳԶ���");
     }
     public Cat() {
         System.out.println("Cat��ִ����");
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

