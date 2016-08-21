package com.news.test.page;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;


/*
 * 测试父类，共有方法入口
 * */
public class BaiscTeatCase extends UiAutomatorTestCase {
	protected PageManager pm=null;
	
	/*通过aapt dump badging apkname获得app启动类和包名
	 * */
	String packageName="com.netease.nr";
	String activityName="com.netease.nr.biz.ad.AdActivity";
	
	protected void setup(boolean isNeedLogin) throws Exception{
		super.setUp();
		
		/*通过am start命令启动被测试应用，这样可以确保在不同的手机或者os上用统一的代码启动测试应用；
		 * */
		Runtime.getRuntime().exec("am start -n"+packageName+"/"+activityName);
	pm=new PageManager();
	Thread.sleep(1000);
	if(isNeedLogin){
		pm.getPageNavigetion().goToMySettingsTab();
		pm.getPageMy().clickLoginImageView();
		pm.getPageLogin().login("robotum2016@163", "uiautomator");
	}
	
	}
	

	
}
