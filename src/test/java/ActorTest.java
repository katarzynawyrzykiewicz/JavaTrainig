import org.example.Actor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ActorTest {
    //testy unitowe to metody w klasie
    @Test
    public void shouldCalculateSalaryCorrectly() {
        int expectedSalary=3000;
        int actualSalary;
        Actor actor1 = new Actor("Bogusław","Linda", 10,false);
       actualSalary = actor1.calulateSalary(3,1000);

       assertThat(expectedSalary).isEqualTo(actualSalary);// jedna asercja na jeden test
        System.out.println("Koniec testu");


    }
    @Test
    @DisplayName("Sprawdzam czy ustawa kominowa jest ")
    public void shouldCalculateSalaryCorrectly1() {
        int expectedSalary=4000;
        int actualSalary;
        Actor actor1 = new Actor("Bogusław","Linda", 10,false);
        actualSalary = actor1.calulateSalary(6,1000);

        assertThat(expectedSalary).isBetween(1000,5000);// jedna asercja na jeden test
        System.out.println("Koniec testu2");
    }
    @Test
    @DisplayName("Sprawdzam czy liczę dobrze")
    public void shouldCalculateSalaryCorrectly2() {

        System.out.println("Test Pass");
    }
    @ParameterizedTest
    @CsvFileSource(resources= "/login.csv")
    @DisplayName("logowanie prawidłowego usera")
    public void shouldCLoginProperly(String login, String password) {
        System.out.println("Login:" + login);
        System.out.println("Password:" + password);
        System.out.println("Login properly");
    }
}