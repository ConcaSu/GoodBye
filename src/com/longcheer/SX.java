package com.longcheer;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;

public class SX {
	
	public static UiDevice device = UiDevice.getInstance();
	
	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void click(String name){
		try {
			new UiObject(new UiSelector().text(name)).click();
		} catch (UiObjectNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void click(int x, int y){
		device.click(x, y);
	}
	
	public static void swipe(int startX,int startY,int endX,int endY){
		device.swipe(startX, startY, endX, endY, 10);
	}
	
	public static void clickInPackage(String pack,String name){
		try {
			new UiObject(new UiSelector().text(pack)).click();
			wait(1);
			new UiObject(new UiSelector().text(name)).click();
		} catch (UiObjectNotFoundException e) {
			e.printStackTrace();
		}
		
		
	} 
	
	public static void deleteWithHand(String name){
		
	}
	
}
