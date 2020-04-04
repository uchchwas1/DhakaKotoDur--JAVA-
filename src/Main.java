/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author $Uchchwas.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

Scanner input=new Scanner(System.in);
 
boolean condition=true;

Player[] p=new Player[4];
p[0]=new Player();
p[1]=new Player();
p[2]=new Player();
p[3]=new Player();

ArrayList<Object> list=new ArrayList<>();//store Object class 

list.add(new Barisal(220,800,250,38,16,60));
list.add(new Chittagong(400,200,52,15,64));
list.add(new Dhaka());
list.add(new Khulna(250,1,38,16,54));
list.add(new Mymensingh(37,45,16,66));
list.add(new Rajshahi(250,20,70,45,17,60)); 
list.add(new Rangpur(1800,38,16,54));
list.add(new Sylhet(12,51,17,69));


int count=0;
int i=0;
while(condition){
    count=0;
    while(count!=2){// ck double dice for one person
System.out.println("balance "+ p[i].getBalance());
int n=(int)(Math.random()*8);  //generate random number
Object o=list.get(n); // assign object index
System.out.println(o.toString());
  



if(o instanceof Barisal){
    System.out.println("1.Sweet Price: "+((Barisal) o).getSweets());
    System.out.println("2.Fish Price: "+((Barisal) o).getFish());
    int x=input.nextInt();
    int index=x-1;
    int cost=((Barisal) o).getPrice(index);
    p[i].setBalance(cost);
    
   }
else if(o instanceof Chittagong){
    System.out.println("1.Shutki Price: "+((Chittagong) o).getShutki());
    System.out.println("2.Fish Price: "+((Chittagong) o).getFish());
    int x=input.nextInt();
    int index=x-1;
    int cost=((Chittagong) o).getPrice(index);
    p[i].setBalance(cost);
     
}
else if(o instanceof Khulna){
    int x=input.nextInt();
    int index=x-1;
    int cost=((Khulna) o).getPrice(index);
    p[i].setBalance(cost);
}
        
else if(o instanceof Mymensingh){
    int x=input.nextInt();
    int index=x-1;
    int cost=((Mymensingh) o).getPrice(index);
    p[i].setBalance(cost);
}
        
else if(o instanceof Rajshahi){
    int x=input.nextInt();
    int index=x-1;
    int cost=((Rajshahi) o).getPrice(index);
    p[i].setBalance(cost);
}
        
else if(o instanceof Rangpur){
    int x=input.nextInt();
    int index=x-1;
    int cost=((Rangpur) o).getPrice(index);
    
    p[i].setBalance(cost);
}
        
else if(o instanceof Sylhet){
    int x=input.nextInt();
    int index=x-1;
    int cost=((Sylhet) o).getPrice(index);
    p[i].setBalance(cost);
}
else if(o instanceof Dhaka){
    if(p[i].getBalance()!=2000){
    condition=false;
    System.out.println("Congratulation");
    break;
    }
}
count++;
    }
    i++;
    if(i>3)
        i=0;//start from first player
    
    
    
    }
        
        getWinner(p);// who is the winner
}
  public static void getWinner(Player[] p ){
      int max=0;
      int indexNumber=0;
      for(int i=0;i<p.length;i++){
          if(p[i].getBalance()>max)
          {
              max=p[i].getBalance();
              indexNumber=i;
          }
      }
      System.out.println(p[indexNumber].getBalance()+" "+p[indexNumber].getName());
      
  }
}
