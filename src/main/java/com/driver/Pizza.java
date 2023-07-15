package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int totalPrice;


  boolean Ealready= false;
    boolean Talready= false;
    boolean Balready= false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            this.price= 300;
           this.bill=  "Base Price of Veg Pizza: "+300 +"\n";

        }else{
            this.price= 400;
            this.bill = "Base Price Of Non Veg Pizza: "+400 +"\n";
        }


    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(Ealready==false){
            totalPrice = totalPrice +80;
            this.bill = this.bill + "Extra cheese added: "+80+"\n";

          Ealready=true;
        }



    }

    public void addExtraToppings(){
        // your code goes here



        if(Talready==false){
            if(isVeg){

                totalPrice = totalPrice + 70;
                this.bill = this.bill + "Extra Toppings added: "+70+"\n";
            }else{

                totalPrice = totalPrice + 120;
                this.bill = this.bill + "Extra Toppings added: "+120+"\n";
            }
            Talready= true;
        }



    }

    public void addTakeaway(){
        // your code goes here
        if(Balready==false){

            totalPrice = totalPrice + 20;
            this.bill = this.bill + "Paper Bag added: "+20+"\n";
            Balready= true;
        }
    }

    public String getBill(){
        // your code goes here
//            bill= Integer.toString(price);
        this.bill = this.bill + "Total Bill Price is: "+totalPrice+"\n";
        return bill;

    }
}
