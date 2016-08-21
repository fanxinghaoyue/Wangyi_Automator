package com.news.test.page;

public class PageManager
{
    PageLogin pageLogin;
    PageMy pageMy;
    PageMyFavorites pageMyFavorites;
    PageNavigetion pageNavigetion;
    PageNews pageNews;
    PageNewsDetail pageNewsDetail;

    /*
     * 获得导航page类对象引用
     * */
    public PageNavigetion getPageNavigetion()
    {
        if (pageNavigetion == null)
        {
            pageNavigetion = new PageNavigetion();
        }
        return pageNavigetion;
    }

    /*
     * 获得登录page类对象的引用
     * */
    public PageLogin getPageLogin()
    {

        if (pageLogin == null)
        {
            pageLogin = new PageLogin();
        }
        return pageLogin;
    }

    /*
     * 获得新闻页对象的引用
     * */
    public PageNews getPageNews()
    {
        if (pageNews == null)
        {
            pageNews = new PageNews();
        }
        return pageNews;
    }

    /*
     * 获得新闻详情对象的引用
     * */
    public PageNewsDetail getPageNewsDetail()
    {
        if (pageNewsDetail == null)
        {
            pageNewsDetail = new PageNewsDetail();
        }
        return pageNewsDetail;
    }

    /*
     * 获得我的tab页对象的引用
     * */
    public PageMy getPageMy()
    {
        if (pageMy == null)
        {
            pageMy = new PageMy();

        }
        return pageMy;
    }

    /*
     * 获得收藏页对象的引用
     * */
    public PageMyFavorites getPageMyFavorites()
    {
        if (pageMyFavorites == null)
        {
            pageMyFavorites = new PageMyFavorites();
        }
        return pageMyFavorites;
    }

}
