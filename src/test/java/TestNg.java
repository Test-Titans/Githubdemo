//import Listenerpackage.testListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(testListener.class)
public class TestNg {
    @Test(priority = 1,groups = {"smoke"})
    public static  void method1()
    {
        System.out.println("Inside Method1");
    }
    @Test(priority = 3,groups = {"sanity","smoke"})
    public static  void method2()
    {
        System.out.println("Inside Method2");
    }
    @Test(priority = 2,groups = {"Regression","sanity"})
    public static  void method3()
    {
        System.out.println("Inside Method3");
    }
    @Test(priority = 4,groups = {"sanity"})
    public static  void method4()
    {
        System.out.println("Inside Method4");
    }
}
