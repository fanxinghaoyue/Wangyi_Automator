package com.news.test.page;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

//抽取收藏类
public class PageMyFavorites
{
    /*
     * 获取指定行的新闻标题控件
     * */
    public UiObject getTitleTV(int index)
    {
        return UiObjectHelper.getUiObjectByIdAndInstanceIndex(
                "com.netease.newsreader.activity:id/cg", index);
    }

    /*
     * 获取控件文本
     * */
    public String getTitleTVText(int index)
    {
        String title = null;

        try
        {
            title = getTitleTV(index).getText().toString();
        }
        catch (UiObjectNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return title;
    }
}
