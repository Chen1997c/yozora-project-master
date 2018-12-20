package pw.yozora.common.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 描述： 返回数据封装类
 *
 * @author ChenJianChuan
 * @date 2018/12/12　17:36
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class JsonResult {

    private int code;
    private Object data;
    private String message;

    public static JsonResult responseSuccess(Object data) {
        return new JsonResult(200,data,null);
    }
    public static JsonResult responseSuccess(String message) {
        return new JsonResult(200,null,message);
    }
    public static JsonResult responseFail(String message) {
        return new JsonResult(-1,null,message);
    }
}
