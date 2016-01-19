package com.rmi.server;

import java.nio.channels.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class BMIServer {
	
public static void main (String[] argv) throws RemoteException, AlreadyBoundException
{
	try
{
		BMIImpl b = new BMIImpl();
		Registry registry=LocateRegistry.createRegistry(230);
		registry.bind("BMI1",b);
		System.out.println("server started");
}
catch (Exception e)
{
	System.out.println ("BMI server failed: " + e);
	}
	}
}


