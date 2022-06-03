package day17_customClass;

public class Dog {

    public String name; //instance variable
    public String bread;
    public String size;
    public int age;
    public String color;
    public char gender;

                        //"Max",      "Husky"      'M'             4      "small"      "White"
    public void setInfo(String name, String bread, char gender, int age, String size, String color){
        this.name = name; //this keyword is used for calling the instance variable name
        this.bread = bread;
        this.gender = gender;
        this.age = age;
        this.size= size;
        this.color = color;
    }// this method can help us to set all the information of the dog at once

    public void eat(){
        System.out.println(name +" is eating");

    }

    public void drink(){
        System.out.println(name + " is drinking water");
    }

    //right click, generate, toString
    // we will not be able to print the objects of this class if we do not create toString method

    public String toString() { //to avoid getting hashcodes when we print the class objects
        return "Dog{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }


    /*

    above we did the shortcut, this is another way

    public String toString(){

        return "Dog Name: "+name + ", Dog Gender: "+gender;
    }
    */



}
