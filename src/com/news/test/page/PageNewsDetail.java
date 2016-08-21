package com.news.test.page;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

//抽取新闻详情类

public class PageNewsDetail
{

    /*
     * 获取右上角更多控件
     * */
    public UiObject getMoreTextView()
    {
        return UiObjectHelper.getUiObjectByResourceId(
                "com.netease.newsreader.activity:id/biz_newspage_menu_more");
    }

    /*
     * 获取收藏控件
     * */
    public UiObject getFavoritesTexView()
    {
        return UiObjectHelper.getUiObjectByText("收藏");
    }

    /*
     * 点击右上角更多按钮
     * */
    public void clickMoerTextView()
    {
        try
        {
            getMoreTextView().clickAndWaitForNewWindow();
        }
        catch (UiObjectNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /*
     * 点击收藏按钮方法
     * */
    public void clickFavoritesTexView()
    {
        try
        {
            getFavoritesTexView().clickAndWaitForNewWindow();
        }
        catch (UiObjectNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
