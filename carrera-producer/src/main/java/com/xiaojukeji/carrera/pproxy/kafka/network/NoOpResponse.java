package com.xiaojukeji.carrera.pproxy.kafka.network;

import org.apache.kafka.common.network.Send;

/**
 * Created by lybuestc on 2019/4/13
 */
public class NoOpResponse extends Response{
    public NoOpResponse(Request request) {
        super(request);
    }

    @Override
    public void onComplete(Send send) {

    }
}
