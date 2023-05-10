package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppingprize=0;
    boolean isExtracheesAdded=false;
    boolean isExtraToppingAdded=false;
    boolean isTakeAway=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true)
        { price=300;
        System.out.println("Base Price Of The Pizza:"+price);}
        else
        {price=400;
            System.out.println("Base Price Of The Pizza:"+price);}

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

            isExtracheesAdded = true;
            price += 80;
    }

    public void addExtraToppings(){
        // your code goes here

            isExtraToppingAdded = true;
            if (isVeg == true) {
                toppingprize=70;
                price += 70;

            } else {
                {
                    toppingprize=120;
                    price += 120;

                }
            }

    }

    public void addTakeaway(){
        // your code goes here

            isTakeAway = true;
            price += 20;


    }

    public String getBill()
    {
        if(isExtracheesAdded)
        {
            System.out.println("Extra Cheese Added: 80");
        }
        if(isExtraToppingAdded)
        {
            System.out.println("Extra Toppings Added: "+toppingprize);
        }
        if(isTakeAway)
        {
            System.out.println("Paperbag Added: 20");
        }
        bill="Total Price:"+price;
        return this.bill;
    }
}
