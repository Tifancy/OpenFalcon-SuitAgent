/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */
package com.yiji.falcon.agent.jmx.vo;

import java.util.List;
import java.util.Map;

/*
 * 修订记录:
 * guqiu@yiji.com 2016-06-22 17:48 创建
 */

/**
 * JMX mBean值的info类
 * @author guqiu@yiji.com
 */
public class JMXMetricsValueInfo {

    /**
     * 此jmx 连接的对象信息
     */
    private List<JMXObjectNameInfo> jmxObjectNameInfoList;

    /**
     * jmx 连接信息
     */
    private JMXConnectionInfo jmxConnectionInfo;

    @Override
    public String toString() {
        return "JMXMetricsValueInfo{" +
                "jmxObjectNameInfoList=" + jmxObjectNameInfoList +
                ", jmxConnectionInfo=" + jmxConnectionInfo +
                '}';
    }

    public JMXConnectionInfo getJmxConnectionInfo() {
        return jmxConnectionInfo;
    }

    public void setJmxConnectionInfo(JMXConnectionInfo jmxConnectionInfo) {
        this.jmxConnectionInfo = jmxConnectionInfo;
    }

    public List<JMXObjectNameInfo> getJmxObjectNameInfoList() {
        return jmxObjectNameInfoList;
    }

    public void setJmxObjectNameInfoList(List<JMXObjectNameInfo> jmxObjectNameInfoList) {
        this.jmxObjectNameInfoList = jmxObjectNameInfoList;
    }
}
