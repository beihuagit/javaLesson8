package com.basics.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 国密加解密
 * @author xiaole.chen
 * @date 2020/12/16 12:00
 * */
public class TestSms11111 {

    public static void main(String[] args) throws Exception {
        String prik = "06C141F1F4CB40BDAC218744953A29E9027CD76ED0B39FD9F0D7F4CFBAA52B9A";
        String pubk = "042FAFF149F58E4083BA38D786ECD37E730702D7DEDF4C4CEF1A719156F18D9A0C368A7C403FD33764CA7523D5270C91C926F574B9712E079D162F48001EAAD5EB";
        String data = "04AAA4235E56750725B4099345325B01DAC49D39F7A3050BAA0469D7F99D0828D81713F05526E43E4877423E0A9A020DE827B2784A0F8D4A2A06FD7EF9F2C3323B111E456BD4C1851F484F7A18087D5ACF66E743699E697777E0BAB647E467C108A8B1F59CAC4DB6F4A37A36D7D548EC9873A2B2CBAD548BF8E8773CF7EC2178699545ADAF6414A0843BA85F3ED5EEBD3C2672FA6F49CE7D1583262280B70A3277A6F2B0DD181E8E5243024F4D0F45923E0BE9458ECB2880CF60065C4AC23619DB8A5D1F0787EBD36C5D9B70ED345F89DCBB2C4AE0778EA21865EB0FFC9471D32CABD7F7800E931A84E46D5622E29D78BFE267D1797EBABB7472856BFC9A8935FA482BD53CA3E2C974827DAC16425C583182CA68F479F1594EE41E8B01691567EC68A975842103629BEC678AA9E01B25F1EAD25AB0FE149D05A89B033EA7B31B474B520C5533FCB09BDEC7331D4897E5EB84D3C484B09407A8ADE3E253049136EAEA143AB999C5CBF416E1380B14A12724F26AE59521C5FAF9D28580781DA44B9321FB96635CCE48C19F5942FD4DA21E3EA5B2B83B07A0A322A839D65CA148A7F5C837E27B3EEFCCF0E5D8E85C8428816A179DC6E053F134437A8D497F09A4F907536611196B03195DF1864D6153ED956E5DB97A237343CB46F7DA08CC06FCF36DAA758FD889D23989B77EEC1075EF904C65C7F8F95807496807D0BE6FBC09F9C1B4F3C3BB11C243D427D90335B75D26B46B550D5AD0EF03";
        String data2 = "<YWLSH>20201216022713cx0000000000124036</YWLSH><BIZTYPE>14</BIZTYPE><SHXYDM>914403003264490191</SHXYDM><CPBM>szjfsxd001</CPBM>";
        // 解密
        String text = new String(SM2Utils.decrypt(Util.hexToByte(prik), Util.hexToByte(data)));
        // 加密
        //String str = "ywlsh=SZZSYH202012161134100006&shxydm=914403003264490191&SQR=金融办&cpmc=税信贷-税信综合贷&cpbm=szjfsxd001&cghddz=https://api.o-banks.cn/?redirectUrl=https%3A%2F%2Fwww.o-banks.cn%2Fhomepage;914403003264490191";
        String text2 = SM2Utils.encrypt(Util.hexToByte(pubk), data2.getBytes());
        System.out.println(text2);
        //System.out.println(text2);

        // 涉税查询报文
        String taxinfoP = "<YWLSH>20201216022713cx0000000000124036</YWLSH><BIZTYPE>14</BIZTYPE><SHXYDM>914403003264490191</SHXYDM><CPBM>szjfsxd001</CPBM>";

        System.out.println(buildReqXml("yshd.service.cxssxx", text2));

    }

    /**
     * 报文构造
     * @param tranId
     * @param sm2
     * @return
     * @throws Exception
     */
    public static String buildReqXml(String tranId, String sm2) throws Exception {
        StringBuffer reqXml = new StringBuffer();
        reqXml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        reqXml.append("<service xmlns=\"http://www.chinatax.gov.cn/spec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/spec/\">");
        reqXml.append("<head>");
        reqXml.append("<tran_id>").append(tranId).append("</tran_id>");
        reqXml.append("<channel_id>L00SXD</channel_id>");
        reqXml.append("<tran_seq>").append(getSeq()).append("</tran_seq>");
        reqXml.append("<tran_date>").append(isoDateString("date", "time").get("date")).append("</tran_date>");
        reqXml.append("<tran_time>").append(isoDateString("date", "time").get("time")).append("</tran_time>");
        reqXml.append("<expand><name>identityType</name><value>SZZSYH</value></expand>");
        reqXml.append("</head>");
        reqXml.append("<body>");
        reqXml.append("<![CDATA[<?xml version=\"1.0\" encoding=\"GBK\"?>");
        reqXml.append("<taxML>");
        reqXml.append("<JGBM>").append("jinrongban").append("</JGBM>");
        reqXml.append("<JMCS>").append(sm2).append("</JMCS>");
        reqXml.append("</taxML>]]></body></service>");
        return reqXml.toString();
    }

    private static String getSeq() {
        String s = UUID.randomUUID().toString();
        return Constant.YH_PREFIX + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
    }

    public static Map<String, String> isoDateString(String dateKey, String timeKey) {
        Map<String, String> map = new HashMap<>();
        String now = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        map.put(dateKey, now.split("T")[0].replaceAll("-", ""));
        map.put(timeKey, now.split("T")[1].replaceAll(":", "").replace(".", ""));
        return map;
    }

}
