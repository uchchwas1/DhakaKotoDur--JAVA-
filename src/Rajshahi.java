/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author $Noshin.
 */

public class Rajshahi extends CommonGoods  {
	  private int silk;
	  private int mango;
	  private int lichi;
          public int[] arr;


	    public Rajshahi() {
	    }

	   

	    public Rajshahi(int silk, int mango, int rice, int lichi, int wheat, int milk) {
	        super(rice, wheat, milk);
	        this.silk = silk;
	        this.mango = mango;
	        this.lichi = lichi;
                arr=new int[]{silk, mango, rice, lichi,wheat, milk};
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


	    public int getsilk() {
	        return silk;
	    }

	    public void setsilk(int silk) {
	        this.silk = silk;
	    }

	    public int getmango() {
	        return mango;
	    }

	    public void setmango(int mango) {
	        this.mango = mango;
	    }
	    public int getlichi() {
	        return lichi;
	    }

	    public void setlichi(int lichi) {
	        this.lichi = lichi;
	    }

	    @Override
	    public String toString() {
	        return "Rajshahi{" + "silk=" + silk + ", mango=" + mango +"  lichi=" + lichi +" "+ super.toString()+ '}';
	    }


}
