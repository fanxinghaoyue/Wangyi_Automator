package com.news.test.page;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

//抽取导航类


public class PageNavigetion {
		/*
		 * 获取阅读tab页
		 * */
	public UiObject getReadTab(){
		return UiObjectHelper.getUiObjectByIdAndInstanceIndex("com.netease.newsreader.activity:id/biz_navi_tab", 1);
	}
	
	/*
	 * 获取我的tab页
	 * */
	public UiObject getMyTab() throws UiObjectNotFoundException{
		return UiObjectHelper.getUiObjectByIdAndInstanceIndex("com.netease.newsreader.activity:id/biz_navi_tab", 4);	
	}
	
	/*
	 * 获取新闻tab页
	 * */
	public UiObject getNewsTab() throws UiObjectNotFoundException{
		return UiObjectHelper.getUiObjectByIdAndInstanceIndex("com.netease.newsreader.activity:id/biz_navi_tab", 0);
	}
	
	/*
	 * 切换到我tab页方法
	 * */	
	public void goToMySettingsTab(){
		try {
			getMyTab().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * 切换到新闻tab方法
	 * */
	public void goToNewsTab(){
		try {
			getNewsTab().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
