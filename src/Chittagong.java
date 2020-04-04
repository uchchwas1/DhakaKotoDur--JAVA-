/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author $Uchchwas.
 */
public class Chittagong extends CommonGoods  {
  private int shutki;
  private int fish;
  public int[] arr;
    public Chittagong() {
    }

   

    public Chittagong(int shutki, int fish, int rice, int wheat, int milk) {
        super(rice, wheat, milk);
        this.shutki = shutki;
        this.fish = fish;
        arr=new int[]{shutki,  fish,  rice, wheat, milk};
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


    public int getShutki() {
        return shutki;
    }

    public void setShutki(int shutki) {
        this.shutki = shutki;
    }

    public int getFish() {
        return fish;
    }

    public void setFish(int fish) {
        this.fish = fish;
    }

    @Override
    public String toString() {
        return "Chittagong{" + "shutki=" + shutki + ", fish=" + fish + " "+ super.toString()+'}';
    }
  
}
