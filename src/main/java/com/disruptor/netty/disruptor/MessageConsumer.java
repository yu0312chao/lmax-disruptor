package com.disruptor.netty.disruptor;

import com.disruptor.netty.common.TranslatorDataWapper;
import com.lmax.disruptor.WorkHandler;


public abstract class MessageConsumer implements WorkHandler<TranslatorDataWapper> {

    protected String consumerId;

    public MessageConsumer(String consumerId) {
        this.consumerId = consumerId;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }


}
