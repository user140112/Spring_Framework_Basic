package com.springpractice.first.test;

public class PatientFactory {

	  public Patient createPatient(int id, String name ) {
		  System.out.println("Creating Patient using Factory Class");
		  return new Patient(id, name);
	  }
}
