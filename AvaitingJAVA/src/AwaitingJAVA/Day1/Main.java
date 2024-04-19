package AwaitingJAVA.Day1;

public class Main {
    public static void main(String[] args) {

        String name = new String("Daro");

        String someonesName = new String();

        KachiString attempt = new KachiString();

        KachiString attempt1 = new KachiString("Training");

        System.out.println(name);
        System.out.println(someonesName); // empty string.
        System.out.println(attempt);
        System.out.println(attempt1);
        attempt1.callMyName();



        Animal humanDaro = new Animal();
        Animal animalDog = new Animal();

        humanDaro.setAge(15);
        humanDaro.setCanFly(false);
        humanDaro.setName("DaroTutor");
        humanDaro.setNumberOfEyes(2);
        humanDaro.setNumberOfLegs(2);

        animalDog.setAge(5);
        animalDog.setName("Bingo");
        animalDog.setCanFly(true);
        animalDog.setNumberOfLegs(4);
        animalDog.setNumberOfEyes(3);

        System.out.println();
        System.out.println(humanDaro);
        System.out.println(animalDog.getName());






//TODO: FIND ENCAPSULATION...Encapsulation can be done by making all the data members of a class private.
// The class is then provided with a setter and getter method to set and get the data.



//TODO: FIND POLYMORPHISM... When a method has the same name but differs in either return type or parameter list they
// are known as overloaded functions and are an example of polymorphism.
//
//        Vehicle.modelOfVehicle(2014);
//        Vehicle.modelOfVehicle("BMW",2024);


//TODO: CREATE INHERITANCE..where by one class acquires the fields and methods of another class so as not to repeat twice.
// So we have super or parent class and the one receiving is the sub class

//        Car car1 = new Car();
//        car1.go();
//
//        Bicycle bike = new Bicycle();
//        System.out.println(bike.numberOfWheels);


//TODO: FIND/CREATE ABSTRACTION...is the act of using a class and its method to create objects without the details of
// how the class is implemented



    }
}