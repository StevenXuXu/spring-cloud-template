package com.shan.cloud.exp;

import com.shan.cloud.resp.ResultData;
import com.shan.cloud.resp.ReturnCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: Steven
 * @Date: 2024/8/28
 * @Time: 下午4:38
 * @Description:
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResultData exception(Exception e) {
        System.out.println("----come in GlobalExceptionHandler");
        log.error("全局异常信息exception:{}", e.getMessage(), e);
        return ResultData.fail(ReturnCodeEnum.RC500.getCode(),e.getMessage());
    }
}
