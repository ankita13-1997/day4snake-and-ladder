package com.JavaParactice;

import java.util.Scanner;

public class SnakeLadderUc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		Scanner sc=new Scanner(System.in);
		int pos=0;
		int posfinal =100;
		int inipos=0;
		System.out.println("lets have a game play");
		//System.out.println("please roll the die");
		String s="START";
		System.out.println("please roll the die");
		String st=sc.next();
		int roll=0;
		
		
		if(s.toLowerCase().toUpperCase().contains(st.toLowerCase().toUpperCase()))
				{  
			       
			       int no=0;
			       int ladder=1;
			       int snake=2;
			       
			       while(pos<=100) {
			    	   int play=(int)(Math.floor(Math.random()*10)%3);
				       System.out.println("chance : "+play);
			       if(play==no)
			         {
			    	   System.out.println("pass the chance");
			         }
			       else 
			       {   
			    	    roll = (int) (Math.floor(Math.random()*(6-1+1)+1)); 
		    	        System.out.println("your dice shows : "+roll);
			    	    if(play==ladder)
			    	       {
			    	    	System.out.println("yeppp!!! you got ladder");
			    	    	pos=pos+roll;
			    	    	temp=pos;
			    	    	System.out.println("your dice postion is " +pos);
			    	       }
			    	    else
			    	         {
			    	    	  System.out.println("oops!!! you faced a snake");
			    	    	  pos=pos-roll;
			    	    	  temp=pos;
			    	    	      if(pos<0)
			    	    	      {
			    	    	    	  pos=0;
			    	    	    	  temp=pos;
			    	    	    	  System.out.println("your dice postion is " +pos);
			    	    	      }
			    	    	      else
			    	    	           {
			    	    	    	    System.out.println("your dice postion is " +pos);
			    	    	           }
			    	    	      
			    	         }
			       
			      
				  }
		 
				}
		    
				}
		    
		   

	}

}
