package com.longcheer;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class test extends UiAutomatorTestCase {

	UiDevice device = UiDevice.getInstance();
	UiObject obj = null;
	public void testDemo() throws UiObjectNotFoundException{		
		device.pressHome();
		try{Thread.sleep(3000);}catch(Exception e){}
		UiObject obj = new UiObject(new UiSelector().text("浏览器"));
		obj.click();
	}
}
