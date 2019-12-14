package com.great.javabean;

import java.math.BigDecimal;

public class TB_USER
{
	private BigDecimal RN;
	private BigDecimal USID;
	private String UNAME;
	private String UPASS;
	private String USEX;
	private String UEDU;
	private String USTATE;
	private String UTEL;
	private String UMAIL;
	private BigDecimal UINTEGRAL;
	private String UREGDATE;
	private String UTYPE;
	private BigDecimal UUPLOADNUM;
	private BigDecimal UDOWNLOADNUM;

	public TB_USER(BigDecimal RN,BigDecimal USID, String UNAME, String UPASS, String USEX, String UEDU, String USTATE, String UTEL, String UMAIL, BigDecimal UINTEGRAL, String UREGDATE, String UTYPE, BigDecimal UUPLOADNUM, BigDecimal UDOWNLOADNUM)
	{
		this.RN = RN;
		this.USID = USID;
		this.UNAME = UNAME;
		this.UPASS = UPASS;
		this.USEX = USEX;
		this.UEDU = UEDU;
		this.USTATE = USTATE;
		this.UTEL = UTEL;
		this.UMAIL = UMAIL;
		this.UINTEGRAL = UINTEGRAL;
		this.UREGDATE = UREGDATE;
		this.UTYPE = UTYPE;
		this.UUPLOADNUM = UUPLOADNUM;
		this.UDOWNLOADNUM = UDOWNLOADNUM;
	}

	public TB_USER()
	{
	}

	public TB_USER(BigDecimal USID, String UNAME, String UPASS)
	{
		this.USID = USID;
		this.UNAME = UNAME;
		this.UPASS = UPASS;
	}
	public TB_USER( String UNAME, String UPASS)
	{
		this.UNAME = UNAME;
		this.UPASS = UPASS;
	}

	public BigDecimal getUSID()
	{
		return USID;
	}

	public void setUSID(BigDecimal USID)
	{
		this.USID = USID;
	}

	public String getUNAME()
	{
		return UNAME;
	}

	public void setUNAME(String UNAME)
	{
		this.UNAME = UNAME;
	}

	public String getUPASS()
	{
		return UPASS;
	}

	public void setUPASS(String UPASS)
	{
		this.UPASS = UPASS;
	}

	public String getUSEX()
	{
		return USEX;
	}

	public void setUSEX(String USEX)
	{
		this.USEX = USEX;
	}

	public String getUEDU()
	{
		return UEDU;
	}

	public void setUEDU(String UEDU)
	{
		this.UEDU = UEDU;
	}

	public String getUSTATE()
	{
		return USTATE;
	}

	public void setUSTATE(String USTATE)
	{
		this.USTATE = USTATE;
	}

	public String getUTEL()
	{
		return UTEL;
	}

	public void setUTEL(String UTEL)
	{
		this.UTEL = UTEL;
	}

	public String getUMAIL()
	{
		return UMAIL;
	}

	public void setUEMAIL(String UMAIL)
	{
		this.UMAIL = UMAIL;
	}

	public BigDecimal getUINTEGRAL()
	{
		return UINTEGRAL;
	}

	public void setUINTEGRAL(BigDecimal UINTEGRAL)
	{
		this.UINTEGRAL = UINTEGRAL;
	}

	public String getUREGDATE()
	{
		return UREGDATE;
	}

	public void setUREGDATE(String UREGDATE)
	{
		this.UREGDATE = UREGDATE;
	}

	public String getUTYPE()
	{
		return UTYPE;
	}

	public void setUTYPE(String UTYPE)
	{
		this.UTYPE = UTYPE;
	}

	public BigDecimal getUUPLOADNUM()
	{
		return UUPLOADNUM;
	}

	public void setUUPLOADNUM(BigDecimal UUPLOADNUM)
	{
		this.UUPLOADNUM = UUPLOADNUM;
	}

	public BigDecimal getUDOWNLOADNUM()
	{
		return UDOWNLOADNUM;
	}

	public void setUDOWNLOADNUM(BigDecimal UDOWNLOADNUM)
	{
		this.UDOWNLOADNUM = UDOWNLOADNUM;
	}

	public BigDecimal getRN()
	{
		return RN;
	}

	public void setRN(BigDecimal RN)
	{
		this.RN = RN;
	}

	@Override
	public String toString()
	{
		return "TB_USER{" + "RN=" + RN + ", USID=" + USID + ", UNAME='" + UNAME + '\'' + ", UPASS='" + UPASS + '\'' + ", USEX='" + USEX + '\'' + ", UEDU='" + UEDU + '\'' + ", USTATE='" + USTATE + '\'' + ", UTEL='" + UTEL + '\'' + ", UMAIL='" + UMAIL + '\'' + ", UINTEGRAL=" + UINTEGRAL + ", UREGDATE='" + UREGDATE + '\'' + ", UTYPE='" + UTYPE + '\'' + ", UUPLOADNUM=" + UUPLOADNUM + ", UDOWNLOADNUM=" + UDOWNLOADNUM + '}';
	}
}

