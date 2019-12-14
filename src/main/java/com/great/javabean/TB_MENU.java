package com.great.javabean;

import java.math.BigDecimal;
import java.util.List;

public class TB_MENU
{
	private BigDecimal MENU_ID;
	private String PARENTNAME;
	private String CHILDNAME;
	private String MENU_URL;


	public TB_MENU(BigDecimal MENU_ID, String PARENTNAME, String CHILDNAME, String MENU_URL)
	{
		this.MENU_ID = MENU_ID;
		this.PARENTNAME = PARENTNAME;
		this.CHILDNAME = CHILDNAME;
		this.MENU_URL = MENU_URL;
	}

	public TB_MENU()
	{
	}

	public BigDecimal getMENU_ID()
	{
		return MENU_ID;
	}

	public void setMENU_ID(BigDecimal MENU_ID)
	{
		this.MENU_ID = MENU_ID;
	}

	public String getPARENTNAME()
	{
		return PARENTNAME;
	}

	public void setPARENTNAME(String PARENTNAME)
	{
		this.PARENTNAME = PARENTNAME;
	}

	public String getCHILDNAME()
	{
		return CHILDNAME;
	}

	public void setCHILDNAME(String CHILDNAME)
	{
		this.CHILDNAME = CHILDNAME;
	}

	public String getMENU_URL()
	{
		return MENU_URL;
	}

	public void setMENU_URL(String MENU_URL)
	{
		this.MENU_URL = MENU_URL;
	}
}
