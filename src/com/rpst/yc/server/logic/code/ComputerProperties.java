package com.rpst.yc.server.logic.code;

import java.io.FileOutputStream;
import java.util.Properties;

import com.rpst.yc.commons.code.YCValues;

public class ComputerProperties {
	Properties prop;
	public ComputerProperties() {
		prop=new Properties();
	}
	public boolean Save(){
		try {
			prop.store(new FileOutputStream(YCValues.C_Property_File), null);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean setProperty(String key,String value){
		prop.setProperty(key, value);
		return true;
	}
	public String getProperty(String key){
		return null;
	}
	public boolean load(){
		return true;
	}
	

}
