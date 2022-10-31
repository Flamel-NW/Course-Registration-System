package top.garret.utils;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler
    public R doDataIntegrityViolationException(DataIntegrityViolationException e) {
        e.printStackTrace();
        return new R(101, "数据库错误", null);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler
    public R doException(Exception e) {
        e.printStackTrace();
        return new R(100, "服务器错误", null);
    }
}
