package com.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {
	
	    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	    public static String formatDate(Date date) {
	        if (date != null) {
	            return dateFormat.format(date);
	        } else {
	            return null;
	        }
	    }

	    public static  java.util.Date parseDate(String dateStr) throws ParseException {
	        if (dateStr != null && !dateStr.isEmpty()) {
	            return dateFormat.parse(dateStr);
	        } else {
	            return null;
	        }
	    }
	}


