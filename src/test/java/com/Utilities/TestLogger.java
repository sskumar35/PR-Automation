package com.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogger {
	
	final static Logger logger = Logger.getLogger(TestLogger.class);
	
	public static void testLoggerDebug(String message) {
		PropertyConfigurator.configure("log4j.properties");
		logger.debug(message);
	}

	public static void testLoggerInfo(String message) {
		PropertyConfigurator.configure("log4j.properties");
		logger.info(message);
	}

	public static void testLoggerWarn(String message) {
		PropertyConfigurator.configure("log4j.properties");
		logger.warn(message);
	}

	public static void testLoggerError(String message) {
		PropertyConfigurator.configure("log4j.properties");
		logger.error(message);
	}

	public static void testLoggerFatal(String message) {
		PropertyConfigurator.configure("log4j.properties");
		logger.fatal(message);
	}
	
	public static void testLoggerTCStart(String message) {
		PropertyConfigurator.configure("log4j.properties");
		logger.info(message + " " + "-" + " " + "TC START");
	}
	
	public static void testLoggerTCEnd(String message) {
		PropertyConfigurator.configure("log4j.properties");
		logger.info(message + " " + "-" + " " + "TC END");
	}

}
