package com.great.javabean;

public class TableDate
{
	private int code;
	private String msg;
	private String count;
	private Object data;

	public TableDate()
	{
	}

	public TableDate(int code, String msg, String count, Object data)
	{
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
	}

	public int getCode()
	{
		return code;
	}

	public void setCode(int code)
	{
		this.code = code;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

	public String getCount()
	{
		return count;
	}

	public void setCount(String count)
	{
		this.count = count;
	}

	public Object getData()
	{
		return data;
	}

	public void setData(Object data)
	{
		this.data = data;
	}

	@Override
	public String toString()
	{
		return "TableDate{" + "code=" + code + ", msg='" + msg + '\'' + ", count=" + count + ", data=" + data + '}';
	}
}
