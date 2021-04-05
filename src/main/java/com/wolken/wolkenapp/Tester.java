package com.wolken.wolkenapp;

import org.apache.log4j.Logger;

public class Tester {
	static Logger logger=Logger.getLogger("Tester");
	
	public static void main(String[] args) {
		
		
		
		logger.debug("======");
		logger.error("--------");
		logger.fatal("*********");
		logger.info("%%%%%%%%%");
		logger.trace("########");
		logger.warn("@@@@@@@");

	}

}
