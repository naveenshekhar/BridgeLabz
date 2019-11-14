/* @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: Generating unique Coupon number
 * @Date    : 14:11:2019
 * @File    : CouponNumber.java 
 */
package com.bridgelabz.logical;

public class CouponNumber
{
	public static void main(String[] args) 
	{
			char[] ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
			int max = 1000000000;
			int random = (int) (Math.random() * max);
			StringBuffer sb = new StringBuffer();
			while (random > 0) {
				sb.append(ch[random % ch.length]);
				random = random / ch.length;
			}
			String coupon = sb.toString();
			System.out.println("Coupon code :" + coupon);
	}		
}
