package com.hero.democlass.control;

public class Course {
	private int id;
	private String name;
	public Course(int i,String s)
	{
		id=i;
		name=s;
	}
	public void setId(int i)
	{
		id=i;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String s)
	{
		name=s;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return "id"+ id +"name"+name;
	}

}
