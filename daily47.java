/*
JIMMY T - 
Good morning! Here's your coding interview problem for today.

This problem was asked by Facebook.

Given a array of numbers representing the stock prices of a company in chronological order, write a function that calculates the maximum profit you could have made from buying and selling that stock once. You must buy before you can sell it.

For example, given [9, 11, 8, 5, 7, 10], you should return 5, since you could buy the stock at 5 dollars and sell it at 10 dollars.
*/


import java.util.*;
import java.io.*;


public class daily47{
	public static void main(String argzzz[]){
		int [] stockArray = {9,11,8,5,7,10}; //5
		int [] stockArray2 = {2,11,8,20,7,10};	//18
		System.out.println(checkGreatestProfit(stockArray));
		System.out.println(checkGreatestProfit(stockArray2));

	}
	//increments through the array comparing differences of itself to the upcomings
	//keeps track of max difference
	//returns max
	public static int checkGreatestProfit(int[] array){
		int MAX_PROFIT = 0;
		int COUNTER = 0;
		for(int stocks : array){
			for(int x = array.length-1; x > COUNTER;x--){
				int STOCK_PROFIT = array[x] - stocks;
				if(STOCK_PROFIT > MAX_PROFIT){
					MAX_PROFIT = STOCK_PROFIT;
				}
			}
			COUNTER++;
		}
		return MAX_PROFIT;
	}
}
