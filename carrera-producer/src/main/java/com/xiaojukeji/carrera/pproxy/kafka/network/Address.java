package com.xiaojukeji.carrera.pproxy.kafka.network;

/**
 * Created by lybuestc on 2019/4/16
 */
public class Address implements Comparable{
    String host;
    int port;

    public Address() {
    }

    public Address(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public int compareTo(Object o) {
        return host.compareTo(((Address)o).getHost());
    }
}
