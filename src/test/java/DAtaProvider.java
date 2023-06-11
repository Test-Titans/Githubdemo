import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DAtaProvider {
    int i=1;
    @Test( dataProvider ="getTestData" )
    public void Login(String email,String Pass)
    {
        System.out.println("login"+i+" "+email+" "+Pass);
        i+=1;
    }
    @DataProvider(name="getTestData")
    public Object[][] DataSupplier()
    {
        Object [][] data={{"Sunnyk@gmail.com","123"},{"goluk123@gmail.com","3465"}};
        return data;
    }
}
