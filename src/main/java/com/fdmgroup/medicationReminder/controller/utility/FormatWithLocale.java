package com.fdmgroup.medicationReminder.controller.utility;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class FormatWithLocale {

	public static final DateTimeFormatter DATE_AND_TIME_FORMATTER = new DateTimeFormatterBuilder()
			.appendPattern("dd/MM/yyyy HH:mm:ss")
			.toFormatter(Locale.getDefault());

	public static final DateTimeFormatter DATE_FORMATTER = new DateTimeFormatterBuilder()
			.appendPattern("dd/MM/yyyy")
			.toFormatter(Locale.UK);
	
	public static final NumberFormat CURRENCY_FORMATTER = NumberFormat.getCurrencyInstance(Locale.getDefault());
	
}
