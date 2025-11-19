package com.gowri.lld;

public class Encapsulation {

    public Encapsulation() {}

    private int age; //hidden

    public int getAge() {
        return age;
    }

    //only access through public methods
    public void setAge(int age) {
        if(age<0) { //condition logic that protects from storing wrong value
            this.age = age;
        }
        
    }
    
}
