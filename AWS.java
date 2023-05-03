package batchapplication;

public class AWS 
{
	private int stdId;
	private String stdName;
	private String email;
	private long phone;
	
	//getter and setter method
	public int getStdId()
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
	public String setEmaiul(String email)
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
	public AWS()
	{
		super();
	}
	
	public AWS(int stdId, String stdName, String email, long phone)
	{
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.email = email;
		this.phone = phone;
	}
}
