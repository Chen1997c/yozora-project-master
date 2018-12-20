package pw.yozora.common.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述： 公共常量定义类
 *
 * @author ChenJianChuan
 * @date 2018/12/13　13:58
 */
@AllArgsConstructor
public enum Constant {

    ADD_SUCCESS_MESSGE("添加成功"),
    EDIT_SUCCESS_MESSGE("修改成功"),
    DELETE_SUCCESS_MESSGE("删除成功");

    private String content;

    public String getContent() {
        return this.content;
    }

}
