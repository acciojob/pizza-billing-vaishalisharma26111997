package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

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
        price+=80;
        System.out.println("Extra Cheese Added: 80");
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg==true)
        {price+=70;
        System.out.println("Extra Toppings Added: 70");}
        else
        {
            {price+=120;
                System.out.println("Extra Toppings Added: 120");}
        }
    }

    public void addTakeaway(){
        // your code goes here
        price+=20;
        System.out.println("Paperbag Added: 20");
    }

    public String getBill()
    {   bill="Total Price:"+price;
        return this.bill;
    }
}
