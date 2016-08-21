# Wangyi_Automator
使用uiautomator做自动话测试的例子

# 编译，运行
1.修改local.properties中sdk的路径
2.ant build
3.adb push .\bin\UiAutomator.jar /sdcard/
4.adb shell uiautomator runtest /sdcard/UiAutomator.jar -c com.news.test.testcases.Testcases1

![image](https://github.com/fanxinghaoyue/Wangyi_Automator/tree/master/screenshot/logcat-result.png)

#参考
https://github.com/romanbilis/wangyiuiautomator.git
将GBK编码的代码修改为UTF-8
添加build.xml