@echo off

rem ==============================================
rem ���뽫���Թ��ߵ��뵽sd��
call ant build
echo adb push .\bin\UiAutomator.jar /sdcard/
adb push .\bin\UiAutomator.jar /sdcard/

rem ==============================================
rem ����Activity
echo am start com.netease.newsreader.activity/com.netease.nr.biz.ad.AdActivity
adb shell am start com.netease.newsreader.activity/com.netease.nr.biz.ad.AdActivity

rem ==============================================
rem ��ʼ����
echo adb shell uiautomator runtest /sdcard/UiAutomator.jar -c com.news.test.testcases.Testcases1
adb shell uiautomator runtest /sdcard/UiAutomator.jar -c com.news.test.testcases.Testcases1