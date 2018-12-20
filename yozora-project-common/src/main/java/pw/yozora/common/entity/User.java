package pw.yozora.common.entity;

import lombok.Data;
import lombok.ToString;

/**
 * 描述： 用户实体类
 *
 * @author ChenJianChuan
 * @date 2018/12/20　10:42
 */
@Data
@ToString
public class User {

    private Long id;
    private String username;
    private String password;
    private String nickname;
    private String email;
}
