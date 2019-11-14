
/* @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: Taking Input from command line for temperature 
  			  and velocity as "t" and "v" and calculating the
  			  windchillusing given equation. 								
 * @Date    : 14:11:2019
 * @File    : WindChill.java 
 */

package com.bridgelabz.functional;

public class WindChill 
{
	public static void main(String[] args) 
	{
		int t=Integer.parseInt(args[0]);
		int v=Integer.parseInt(args[1]);
		
		double windchill=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		System.out.println("WindChill :"+windchill);	
		
	}

}
