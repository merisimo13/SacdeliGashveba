import com.github.javafaker.Faker;
import org.junit.Test;

public class JavaFaker {
    Faker faker = new Faker();
    @Test

    public void test(){
        System.out.println(faker.number().digits(7));
    }
}
