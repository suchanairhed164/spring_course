package spring_inroduction;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{
    public Dog(){
        System.out.println("Dos bean is created");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}