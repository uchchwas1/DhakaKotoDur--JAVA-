/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
public class Khulna extends CommonGoods  {
  private int honey;
  private int bambooStick;
  public int[] arr;
    public Khulna () {
    }

   

    public Khulna (int honey, int bambooStick, int rice, int wheat, int milk) {
        super(rice, wheat, milk);
        this. honey = honey;
        this. bambooStick = bambooStick;
        arr =new int[]{honey,  bambooStick,  rice, wheat, milk};
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


    public int getHoney() {
        return honey;
    }

    public void setHoney(int honey) {
        this.honey = honey;
    }

    public int getBambooStick() {
        return bambooStick;
    }

    public void setBambooStick(int bambooStick) {
        this. bambooStick = bambooStick;
    }

    @Override
    public String toString() {
        return " Khulna {" + " honey =" + honey + ", bambooStick =" + bambooStick + " "+ super.toString()+ '}';
    }
  
}
