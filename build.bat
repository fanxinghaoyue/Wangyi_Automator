@echo off

rem ==============================================
rem 编译将测试工具导入到sd卡
call ant build
echo adb push .\bin\UiAutomator.jar /sdcard/
adb push .\bin\UiAutomator.jar /sdcard/

rem ==============================================
rem 启动Activity
echo am start com.netease.newsreader.activity/com.netease.nr.biz.ad.AdActivity
adb shell am start com.netease.newsreader.activity/com.netease.nr.biz.ad.AdActivity

rem ==============================================
rem 开始测试
echo adb shell uiautomator runtest /sdcard/UiAutomator.jar -c com.news.test.testcases.Testcases1
adb shell uiautomator runtest /sdcard/UiAutomator.jar -c com.news.test.testcases.Testcases1