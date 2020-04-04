
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author $Uchchwas.
 */
public class Player {
 private static int numberOfPlayer;
 private String name;
 private static int guestNumber;
 private int balance=2000;
    public Player(){
        this.name="Guest"+guestNumber;
        numberOfPlayer++;
        guestNumber++;
    }
    public Player(String name) {
        this.name=name;
        numberOfPlayer++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setBalance(int b){
        balance-=b;
    }
    public int getBalance(){
        return balance;
    }
    public int getNumberOfPlayer(){
        return numberOfPlayer;
    }
 
   
}