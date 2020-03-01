package com.epam.logdemo;

import java.util.Scanner;
import org.apache.logging.log4j.*;

import org.apache.logging.log4j.LogManager;
public class InterestCal {

double computesSimpleInterest(double principal, double rate, double time){
		
		return (principal * rate * time) / 100;
		
	}
	
	double computesCompoundInterest(double principal, double rate, double time){
		
		return principal * (Math.pow((1 + rate / 100), time)); 
		
	}
		

}