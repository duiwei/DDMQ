package com.xiaojukeji.carrera.pproxy.kafka;

/**
 * Created by lybuestc on 2019/9/22
 */
public class LifeCycleException extends RuntimeException {
    public LifeCycleException(String msg) {
        super(msg);
    }

    public LifeCycleException(String message, Throwable cause) {
        super(message, cause);
    }
}
