package pw.yozora.provider.home.web;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pw.yozora.common.exception.BusinessException;
import pw.yozora.common.util.JsonResult;

/**
 * 描述： 全局异常处理
 *
 * @author ChenJianChuan
 * @date 2018/12/12　17:39
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BusinessException.class)
    public JsonResult handleBusinessException(BusinessException e) {
        return JsonResult.responseFail(e.getMessage());
    }
}
