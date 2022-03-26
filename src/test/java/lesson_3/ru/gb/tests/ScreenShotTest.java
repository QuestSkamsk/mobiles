package lesson_3.ru.gb.tests;

import lesson_3.ru.gb.base.BaseTest;
import lesson_3.ru.gb.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class ScreenShotTest extends BaseTest {
    @Test
    public void checkMainPageScreen () {
        openApp()
                .checkScreenshot();
    }
}
