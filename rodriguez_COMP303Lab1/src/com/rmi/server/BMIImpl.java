package com.rmi.server;
import java.rmi.*;
import java.rmi.server.*;
import com.rmi.demo.BMI;


public class BMIImpl extends UnicastRemoteObject implements BMI {

	protected BMIImpl() throws RemoteException {		
	}

	public String calculate(double height, double weight) throws RemoteException {
		return category(weight/(height * height));
	}

	public String category(double bmi) throws RemoteException {
		
		if(bmi >= 25){
			return "Overweight";
		}else if(bmi >= 18.5 && bmi <= 24.9){
			return "Normal";
		}else{			
			return "Underweight";
		}	
	}
	
}
