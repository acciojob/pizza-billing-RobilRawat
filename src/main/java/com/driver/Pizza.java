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
            this.totalPrice= 300;

           this.bill=  "Base Price Of The Pizza: "+300 +"\n";

        }else{
            this.totalPrice= 400;
            this.bill = "Base Price Of The Pizza: "+400 +"\n";
        }


    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(Ealready==false){

            totalPrice = totalPrice +80;
            this.bill = this.bill + "Extra Cheese Added: "+80+"\n";

          Ealready=true;
        }



    }

    public void addExtraToppings(){
        // your code goes here



        if(Talready==false){
            if(isVeg){

                totalPrice = totalPrice + 70;
                this.bill = this.bill + "Extra Toppings Added: "+70+"\n";
            }else{

                totalPrice = totalPrice + 120;
                this.bill = this.bill + "Extra Toppings Added: "+120+"\n";
            }
            Talready= true;
        }



    }

    public void addTakeaway(){
        // your code goes here
        if(Balready==false){

            totalPrice = totalPrice + 20;
            this.bill = this.bill + "Paperbag Added: "+20+"\n";
            Balready= true;
        }
    }

    public String getBill(){
        // your code goes here
//            bill= Integer.toString(price);
        this.bill = this.bill + "Total Price: "+totalPrice+"\n";
        return bill;

    }
}
