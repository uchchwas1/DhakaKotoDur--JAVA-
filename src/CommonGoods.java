/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author $Uchchwas.
 */
public abstract class CommonGoods {
private int rice;
private int wheat;
private int milk;

     public CommonGoods() {
       }
    public CommonGoods(int rice, int wheat, int milk) {
        this.rice = rice;
        this.wheat = wheat;
        this.milk = milk;
    }

    public int getRice() {
        return rice;
    }

    public void setRice(int rice) {
        this.rice = rice;
    }

    public int getWheat() {
        return wheat;
    }

    public void setWheat(int wheat) {
        this.wheat = wheat;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "CommonGoods{" + "rice=" + rice + ", wheat=" + wheat + ", milk=" + milk + '}';
    }
    
    
}