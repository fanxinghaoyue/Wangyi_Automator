package com.news.test.testcases;

import com.news.test.page.BaiscTeatCase;

/*
 * 	测试用例详情：
 *		点击“我”tab页
 *		点击登录头像
 *		输入用户名:robotium2016@163.com
 *		输入密码：uiautomator
 *			点击登录按钮
 *			点击回到“新闻”tab页
 *			点击进入第二条新闻
 *			继续点击进入第一条新闻详情
 *			点击收藏按钮
 *			点击返回按钮
 *			继续点击返回按钮
 *			点击“我”tab页
 *			点击收藏按钮
 *			在我的收藏页校验第一条的标题内容和新闻详情页面的标题一致
 * */

public class Testcases1 extends BaiscTeatCase
{
    protected void setup() throws Exception
    {
        //需要在登录下进行，所有设置为true
        super.setup(true);
    }

    public void testCases1()
    {
        //登录后需跳转到新闻页面
        pm.getPageNavigetion().goToNewsTab();

        //获取需要点击那一行到新闻标题
        String expect = pm.getPageNews().getNewsTitleText(2);

        //点击指定那一行
        pm.getPageNews().clickNewTitle(2);

        //在新闻详情页点击右上角更多按钮
        pm.getPageNewsDetail().clickMoerTextView();

        //点击收藏
        pm.getPageNewsDetail().clickFavoritesTexView();

        //通过getuiDevice执行一些模拟硬件操作，如返回
        getUiDevice().pressBack();

        //需要跳转回我的tab页
        pm.getPageNavigetion().goToMySettingsTab();

        //在我tab页点击收藏
        pm.getPageMy().clickFavoirtesRL();

        //在收藏页面获取第一行的新闻标题
        String actual = pm.getPageMyFavorites().getTitleTVText(0);
        //跟预期的做比较，断言两者相等
        assertEquals("收藏的新闻标题不一致", expect, actual);

        //模拟硬件返回
        getUiDevice().pressBack();

        //返回首页
        pm.getPageNavigetion().goToNewsTab();

    }

}
