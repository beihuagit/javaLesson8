package com.basics.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @ClassName Constant.java
 * @author 陈小乐 xiaole_chen@aliyun.com
 * @date 2020-05-12
 * @version
 * @description 金融超市常量
 */
public class Constant {

    /**
     * 银行机构编码,在系统里配置
     */
    public static final String YH_JGBM = "09JIM09JIM";

    /**
     * 渠道号
     */
    public static final String CHANNEL_ID = "SZZSYH";

    /**
     * 银行前缀
     */
    public static final String YH_PREFIX = "jinrongban";

    /**
     * WebService测试地址，由税局提供
     */
    public static final String WS_URL_UAT = "http://10.7.2.117:8005/sxdService?wsdl";

    /**
     * 测试环境私钥，由税局提供
     */
    public static final String PUBLIC_KEY_UAT = "04D16F40A5ECF2E421EF91CCF7F8D7B48BE3EE92955C29CBA60C9BE8F5D9E04FC88463236EA7DADCE281F8626C7D890C96987D76798F5A6A5BCAF07EB87BA6B1B5";

    /**
     * 测试环境私钥，由税局提供
     */
    public static final String PRIVATE_KEY_UAT = "70A79108BD9AAD9050CC52A4217C93F732B063715223098328C582B08D05754D";

    /**
     * WebService生产地址，由税局提供  待确认
     */
    public static final String WS_URL_PRO = "";

    /**
     * 生产环境私钥，由税局提供  待确认
     */
    public static final String PUBLIC_KEY_PRO = "";

    /**
     * 生产环境私钥，由税局提供  待确认
     */
    public static final String PRIVATE_KEY_PRO = "";

    public static final String DATE_TODAY = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    /**
     * 基础信息(纳税人信息)
     */
    public static final String JCXX = "01";
    /**
     * 变更信息
     */
    public static final String BGXX = "02";
    /**
     * 投资方信息
     */
    public static final String TZFXX = "03";
    /**
     * 申报信息
     */
    public static final String SBXX = "04";
    /**
     * 小规模申报表
     */
    public static final String XGMSBB = "05";
    /**
     * 一般纳税人增值税申报信息
     */
    public static final String YBNSRZZSSBB = "06";
    /**
     * 征收信息
     */
    public static final String ZSXX = "07";
    /**
     * 利润表
     */
    public static final String LRB = "08";
    /**
     * 资产负债表
     */
    public static final String ZCFZB = "09";
    /**
     * 违法违章信息
     */
    public static final String WFWZXX = "10";
    /**
     * 稽查案件信息
     */
    public static final String JC_AJXX = "11";
    /**
     * 纳税人资格认定信息
     */
    public static final String NSRZGRDXX = "12";
    /**
     * 信用等级
     */
    public static final String XYDJ = "13";
    /**
     * 上游
     */
    public static final String SY = "14";
    /**
     * 下游
     */
    public static final String XY = "15";

}
