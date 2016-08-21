package com.news.test.page;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

//抽取首页新闻类
public class PageNews
{
    public UiObject getNewsTitle(int index)
    {
        return UiObjectHelper.getUiObjectByIdAndInstanceIndex(
                "com.netease.newsreader.activity:id/title", index);

    }

    /*
     * 获取指定行标题文本方法
     * @param index
     * @return
     * */
    public String getNewsTitleText(int index)
    {
        String newsTitle = null;
        try
        {
            newsTitle = getNewsTitle(index).getText().toString();
        }
        catch (UiObjectNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return newsTitle;

    }

    /*
     * 点击新闻标题方法
     * @param index
     * */
    public void clickNewTitle(int index)
    {
        try
        {
            getNewsTitle(index).clickAndWaitForNewWindow();
        }
        catch (UiObjectNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
