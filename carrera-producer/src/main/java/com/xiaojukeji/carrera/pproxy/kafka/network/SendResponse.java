package com.xiaojukeji.carrera.pproxy.kafka.network;

import org.apache.kafka.common.network.Send;

/**
 * Created by lybuestc on 2019/4/11
 */
public class SendResponse extends Response{

    private Send send;
    private String responseAsString;

    public SendResponse(Request request, Send responseSend, String responseAsString) {
        super(request);
        this.send = responseSend;
        this.responseAsString = responseAsString;
    }

    @Override
    public void onComplete(Send send) {
        //todo
    }

    public Send getSend() {
        return send;
    }


}
