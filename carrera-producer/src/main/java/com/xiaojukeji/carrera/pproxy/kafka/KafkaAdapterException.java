package com.xiaojukeji.carrera.pproxy.kafka;

/**
 * Created by lybuestc on 2019/4/9
 */
public class KafkaAdapterException extends RuntimeException{

    public KafkaAdapterException() {
    }

    public KafkaAdapterException(String message) {
        super(message);
    }

    public KafkaAdapterException(String message, Throwable cause) {
        super(message, cause);
    }
}
