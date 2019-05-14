package com.qshore.pig;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

public class DateConversion extends EvalFunc<String>{

	@Override
	public String exec(Tuple tuple) throws IOException {
		// TODO Auto-generated method stub
		SimpleDateFormat originalDate = new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat targetDate = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String finalDate = null;
		try {
			String str = (String) tuple.get(0);
			date = originalDate.parse(str);
			finalDate=targetDate.format(date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return finalDate;
	}
	

}
