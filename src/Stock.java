/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author notda
 */
public class Stock {
     String name,symbol ; 
     double previousClosingPrice,currentPrice ;

     Stock(String name, String symbol){
       this.name = name;
       this.symbol = symbol;
       this.previousClosingPrice = 0;
       this.currentPrice = 0;
     }
     
     public void setPreviousClosingPrice(double previousClosingPrice)
     {
         this.previousClosingPrice = previousClosingPrice;
     }
     
     public void setCurrentPrice(double currentPrice)
     {
         this.currentPrice = currentPrice;
     }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
     
     public String getChangePercent() {
        double percent = ( 100/previousClosingPrice ) * ( currentPrice - previousClosingPrice );
        return ("Symbol : " + symbol +"\nName : "+name +"\nPrevious Closing Price : "+previousClosingPrice+"\nCurrent Price : "+ currentPrice +" \nPrice Change : "+percent+"%") ;
    }
}
