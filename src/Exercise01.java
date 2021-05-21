/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author notda
 */
public class Exercise01 {
      public static void main(String[] args) {
        String name = "Oracle Coperation";
        String symbol ="ORCL";
       Stock Ex01 = new Stock(name,symbol);
        Ex01.setPreviousClosingPrice(34.5);
        Ex01.setCurrentPrice(34.35);
        System.out.println(Ex01.getChangePercent());
    }
}
