package com.company;

public class Car {
     public String color = "white";
     private int maxSpeed;
     public void carInfo(){
        System.out.println("Car color: "+color + " Max speed: "+ maxSpeed);
    }
    public void setColor(String color){
        this.color = color;
    }
    public  void setMaxSpeed(int speed){
        this.maxSpeed = speed;
    }
}
