/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
public class Mymensingh extends CommonGoods  {
  private int onion;
  private int rice;
  public int[] arr;
    public Mymensingh () {
    }

   

    public Mymensingh (int onion, int rice, int wheat, int milk) {
        super(rice, wheat, milk);
        this. onion = onion;
        this.rice = rice;
        arr=new int[]{ onion, rice, wheat,milk};
    }
    public int  getPrice(int n){
        return arr[n];
    }
  @Override
    public int getRice(){
        return super.getRice();
    }
  @Override
    public int getWheat(){
        return super.getWheat();
    }
  @Override
    public int getMilk(){
        return super.getMilk();
    }


    public int getOnion() {
        return onion;
    }

    public void setOnion(int onion) {
        this. onion = onion;
    }

    

    public void setRice(int rice) {
        this. rice = rice;
    }

    @Override
    public String toString() {
        return " Mymensingh {" + " onion =" + onion + ", rice =" + rice +" "+ super.toString()+ '}';
    }
  
}
