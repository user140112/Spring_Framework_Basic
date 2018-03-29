package com.springpractice.first.test;

public class Patient {

	private int id;
	private String name;
	private int nid;
	private Address address;

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public static Patient getInstance(int id, String name) {
		System.out.println("Creating new Patient using factorymethod");
		return new Patient(id, name);
	}

	public void init() {
		System.out.println("Patient created : " + this);
	}

	public void destroy() {
		System.out.println("Patient is destroyed");
	}

	public Patient(int id, String name) {
		// super();
		this.id = id;
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", nid=" + nid + ", address=" + address + "]";
	}

}
