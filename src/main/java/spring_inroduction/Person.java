package spring_inroduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;

    @Autowired
    public Person(@Qualifier("catBean") Pet pet){
        System.out.println("Person bean is created");
        this.pet=pet;
    }

    public void callYourPet(){
        System.out.println("Hello, Pet!");
        pet.say();
    }
}
