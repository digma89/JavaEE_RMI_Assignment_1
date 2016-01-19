package com.rmi.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
import com.rmi.demo.BMI;


public class BMIClient {
	public static void main (String[] args)throws RemoteException, NotBoundException
	{		
		try
		{			
			
			double weight= Double.parseDouble(JOptionPane.showInputDialog("Enter your weight (Kg): "));
			double height= Double.parseDouble(JOptionPane.showInputDialog("Enter your height (m): "));

			
			Registry registry=LocateRegistry.getRegistry("localhost",230);
			BMI b = (BMI)registry.lookup("BMI1");
			System.out.println ("Your BMI catergory is: " +b.calculate(height,weight));
		}
		catch (Exception e)
		{
				System.out.println ("BMI client exception: " + e);
		}
	}
}


