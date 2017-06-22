package io.github.rcarlosdasilva.weixin.common.dictionary;

/**
 * 请求响应代码
 * 
 * @author Dean Zhao (rcarlosdasilva@qq.com)
 */
public enum ResultCode {

  RESULT_n1(-1, "系统繁忙，此时请开发者稍候再试"), //
  RESULT_0(0, "请求成功"), //
  RESULT_40001(40001,
      "获取access_token时AppSecret错误，或者access_token无效。请开发者认真比对AppSecret的正确性，" //
          + "或查看是否正在为恰当的公众号调用接口"), //
  RESULT_40002(40002, "请确保grant_type字段值为client_credential"), //
  RESULT_40003(40003,
      "不合法的OpenID，请开发者确认OpenID（该用户）是否已关注公众号，" //
          + "或是否是其他公众号的OpenID"), //
  RESULT_40004(40004, "不合法的媒体文件类型"), //
  RESULT_40005(40005, "不合法的文件类型"), //
  RESULT_40006(40006, "不合法的文件大小"), //
  RESULT_40007(40007, "不合法的媒体文件id"), //
  RESULT_40008(40008, "不合法的消息类型"), //
  RESULT_40009(40009, "不合法的图片文件大小"), //
  RESULT_40010(40010, "不合法的语音文件大小"), //
  RESULT_40011(40011, "不合法的视频文件大小"), //
  RESULT_40012(40012, "不合法的缩略图文件大小"), //
  RESULT_40013(40013, "不合法的AppID，请开发者检查AppID的正确性，避免异常字符，注意大小写"), //
  RESULT_40014(40014,
      "不合法的access_token，请开发者认真比对access_token的有效性（如是否过期），" //
          + "或查看是否正在为恰当的公众号调用接口"), //
  RESULT_40015(40015, "不合法的菜单类型"), //
  RESULT_40016(40016, "不合法的按钮个数"), //
  RESULT_40017(40017, "不合法的按钮类型"), //
  RESULT_40018(40018, "不合法的按钮名字长度"), //
  RESULT_40019(40019, "不合法的按钮KEY长度"), //
  RESULT_40020(40020, "不合法的按钮URL长度"), //
  RESULT_40021(40021, "不合法的菜单版本号"), //
  RESULT_40022(40022, "不合法的子菜单级数"), //
  RESULT_40023(40023, "不合法的子菜单按钮个数"), //
  RESULT_40024(40024, "不合法的子菜单按钮类型"), //
  RESULT_40025(40025, "不合法的子菜单按钮名字长度"), //
  RESULT_40026(40026, "不合法的子菜单按钮KEY长度"), //
  RESULT_40027(40027, "不合法的子菜单按钮URL长度"), //
  RESULT_40028(40028, "不合法的自定义菜单使用用户"), //
  RESULT_40029(40029, "不合法的oauth_code"), //
  RESULT_40030(40030, "不合法的refresh_token"), //
  RESULT_40031(40031, "不合法的openid列表"), //
  RESULT_40032(40032, "不合法的openid列表长度"), //
  RESULT_40033(40033, "不合法的请求字符，不能包含\\uxxxx格式的字符"), //
  RESULT_40035(40035, "不合法的参数"), //
  RESULT_40037(40037, "不合法的模板ID"), //
  RESULT_40038(40038, "不合法的请求格式"), //
  RESULT_40039(40039, "不合法的URL长度"), //
  RESULT_40050(40050, "不合法的分组id"), //
  RESULT_40051(40051, "分组名字不合法"), //
  RESULT_40052(40052, "不合法的action"), //
  RESULT_40097(40097, "参数不合法"), //
  RESULT_40117(40117, "分组名字不合法"), //
  RESULT_40118(40118, "media_id大小不合法"), //
  RESULT_40119(40119, "button类型错误"), //
  RESULT_40120(40120, "button类型错误"), //
  RESULT_40121(40121, "不合法的media_id类型"), //
  RESULT_40125(40125, "无效的secret参数"), //
  RESULT_40132(40132, "微信号不合法"), //
  RESULT_40137(40137, "不支持的图片格式"), //
  RESULT_40152(40152, "不合法的分组id"), //
  RESULT_40164(40164, "调用接口的IP地址不在白名单中，请在接口IP白名单中进行设置"), //
  RESULT_41001(41001, "缺少access_token参数"), //
  RESULT_41002(41002, "缺少appid参数"), //
  RESULT_41003(41003, "缺少refresh_token参数"), //
  RESULT_41004(41004, "缺少secret参数"), //
  RESULT_41005(41005, "缺少多媒体文件数据"), //
  RESULT_41006(41006, "缺少media_id参数"), //
  RESULT_41007(41007, "缺少子菜单数据"), //
  RESULT_41008(41008, "缺少oauth code"), //
  RESULT_41009(41009, "缺少openid"), //
  RESULT_42001(42001,
      "access_token超时，请检查access_token的有效期，请参考基础支持-获取access_token中，" //
          + "对access_token的详细机制说明"), //
  RESULT_42002(42002, "refresh_token超时"), //
  RESULT_42003(42003, "oauth_code超时"), //
  RESULT_42007(42007, "用户修改微信密码，accesstoken和refreshtoken失效，需要重新授权"), //
  RESULT_43001(43001, "需要GET请求"), //
  RESULT_43002(43002, "需要POST请求"), //
  RESULT_43003(43003, "需要HTTPS请求"), //
  RESULT_43004(43004, "需要接收者关注"), //
  RESULT_43005(43005, "需要好友关系"), //
  RESULT_43008(43008, "商户没有开通微信支付权限或者没有在商户后台申请微信买单功能"), //
  RESULT_43019(43019, "需要先从黑名单中移除"), //
  RESULT_43100(43100, "模板所在行业修改太频繁（每月一次）"), //
  RESULT_44001(44001, "多媒体文件为空"), //
  RESULT_44002(44002, "POST的数据包为空"), //
  RESULT_44003(44003, "图文消息内容为空"), //
  RESULT_44004(44004, "文本消息内容为空"), //
  RESULT_45001(45001, "多媒体文件大小超过限制"), //
  RESULT_45002(45002, "消息内容超过限制"), //
  RESULT_45003(45003, "标题字段超过限制"), //
  RESULT_45004(45004, "描述字段超过限制"), //
  RESULT_45005(45005, "链接字段超过限制"), //
  RESULT_45006(45006, "图片链接字段超过限制"), //
  RESULT_45007(45007, "语音播放时间超过限制"), //
  RESULT_45008(45008, "图文消息超过限制"), //
  RESULT_45009(45009, "接口调用超过限制"), //
  RESULT_45010(45010, "创建菜单个数超过限制"), //
  RESULT_45015(45015, "回复时间超过限制"), //
  RESULT_45016(45016, "系统分组，不允许修改"), //
  RESULT_45017(45017, "分组名字过长"), //
  RESULT_45018(45018, "分组数量超过上限"), //
  RESULT_45026(45026, "模板数量超过限制"), //
  RESULT_45046(45046, "该card_id已经设置了买单功能，不可变更为自助核销功能，设置冲突"), //
  RESULT_45047(45047, "客服接口下行条数超过上限"), //
  RESULT_45065(45065, "相同 clientmsgid 已存在群发记录，返回数据中带有已存在的群发任务的 msgid"), //
  RESULT_45066(45066, "相同 clientmsgid 重试速度过快，请间隔1分钟重试"), //
  RESULT_45067(45067, "clientmsgid 长度超过限制"), //
  RESULT_46001(46001, "不存在媒体数据"), //
  RESULT_46002(46002, "不存在的菜单版本"), //
  RESULT_46003(46003, "不存在的菜单数据"), //
  RESULT_46004(46004, "不存在的用户"), //
  RESULT_47001(47001, "解析JSON/XML内容错误"), //
  RESULT_48001(48001, "api功能未授权，请确认公众号已获得该接口，可以在公众平台官网-开发者中心页中查看接口权限"), //
  RESULT_48004(48004, "api接口被封禁，请登录mp.weixin.qq.com查看详情"), //
  RESULT_48005(48005, "api禁止删除被自动回复和自定义菜单引用的素材"), //
  RESULT_48006(48006, "api禁止清零调用次数，因为清零次数达到上限"), //
  RESULT_49003(49003, "传入的openid不属于此AppID"), //
  RESULT_50001(50001, "用户未授权该api"), //
  RESULT_50002(50002, "用户受限，可能是违规后接口被封禁"), //
  RESULT_61451(61451, "参数错误(invalid parameter)"), //
  RESULT_61452(61452, "无效客服账号(invalid kf_account)"), //
  RESULT_61453(61453, "客服帐号已存在(kf_account exsited)"), //
  RESULT_61454(61454,
      "客服帐号名长度超过限制(仅允许10个英文字符，" //
          + "不包括@及@后的公众号的微信号)(invalid kf_acount length)"), //
  RESULT_61455(61455, "客服帐号名包含非法字符(仅允许英文+数字)(illegal character in kf_account)"), //
  RESULT_61456(61456, "客服帐号个数超过限制(10个客服账号)(kf_account count exceeded)"), //
  RESULT_61457(61457, "无效头像文件类型(invalid file type)"), //
  RESULT_61450(61450, "系统错误(system error)"), //
  RESULT_61500(61500, "日期格式错误"), //
  RESULT_61501(61501, "日期范围错误"), //
  RESULT_65301(65301, "不存在此menuid对应的个性化菜单"), //
  RESULT_65302(65302, "没有相应的用户"), //
  RESULT_65303(65303, "没有默认菜单，不能创建个性化菜单"), //
  RESULT_65304(65304, "MatchRule信息为空"), //
  RESULT_65305(65305, "个性化菜单数量受限"), //
  RESULT_65306(65306, "不支持个性化菜单的帐号"), //
  RESULT_65307(65307, "个性化菜单信息为空"), //
  RESULT_65308(65308, "包含没有响应类型的button"), //
  RESULT_65309(65309, "个性化菜单开关处于关闭状态"), //
  RESULT_65310(65310, "填写了省份或城市信息，国家信息不能为空"), //
  RESULT_65311(65311, "填写了城市信息，省份信息不能为空"), //
  RESULT_65312(65312, "不合法的国家信息"), //
  RESULT_65313(65313, "不合法的省份信息"), //
  RESULT_65314(65314, "不合法的城市信息"), //
  RESULT_65316(65316, "该公众号的菜单设置了过多的域名外跳（最多跳转到3个域名的链接）"), //
  RESULT_65317(65317, "不合法的URL"), //
  RESULT_65400(65400, "API不可用，即没有开通/升级到新版客服功能"), //
  RESULT_65401(65401, "无效客服帐号"), //
  RESULT_65403(65403, "客服昵称不合法"), //
  RESULT_65404(65404, "客服帐号不合法"), //
  RESULT_65405(65405, "帐号数目已达到上限，不能继续添加"), //
  RESULT_65406(65406, "已经存在的客服帐号"), //
  RESULT_65407(65407, "邀请对象已经是该公众号客服"), //
  RESULT_65408(65408, "本公众号已经有一个邀请给该微信"), //
  RESULT_65409(65409, "无效的微信号"), //
  RESULT_65410(65410, "邀请对象绑定公众号客服数达到上限（目前每个微信号可以绑定5个公众号客服帐号）"), //
  RESULT_65411(65411, "该帐号已经有一个等待确认的邀请，不能重复邀请"), //
  RESULT_65412(65412, "该帐号已经绑定微信号，不能进行邀请"), //
  RESULT_7000000(7000000, "请求正常， 无语义结果"), //
  RESULT_7000001(7000001, "缺失请求参数"), //
  RESULT_7000002(7000002, "signature 参数无效"), //
  RESULT_7000003(7000003, "地理位置相关配置 1 无效"), //
  RESULT_7000004(7000004, "地理位置相关配置 2 无效"), //
  RESULT_7000005(7000005, "请求地理位置信息失败"), //
  RESULT_7000006(7000006, "地理位置结果解析失败"), //
  RESULT_7000007(7000007, "内部初始化失败"), //
  RESULT_7000008(7000008, "非法 appid（获取密钥失败）"), //
  RESULT_7000009(7000009, "请求语义服务失败"), //
  RESULT_7000010(7000010, "非法 post 请求"), //
  RESULT_7000011(7000011, "post 请求 json 字段无效"), //
  RESULT_7000030(7000030, "查询 query 太短"), //
  RESULT_7000031(7000031, "查询 query 太长"), //
  RESULT_7000032(7000032, "城市、经纬度信息缺失"), //
  RESULT_7000033(7000033, "query 请求语义处理失败"), //
  RESULT_7000034(7000034, "获取天气信息失败"), //
  RESULT_7000035(7000035, "获取股票信息失败"), //
  RESULT_7000036(7000036, "utf8 编码转换失败"), //
  RESULT_9001001(9001001, "POST数据参数不合法"), //
  RESULT_9001002(9001002, "远端服务不可用"), //
  RESULT_9001003(9001003, "Ticket不合法"), //
  RESULT_9001004(9001004, "获取摇周边用户信息失败"), //
  RESULT_9001005(9001005, "获取商户信息失败"), //
  RESULT_9001006(9001006, "获取OpenID失败"), //
  RESULT_9001007(9001007, "上传文件缺失"), //
  RESULT_9001008(9001008, "上传素材的文件类型不合法"), //
  RESULT_9001009(9001009, "上传素材的文件尺寸不合法"), //
  RESULT_9001010(9001010, "上传失败"), //
  RESULT_9001020(9001020, "帐号不合法"), //
  RESULT_9001021(9001021, "已有设备激活率低于50%，不能新增设备"), //
  RESULT_9001022(9001022, "设备申请数不合法，必须为大于0的数字"), //
  RESULT_9001023(9001023, "已存在审核中的设备ID申请"), //
  RESULT_9001024(9001024, "一次查询设备ID数量不能超过50"), //
  RESULT_9001025(9001025, "设备ID不合法"), //
  RESULT_9001026(9001026, "页面ID不合法"), //
  RESULT_9001027(9001027, "页面参数不合法"), //
  RESULT_9001028(9001028, "一次删除页面ID数量不能超过10"), //
  RESULT_9001029(9001029, "页面已应用在设备中，请先解除应用关系再删除"), //
  RESULT_9001030(9001030, "一次查询页面ID数量不能超过50"), //
  RESULT_9001031(9001031, "时间区间不合法"), //
  RESULT_9001032(9001032, "保存设备与页面的绑定关系参数错误"), //
  RESULT_9001033(9001033, "门店ID不合法"), //
  RESULT_9001034(9001034, "设备备注信息过长"), //
  RESULT_9001035(9001035, "设备申请参数不合法"), //
  RESULT_9001036(9001036, "查询起始值begin不合法");

  private int code;
  private String text;

  ResultCode(int code, String text) {
    this.code = code;
    this.text = text;
  }

  public int getCode() {
    return code;
  }

  public String getText() {
    return text;
  }

  /**
   * 根据code获取枚举对象.
   * 
   * @param code
   *          代码
   * @return 枚举
   */
  public static ResultCode byCode(int code) {
    for (ResultCode result : values()) {
      if (result.code == code) {
        return result;
      }
    }
    return null;
  }

}