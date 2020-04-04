
import static java.lang.Math.E;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
public class Barisal extends CommonGoods  {
  private int sweets;
  private int fish;
  private int sondesh;
  public int[] arr;
    public Barisal() {
    }

   

    public Barisal (int sweets, int fish, int sondesh,int rice, int wheat, int milk)  {
        super(rice, wheat, milk);
        this.sweets = sweets;
        this.fish = fish;
        this.sondesh=sondesh;
        arr=new int[]{sweets,  fish,  sondesh, rice, wheat, milk};
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
    public int getSweets () {
        return sweets;
    }

    public void setSweets (int sweets) {
        this. sweets = sweets;
    }

    public int getFish() {
        return fish;
    }

    public void setFish(int fish) {
        this.fish = fish;
    }
    public int getSondesh() {
        return sondesh;
    }

    public void setSondesh(int sondesh) {
        this.sondesh = sondesh;
    }

    @Override
    public String toString() {
        return "Barisal{" + "sweets=" + sweets + ", fish=" + fish + ", sondesh=" + sondesh +" "+ super.toString()+'}';
    }

    


   
  
}
