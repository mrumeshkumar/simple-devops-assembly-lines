package com.mycompany.app;

public class calculate {
	 private int val1;
	  private int val2;
	  public calculate(int val1, int val2){
	    this.val1 = val1;
	    this.val2 = val2;
	  }
	  public int add(){
	    return val1 + val2;
	  }
	  public int subtract(){
	    return val1 - (val2);
	  }
	  public int multiply(){
	    return val1 * val2;
	  }
	  public int divison(){
	    return val1/val2;
	  }
}
