package com.rmi.demo;
import java.rmi.*;

public interface BMI extends Remote {
	
	public String calculate(double height, double weight) throws RemoteException;

	public String category(double bmi) throws RemoteException;

}
