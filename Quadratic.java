package com.demo;

import java.util.ArrayList;

public class Quadratic {

	 public static void main(String[] args) {
		 
		 quadraticRoots(752, 904, 164);
	 }
	
	 public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
		 
		  int discriminant = b*b - (4*a*c);
		  
		  if(discriminant < 0)
			  System.out.println("Imaginary");
		  
		  else {
			  double d = Math.sqrt(discriminant);
			  double root1 = Math.floor(((-1*b) + d)/(2*a));
			  double root2 = Math.floor(((-1*b) - d)/(2*a));
	      
			  ArrayList roots = new ArrayList();
			  
			  if (root1 > root2) {
				  roots.add(new Integer((int)root1));
				  roots.add(new Integer((int)root2));
			  }
			  else {
				  roots.add(new Integer((int)root2));
				  roots.add(new Integer((int)root1));
			  }
				  
	     
			  return roots;
		  }
		return null;
	 }
}
