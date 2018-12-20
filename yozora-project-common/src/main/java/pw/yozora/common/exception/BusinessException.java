package pw.yozora.common.exception;

/**
 * 描述： 业务层异常封装类
 *
 * @author ChenJianChuan
 * @date 2018/12/12　17:34
 */
public class BusinessException extends RuntimeException{

    public BusinessException(String message) {
        super(message);
    }
}
