import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pw.yozora.common.util.Constant;
import pw.yozora.provider.home.YozoraprojectproviderhomeApplication;
import pw.yozora.provider.home.dao.ContentDAO;
import pw.yozora.provider.home.entity.Content;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述： 测试
 *
 * @author ChenJianChuan
 * @date 2018/12/13　14:02
 */
//@SpringBootTest(classes = YozoraprojectproviderhomeApplication.class)
//@RunWith(SpringRunner.class)
public class TestCase {

    @Autowired
    private ContentDAO contentDAO;

    @Test
    public void doTest() {
        List<String> a = new ArrayList<>();
        a.add("haha");
        a.add("xixi");
        System.out.println(a.contains("haha"));
    }
}
