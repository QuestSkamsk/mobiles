package lesson_3.ru.gb.tests;

import lesson_3.ru.gb.base.BaseTest;
import lesson_3.ru.gb.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(AllureListener.class)
// перед каждым классом теста она должна быть. Иначе просто листенер не понимает, что мы хотим его использовать.
@Listeners(AllureListener.class)
public class ScreenShotTestFail extends BaseTest {

    @Test
    public void checkMainPageScreen(){
        openApp()
                .checkFailScreenshot();
    }
}
