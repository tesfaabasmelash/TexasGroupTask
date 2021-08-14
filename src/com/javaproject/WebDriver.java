package com.javaproject;

public interface WebDriver{
    void open();
    void close();
    String getTitle();

}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
interface TakeScreenShot extends RemoteWebDriver{
    void getScreenShot();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Chrome Driver opens a browser.");
    }

    @Override
    public void close() {
        System.out.println("Chrome Driver closes a browser.");
    }

    @Override
    public String getTitle() {
        String title="Web page title";
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("Chrome Driver can browser internet.");
    }
}
class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("FireFox Driver opens a browser.");
    }

    @Override
    public void close() {
        System.out.println("FireFox Driver closes a browser.");
    }

    @Override
    public String getTitle() {
        String title="Web page title";
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("FireFox Driver can browser internet.");
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Safari Driver opens a browser.");
    }

    @Override
    public void close() {
        System.out.println("Safari Driver closes a browser.");
    }

    @Override
    public String getTitle() {
        String title="Web page title";
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("Safari Driver can browser internet.");
    }

}
