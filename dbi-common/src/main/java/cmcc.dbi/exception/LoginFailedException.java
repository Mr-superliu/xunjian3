package cmcc.dbi.exception;

/**
 * 账号登录异常
 */
public class LoginFailedException extends BaseException{

    public LoginFailedException(String msg)
    {
        super(msg);
    }
}
