package com.news.test.page;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

import junit.framework.Assert;

//抽取登录类

public class PageLogin
{
    /*抽取用户名输入框
     * */
    public UiObject getUserEditText()
    {
        return UiObjectHelper.getUiObjectByResourceId("");
    }

    /*抽取密码输入框
     * */
    public UiObject getPwdEditText()
    {
        return UiObjectHelper.getUiObjectByResourceId("");
    }

    /*抽取登录按钮
     * */
    public UiObject getLoginButton()
    {
        return UiObjectHelper.getUiObjectByResourceId("");
    }

    /*
     * 输入用户名方法
     * 
     * */

    public void enterUsername(String username)
    {
        try
        {
            getUserEditText().clearTextField();
            getUserEditText().setText(username);
        }
        catch (UiObjectNotFoundException e)
        {
            // TODO Auto-generated catch block
            Assert.fail("用户名输入框对象为null");
        }

    }

    /*
     * 输入密码方法
     * 
     * */
    public void enterPwd(String password)
    {
        try
        {
            getPwdEditText().clearTextField();
            getPwdEditText().setText(password);
        }
        catch (UiObjectNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.fail("密码输入框对象为null");
        }

    }

    /*
     * 点击登录方法
     * */
    public void clickLoginButton()
    {
        try
        {
            getLoginButton().clickAndWaitForNewWindow();
        }
        catch (UiObjectNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.fail("登录按钮对象为null");
        }
    }

    /*
     * 登录方法
     * */
    public void login(String username, String password)
    {
        enterUsername(username);

        try
        {
            getPwdEditText().setText(password);
        }
        catch (UiObjectNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        enterPwd(password);
        clickLoginButton();
    }
}
