package pw.yozora.provider.home.web.fronted;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pw.yozora.common.entity.User;
import pw.yozora.common.util.JsonResult;

/**
 * 描述： 登录
 *
 * @author ChenJianChuan
 * @date 2018/12/20　10:39
 */
@RestController
@RequestMapping("/api/home")
public class LoginFeignProvider {

    @PostMapping("/login")
    public JsonResult loginValid(@RequestBody User loginUser) {
        boolean loginFlag = ("yozora".equals(loginUser.getUsername()) || "yozora".equals(loginUser.getEmail()) )
                && "123456".equals(loginUser.getPassword());
        if(loginFlag) {
            return JsonResult.responseSuccess("登录成功");
        }
        return JsonResult.responseFail("用户名或密码错误");
    }
}
