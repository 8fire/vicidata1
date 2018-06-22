package com.csjscm.config.payconfig;

/**
 * ping++的一些基础配置
 *
 * @author csjscm
 * create 2018-03-22 下午 4:49
 **/
public final   class PingConfig {

    /**
     * Pingpp 管理平台对应的 API Key，api_key 获取方式：登录 [Dashboard](https://dashboard.pingxx.com)->点击管理平台右上角公司名称->开发信息-> Secret Key
     */
    // 测试环境
    //public final static String APIKEY = "sk_test_GirnP40ufLGOibXTS8GeDaLC";
    //正式环境
    public final static String APIKEY = "sk_live_8K0SiDyH4GKGe1mLG8nnbb58";
    /**
     * Pingpp 管理平台对应的应用 ID，app_id 获取方式：登录 [Dashboard](https://dashboard.pingxx.com)->点击你创建的应用->应用首页->应用 ID(App ID)
     */
    public final static String APPID= "app_mbnTO0n5qXjPbffX";
    /**
     * 设置请求签名密钥，密钥对需要你自己用 openssl 工具生成，如何生成可以参考帮助中心：https://help.pingxx.com/article/123161；
     * 生成密钥后，需要在代码中设置请求签名的私钥(rsa_private_key.pem)；
     * 然后登录 [Dashboard](https://dashboard.pingxx.com)->点击右上角公司名称->开发信息->商户公钥（用于商户身份验证）
     * 将你的公钥复制粘贴进去并且保存->先启用 Test 模式进行测试->测试通过后启用 Live 模式
     */

    // 私钥
    public final static String  PRIVATEKEY= "-----BEGIN RSA PRIVATE KEY-----\n"+
            "MIIEowIBAAKCAQEAr8LWY5czMstD7PpTLAFQDTO3KeX6trj77AWBOEsKdYs2+V+N\n"+
            "b7hhcrXnGivYV4JNA3BJG2+CEArl8iH/XQs+RM49qAnzfnE15NFXWIOs+EoWUQ93\n"+
            "igUWs5jG3o2z/diAOxHdkJutHVIRGgm4Il5OEeHInJSXAbuQxw29Ieb/GaOp5zox\n"+
            "GI+pLW3nyZq1uofxMj+yVdj3VPv93kdzgQuDrwixmMiMBdrciS4gSfglcgXHeJY6\n"+
            "fEQBRLscmmh2wUFhFRz5Cwv6blqHutSZhWRZJvuHxFYuvSKPQAqgM6IFRv1f4Aro\n"+
            "dbpuJOt5oLWyflK3SGdtG2+BEDWbtSKfKQinZwIDAQABAoIBAFx75H3REOK4bIyl\n"+
            "B+DO7AWWYdoNJsjBO+Zs2xr4+Y7ya0H7Epxn4/cNWoa97X/Wk5msmvtxyHmSkn6/\n"+
            "fvTBtslT0MO8QMEW5yn5McHkv76ClY2f2uHoXZKxYGu5Gq4HHyp18yVllUkpZtBR\n"+
            "ru9+ugvUx9AErBUAUmU7iHrvZuphAbNgpqEzkzC6+1hrpW60jkvaio5sN+DyPJnU\n"+
            "alkNVar1tZPec8IYC4S7sTEW4s/kraB3n0Kf+Is/49HsOUcuDPivGGMB55M8UsAK\n"+
            "W1/8Uny55tYjUGMkFsM/7eZW+/lMcRDqeLiC9rXJ43eVs6TxvQTV0BPVescuHafi\n"+
            "8IwPLWkCgYEA4A8l84XWnAz24OOfesa1q/kzWZkPSrfjO4roAOb5BEUU9UH2PhTs\n"+
            "fwUk8cgVfjnt+jDP4CiywwMAaYoOhoV5lC6T2ZheVGuEOZJHSMTRXy5Qh2qAk7RU\n"+
            "bY2ZINpV05F4x4ekpwXW2YOAYBrZmHW9SeHKQosD/XyAc10Ucv999RUCgYEAyNEX\n"+
            "RtTT6Bp83HwdWZB8xC1CyaRZ6xxsjTtwdgctlK4Y4QWZv1id6X7JLyAJEC6Ouu2o\n"+
            "rPaUIxmSgCefrGbfHdVshuTXqUin8/XAiN0zksTuO2PNlZUIK14MM9PPDbmkcHTC\n"+
            "vZDaDBHBBmdgp4GRwMM+7srn3kH9h9rcWZ3RgYsCgYEAmx2BnZ0LnU9QXxLWps4I\n"+
            "mb1VMnNHZef2lZMt2OoOfUlCICUBT6t2qt0p3YUydAew3COM1lf2ohFi6K3eLn0b\n"+
            "VV4Fl3/n1jP0/1JorVUsyeMrdwRhbWBLjuiXmWnuPyEX57LdZ5AgVMe4SVBtUiI4\n"+
            "4HxDZVwOcCAQYU2QSajdT50CgYAk9cbQ9I7j4ywj8Hv+Zgdwm9v0/NjH2v1nqQ7z\n"+
            "yjJrcPeHQt6fRxIZTYp9r+m7HraKVP98hg2RwD0kdSaANpbOCN/mm+vNbl/rGMoM\n"+
            "5pl9Y91s9Nt7smhEgxS/3TX4krhfMj49YZGgMwxRv2kcq05GKilFDfdLAt5EyNVR\n"+
            "cSiELQKBgEzxggtkpsCwi4zm5PN42beZZislQ1Ex5nyZTac2iRKsPvWCQJeiskn1\n"+
            "qiJuJ5IikDt9iQMRbFlp2Noq9dhdIHUH9Unq61TbEWB2NAdGJlZMg5i/XvUX42eS\n"+
            "Oq/nhbx3ukPaCABR00+Xgi8V6d8am3xpcKzpr+HG8THpU7Uhzy2g\n"+
            "-----END RSA PRIVATE KEY-----\n";
    // Ping++公钥
    public final static String  PINGPUBLICKEY="-----BEGIN PUBLIC KEY-----\n"+
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxRVEaKsenSdS/6pKk21L\n"+
            "AQOyeRg6v/Uh+MzxD6HXQygI5f6edWgT2jdIx0uQ0H+4OUorSc7otxR+cPsuriG9\n"+
            "kOGw6Ah0lyvOZy+HHtnW1r6UCTACMXEnasX+4CBRFymeOmWe9n1yssoUEq9reO98\n"+
            "9PbuKYlEr6YAzDx9in9rU9A7Zizto34LUekDOLTC6Wwd8WKeS7+cTN7WWOOKgtoz\n"+
            "1C7EPyhQClzSt15qkD+n8xAvn5mLydHDP+MxWZExtsBqQMdtrO4fSi02H5zlYX9/\n"+
            "Tqo6IV6cdn91zKGBXRrAhDitGp7xBdhFb6Nx43F6yvXoIYjRSoFKXU29Z7bjdq3Q\n"+
            "0wIDAQAB\n"+
            "-----END PUBLIC KEY-----\n";
}
