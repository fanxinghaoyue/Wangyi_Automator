package com.news.test.page;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

//抽取我的类
public class PageMy
{
    /*
     * 获取登录的view
     * @return
     * */
    public UiObject getLoginImageView()
    {
        return UiObjectHelper.getUiObjectByResourceId(
                "com.netease.newsreader.activity:id/biz_pc_main_info_profile_avatar");
    }

    public UiObject getPageMy()
    {
        return UiObjectHelper.getUiObjectByResourceId(
                "com.netease.newsreader.activity:id/biz_pc_profile_collect");
    }

    /*
     * 点击登录按钮
     * @return
     * */
    public void clickLoginImageView()
    {
        try
        {
            getLoginImageView().clickAndWaitForNewWindow();
        }
        catch (UiObjectNotFoundException e)
        {
            // TODO Auto-generated 	catch block
            e.printStackTrace();
        }
    }

    public void clickFavoirtesRL()
    {

        try
        {
            getPageMy().clickAndWaitForNewWindow();
        }
        catch (UiObjectNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
