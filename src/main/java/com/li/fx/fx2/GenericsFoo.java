package com.li.fx.fx2;


public class GenericsFoo<T> {
	private T x;
	GenericsFoo(T x){
		this.x = x;
	}
 public void setX(T x){
	  this.x=x;
  }
 public T getX(){
	 
	return x;
	  
 }
}
