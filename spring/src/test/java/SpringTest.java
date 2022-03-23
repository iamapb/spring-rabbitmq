import com.spring.transactional.SpringTransactionalApplication;
import com.spring.transactional.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringTransactionalApplication.class)
public class SpringTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        userService.add("hh");
    }
}
