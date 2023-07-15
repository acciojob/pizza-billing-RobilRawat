package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;


  boolean Ealready= false;
    boolean Talready= false;
    boolean Balready= false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            this.price= 300;

        }else{
            this.price= 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(Ealready==false){
            price+=80;
          Ealready=true;
        }



    }

    public void addExtraToppings(){
        // your code goes here

        if(Talready==false){
            if(isVeg){
                price+= 70;
            }else{
                price+=120;
            }
            Talready= true;
        }



    }

    public void addTakeaway(){
        // your code goes here
        if(Balready==false){
            price+=20;
            Balready= true;
        }
    }

    public String getBill(){
        // your code goes here
            bill= Integer.toString(price);
        return this.bill;
    }
}
