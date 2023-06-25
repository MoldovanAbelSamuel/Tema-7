package org.fasttrackit;

public class Person {
    private String name;
    private int age;
    private boolean married;

    public Person (String name, int age, boolean married){
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String toString(){
        if (this.married){
            return "The name is " + this.name + " is " + this.age + " age, is married " + "\n";
        } else {
            return "The name is " + this.name + " is " + this.age + " age, isn't married " + "\n";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
