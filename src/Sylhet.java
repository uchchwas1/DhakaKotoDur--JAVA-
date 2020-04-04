/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author $Noshin.
 */

public class Sylhet extends CommonGoods   {
	private int tea;
        public int[] arr;
    public Sylhet() {
    }

   

    public Sylhet(int tea, int rice, int wheat, int milk) {
        super(rice, wheat, milk);
        this.tea = tea;
        arr=new int[]{tea, rice,wheat, milk};
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


    public int gettea() {
        return tea;
    }

    public void settea(int tea) {
        this.tea = tea;
    }

   
    @Override
    public String toString() {
        return "Sylhet{" + "tea=" + tea +" "+ super.toString()+'}';
    }  

}
