import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonTest {

    @DataProvider(name = "ageDataProvider")
    Object[][] ageDataProvider() {
        return new Object[][] {
                {-1, false},
                {0, false},
                {12, false},
                {13, true},
                {19, true},
                {20, false},
        };
    }


    @Test(dataProvider = "ageDataProvider")
    public void testAge(int age, boolean expectedGrade) {
        boolean check = Person.isTeenager(age);
        System.out.println("Результат проверки: " + check + ", а ожидалось " + expectedGrade);
        Assert.assertEquals(check, expectedGrade);

    }
}