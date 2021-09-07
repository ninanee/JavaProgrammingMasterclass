package com.yunni;

public class main {
    public static void main(String[] args){
//        BankAccount test = new BankAccount();
//        test.setCustomerName("bob brown");
//        test.deposit(100);
//        System.out.println(test.getBalance());
//        test.withdraw(1000);
//        System.out.println(test.getBalance());
//        BankAccount test2 = new BankAccount(123,0.00, "nina", "5146606666");

//        VipCustomer person1 = new VipCustomer();
//        System.out.println(person1.getVipName());
//
//        VipCustomer person2 = new VipCustomer("bob" , 200000);
//        System.out.println(person2.getVipName());
//
//        VipCustomer person3 = new VipCustomer("ann", 99, "nn@fake.com");
//        System.out.println(person3.getVipCreditLimit());
//        Wall wall = new Wall(5,4);
//        System.out.println("area= " + wall.getArea());
//
//        wall.setHeight(-1.5);
//        System.out.println("width= " + wall.getWidth());
//        System.out.println("height= " + wall.getHeight());
//        System.out.println("area= " + wall.getArea());
//
//        Wall wall1 = new Wall(-1.25,-1.25);
//        System.out.println("width= " + wall1.getWidth());
//        System.out.println("height= " + wall1.getHeight());
//        System.out.println("area= " + wall1.getArea());
//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());
//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
