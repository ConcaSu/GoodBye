package com.longcheer;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Browser extends UiAutomatorTestCase {

	UiDevice device = UiDevice.getInstance();
	UiObject obj = null;
	
	public void testDemo() throws UiObjectNotFoundException{
		
		device.pressHome();
		try{Thread.sleep(3000);}catch(Exception e){}
		device.click(700, 1750);
		try{Thread.sleep(3000);}catch(Exception e){}
		device.pressHome();
		try{Thread.sleep(3000);}catch(Exception e){}
		obj= new UiObject(new UiSelector().text("浏览器"));
		try{Thread.sleep(3000);}catch(Exception e){}
		device.click(500, 500);
		try{Thread.sleep(3000);}catch(Exception e){}
		device.pressHome();		
	}
	
	public void testDemo1() throws UiObjectNotFoundException{
		
		device.pressHome();
		try{Thread.sleep(3000);}catch(Exception e){}
		device.click(700, 1750);

	}
	

}
