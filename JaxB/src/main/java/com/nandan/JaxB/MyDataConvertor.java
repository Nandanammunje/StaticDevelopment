package com.nandan.JaxB;

import java.math.BigDecimal;

import javax.xml.bind.DatatypeConverter;

public class MyDataConvertor {

	
	
	public static double decimaltoDouble(String value)
	{
		BigDecimal decimal=DatatypeConverter.parseDecimal(value);
		System.out.println(value);
		
		return decimal.doubleValue();
	}
	public static String printDecimaltoDouble(Double value )
	{
	  BigDecimal decimal=BigDecimal.valueOf(value);
	  return DatatypeConverter.printDecimal(decimal);
	}
	
}
