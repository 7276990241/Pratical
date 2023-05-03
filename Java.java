package batchapplication;

public class Java 
{
	private int stdId;
	private String stdName;
	private String email;
	private long phone;
	
	//getter and setter method
	public int getId()
	{
		return stdId;
	}
	public void setStdId(int stdId)
	{
		this.stdId = stdId;
	}
	public String getStdName()
	{
		return stdName;
	}
	public void setStdName(String stdName)
	{
		this.stdName = stdName;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public long getPhone()
	{
		return phone;
	}
	public void setPhone(long phone)
	{
		this.phone = phone;

	}
	
	//parametered constructor
	public Java(int stdId, String stdName, String email, long phone)
	{
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.email= email;
		this.phone = phone;
	}

	//no-args constructor
	public Java()
	{
		super();
	}
}
