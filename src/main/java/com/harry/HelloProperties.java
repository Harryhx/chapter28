package com.harry;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置文件实体映射
 * Created by admin on 2018/11/27.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {
    //消息内容
    private String msg = "harry";
    //是否显示消息内容

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    private boolean show = true;

    private String getMsg() {
        return msg;
    }

    private void setMsg(String msg) {
        this.msg = msg;
    }
}
