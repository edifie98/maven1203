package com.great.javabean;

import java.math.BigDecimal;

public class TB_LOG
{
	private BigDecimal LOG_ID;
	private String LOG_PERSON;
	private String LOG_THING;
	private String LOG_DATE;
	private BigDecimal USID;
	private String LOG_NULL2;

	public TB_LOG(BigDecimal LOG_ID, String LOG_PERSON, String LOG_THING, String LOG_DATE, BigDecimal USID, String LOG_NULL2)
	{
		this.LOG_ID = LOG_ID;
		this.LOG_PERSON = LOG_PERSON;
		this.LOG_THING = LOG_THING;
		this.LOG_DATE = LOG_DATE;
		this.USID = USID;
		this.LOG_NULL2 = LOG_NULL2;
	}
	public TB_LOG(){

	}

	public BigDecimal getLOG_ID()
	{
		return LOG_ID;
	}

	public void setLOG_ID(BigDecimal LOG_ID)
	{
		this.LOG_ID = LOG_ID;
	}

	public String getLOG_PERSON()
	{
		return LOG_PERSON;
	}

	public void setLOG_PERSON(String LOG_PERSON)
	{
		this.LOG_PERSON = LOG_PERSON;
	}

	public String getLOG_THING()
	{
		return LOG_THING;
	}

	public void setLOG_THING(String LOG_THING)
	{
		this.LOG_THING = LOG_THING;
	}

	public String getLOG_DATE()
	{
		return LOG_DATE;
	}

	public void setLOG_DATE(String LOG_DATE)
	{
		this.LOG_DATE = LOG_DATE;
	}

	public BigDecimal getUSID()
	{
		return USID;
	}

	public void setUSID(BigDecimal USID)
	{
		this.USID = USID;
	}

	public String getLOG_NULL2()
	{
		return LOG_NULL2;
	}

	public void setLOG_NULL2(String LOG_NULL2)
	{
		this.LOG_NULL2 = LOG_NULL2;
	}

	@Override
	public String toString()
	{
		return "TB_LOG{" + "LOG_ID=" + LOG_ID + ", LOG_PERSON='" + LOG_PERSON + '\'' + ", LOG_THING='" + LOG_THING + '\'' + ", LOG_DATE='" + LOG_DATE + '\'' + ", USID=" + USID + ", LOG_NULL2='" + LOG_NULL2 + '\'' + '}';
	}
}
