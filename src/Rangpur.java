/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author $Noshin.
 */

public class Rangpur extends CommonGoods   { 
	private int satranji;
        public int[] arr;
    public Rangpur() {
    }

   

    public Rangpur(int satranji, int rice, int wheat, int milk) {
        super(rice, wheat, milk);
        this.satranji = satranji;
        arr=new int[]{ satranji, rice, wheat, milk};
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


    public int getsatranji() {
        return satranji;
    }

    public void setsatranji(int satranji) {
        this.satranji = satranji;
    }

   
    @Override
    public String toString() {
        return "Rangpur{" + "satranji=" + satranji +" "+ super.toString()+'}';
    }  

}
