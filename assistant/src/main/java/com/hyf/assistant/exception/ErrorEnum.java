package com.hyf.assistant.exception;

/**
 * 错误码的定义：https://developer.aliyun.com/article/766288
 * 面向外部的错误码定义规则：
 * A错误来源于用户，B错误来源于系统，D错误来源于数据库，W错误来源于微信
 * 错误编码为四位数字，大类之间步长100。
 *
 * WX_NATIVE_ 开头都是微信开放平台自己的错误码，ERROR_ 是本平台自定义错误码！
 */
public enum ErrorEnum {
    /**
     * 通用错误
     */
    ERROR_COMMON_EXCEPTION("B0000","系统异常，请联系管理员！"),
    // 参数校验类
    ERROR_PARAMS_IS_EMPTY("A0001","参数不能为空"),
    ERROR_PARAMS_ILLEGAL("A0002","参数不合法"),
    // 操作通用
    ERROR_OPERATE_FAIL("A0010","操作失败"),
    // 微信通用报错200010
    ERROR_WX_RPC_FAIL("W0001","微信接口调用失败"),
    ERROR_WX_ENCRYPT_FAIL("W0002","微信报文加密失败"),
    ERROR_WX_DECRYPT_FAIL("W0003","微信报文解密失败"),
    // 微信授权类，以W开头，编码1000开始递增。,
    ERROR_COMPONENT_ACCESS_TOKEN("W1001","component_access_token获取失败"),
    ERROR_PRE_AUTH_CODE("W1002","PRE_AUTH_CODE获取失败"),
    ERROR_AUTHORIZER_REFRESH_TOKEN("W1003","刷新令牌失效，需要重新授权"),
    ERROR_API_AUTHORIZER_TOKEN("W1004","使用刷新令牌获取授权令牌接口失败"),

    //微信素材管理
    ERROR_MATERIAL_TYPE("M2001","类型不匹配"),

    /**
     * 开放平台授权Authentication
     */
    // 获取访问授权
    MPOB_NEED_APPROVE("MPOB_A0000", "需要用户手动授权"),
    MPOB_AUTHENTICATION_USERID_EMPTY("MPOB_A0001", "userId不能为空"),
    MPOB_UNSUPPORTED_RESPONSE_TYPE("MPOB_A0002", "不支持的Response Type"),
    MPOB_CLIENT_ID_EMPTY("MPOB_A0003", "ClientId 不能为空"),
    MPOB_INVALID_REQUEST("MPOB_A0004", "当前请求无效"),
    MPOB_SCOPES_DENIED("MPOB_A0005", "手动授权被拒绝"),
    MPOB_INVALID_AFFIRM("MPOB_A0006", "已超过用户手动授权确认的时效"),
    MPOB_INVALID_CLIENT("MPOB_A0007", "无效的客户端"),
    MPOB_UNSUPPORTED_GRANT_TYPE("MPOB_A0008", "不支持的 Grant Type"),
    MPOB_INVALID_GRANT("MPOB_A0009", "无效的 Token 授权"),
    MPOB_SIGNATURE_FAIL("MPOB_A0010", "签名验证失败"),
    MPOB_INVALID_CODE("MPOB_A0011", "临时授权码无效"),
    // BackendToken 和 电子渠道认证
    MPOB_BACKEND_AUTHENTICATION_FAIL("MPOB_A1000", "小程序商户服务客户端身份验证失败"),
    MPOB_EBANK_CHANNEL_AUTHENTICATION_FAIL("MPOB_A2000", "电子银行渠道客户端身份验证失败"),
    // 校验是否有调用接口的权限
    MPOB_API_AUTHORIZATION_FAIL("MPOB_A3000", "无接口调用权限"),
    MPOB_NOT_DATA_SECRET("MPOB_A3001", "找不到数据加密密钥"),
    MPOB_PROTECT_SENSITIVE_DATA("MPOB_A3002", "保护敏感数据失败"),

    /**
     * WX_NATIVE_ 开头都是微信开放平台自己的错误码，ERROR_ 是本平台自定义错误码！
     */
    WX_NATIVE_AUTH_REFRESH_TOKEN_INVALID("61023","刷新令牌无效"),
    WX_NATIVE_OPS_LOG_RPC_FREQUENTLY("200010","操作过于频繁，目前限制每分钟50次"),
    WX_NATIVE_OPS_LOG_DATE_INVALID("200002","参数错误，date、begintime、endtime必填。date只能是最近三天的日期，endtime必须大于begintime"),
    WX_NATIVE_OPS_DOMAIN_PERSONAL_UN_INVOKED("9410018","个人账号不可调用"),
    WX_NATIVE_OPS_NO_JURISDICTION("200007","无权限"),
    WX_NATIVE_OPS_JSERR_FREQUENTLY("20011","请求频繁，请稍后再试"),
    WX_NATIVE_BIND_WECHAT_ID_NOT_EXIST("85001","微信号不存在或微信号设置为不可搜索"),
    WX_NATIVE_BIND_NUMBER_FULL("85002","小程序绑定的体验者数量达到上限"),
    WX_NATIVE_BIND_WECHAT_FULL("85003","微信号绑定的小程序体验者达到上限"),
    WX_NATIVE_BING_WECHAT_BOUND("85004","微信号已经绑定"),
    WX_NATIVE_BASIC_NOT_APPLET("85015","该账号不是小程序账号"),
    WX_NATIVE_BASIC_LIMIT_EXCEEDED("85016","域名数量超过限制 ，总数不能超过1000"),
    WX_NATIVE_BASIC_DOMAIN_NOT_EXIST("85017","没有新增域名，请确认小程序已经添加了域名或该域名是否没有在第三方平台添加"),
    WX_NATIVE_BASIC_DOMAIN_NOT_REGISTER("85018","域名没有在第三方平台设置"),
    WX_NATIVE_BASIC_WEBVIEW_NOT_CHANGE("89019","业务域名无更改，无需重复设置"),
    WX_NATIVE_BASIC_WEBVIEW_NOT_EXIST("89020","尚未设置小程序业务域名，请先在第三方平台中设置小程序业务域名后在调用本接口"),
    WX_NATIVE_BASIC_WEBVIEW_NOT_REGISTER("89021","请求保存的域名不是第三方平台中已设置的小程序业务域名或子域名"),
    WX_NATIVE_BASIC_WEBVIEW_LIMIT_EXCEEDED("89029","业务域名数量超过限制，最多可以添加100个业务域名"),
    WX_NATIVE_BASIC_WEBVIEW_NOT_SUPPORT("89231","个人小程序不支持调用 setwebviewdomain 接口"),
    WX_NATIVE_BASIC_APP_NOT_QUICKCREATE("91001","不是公众号快速创建的小程序"),
    WX_NATIVE_BASIC_APP_NOT_RENAME("91002","小程序发布后不可改名"),
    WX_NATIVE_BASIC_APP_RENAME_ILLEGAL("91003","改名状态不合法，小程序发布前可改名的次数为2次，请确认改名次数是否已达上限"),
    WX_NATIVE_BASIC_NIKENAME_ILLEGAL("91004","昵称不合法"),
    WX_NATIVE_BASIC_NICKNAME_PROTECT("91005","昵称15天主体保护"),
    WX_NATIVE_BASIC_NICKNAME_HIT_WXACCOUNT("91006","昵称命中微信号"),
    WX_NATIVE_BASIC_NICKNAME_OCCUPIED("91007","昵称已被占用"),
    WX_NATIVE_BASIC_NICKNAME_SEVENDAY_PROTECT("91008","昵称命中7天侵权保护期"),
    WX_NATIVE_BASIC_NEED_COMMIT_MATERIALS("91009","需要提交材料"),
    WX_NATIVE_BASIC_OTHER_ERROR("91010","其他错误"),
    WX_NATIVE_BASIC_NOTSEARCH_NICKNAME_UPDATEINFO("91011","查不到昵称修改审核单信息"),
    WX_NATIVE_BASIC_ANOTHER_ERROR("91012","其他错误"),
    WX_NATIVE_BASIC_OCCUPIED_NAME_MANY("91013","占用名字过多"),
    WX_NATIVE_BASIC_SAMETYPE_DIFFERENT_MAINBODY("91014","+号规则同一类型关联名主体不一致"),
    WX_NATIVE_BASIC_ACCOUNT_DIFFERENT_APP("91015","指的是已经有同名的公众号，但是那个公众号的主体和当前小程序主体不一致"),
    WX_NATIVE_BASIC_NAME_OCCUPIED_OVER_TWO("91016","名称占用者≥2"),
    WX_NATIVE_BASIC_DIFFERENT_TYPE_MAINBODY("91017","+号规则不同类型关联名主体不一致"),
    WX_NATIVE_BASIC_NICKNAME_FORMAT_ILLEGAL("53010","名称格式不合法"),
    WX_NATIVE_BASIC_NICKNAME_HIT_LIMIT("53011","名称检测命中频率限制"),
    WX_NATIVE_BASIC_NICKNAME_FORBID_USE("53012","禁止使用该名称"),
    WX_NATIVE_BASIC_APP_OFFICEACCOUNT_REPETITION("53013","公众号：名称与已有公众号名称重复;小程序：该名称与已有小程序名称重复"),
    WX_NATIVE_BASIC_SAME_MAINBODY_APPLY_NICKNAME("53014","公众号：公众号已有{名称 A+}时，需与该帐号相同主体才可申请{名称 A};小程序：小程序已有{名称 A+}时，需与该帐号相同主体才可申请{名称 A}"),
    WX_NATIVE_BASIC_APP_SAMENAME_OFFICEACCOUNT("53015","公众号：该名称与已有小程序名称重复，需与该小程序帐号相同主体才可申请;小程序：该名称与已有公众号名称重复，需与该公众号帐号相同主体才可申请"),
    WX_NATIVE_BASIC_APP_OFFICEACCOUNT_MANY_REPETITION_NAME("53016","公众号：该名称与已有多个小程序名称重复，暂不支持申请;小程序：该名称与已有多个公众号名称重复，暂不支持申请"),
    WX_NATIVE_BASIC_APP_OFFICEACCOUNT_MAINBODY_APPLY_NICKNAME("53017","公众号：小程序已有{名称 A+}时，需与该帐号相同主体才可申请{名称 A};小程序：公众号已有{名称 A+}时，需与该帐号相同主体才可申请{名称 A}"),
    WX_NATIVE_BASIC_NAME_HIT_WXACCOUNT("53018","名称命中微信号"),
    WX_NATIVE_BASIC_NICKNAME_IN_PROTECT("53019","名称在保护期内"),
    WX_NATIVE_BASIC_INVAID_REGISTER_TYPE("41033","只允许通过api创建的小程序使用"),
    WX_NATIVE_BASIC_PARAM_ERROR("40097","参数错误"),
    WX_NATIVE_BASIC_MATERIALS_ID_NOTNULL("41006","media_id不能为空"),
    WX_NATIVE_BASIC_MATERIALS_ID_ILLEGAL("40007","非法的media_id"),
    WX_NATIVE_BASIC_MATERIALS_ID_NOTEXIST("46001","media_id不存在"),
    WX_NATIVE_BASIC_DATA_FORMAT_ERROR("47001","数据格式错误"),
    WX_NATIVE_BASIC_PICTURE_OVER_SIZE("40009","图片尺寸太大"),
    WX_NATIVE_BASIC_NO_UPDATE_HEADIMAGE_TIMES("53202","本月头像修改次数已用完"),
    WX_NATIVE_BASIC_NO_UPDATE_INTRODUCE_TIMES("53200","本月功能介绍修改次数已用完"),
    WX_NATIVE_BASIC_FUNCTION_INTRODUCE_HIT_BLACKLIST_WORD("53201","功能介绍内容命中黑名单关键字"),
    WX_NATIVE_BASIC_SEARCH_FORID_DONTMODIFY("85083","搜索标记位被封禁，无法修改"),
    WX_NATIVE_BASIC_ILLEGAL_STATUS_VALUE("85084","非法的status值，只能填0或者1"),
    WX_NATIVE_BASIC_INVALID_ACTION("9410013","无效action"),
    WX_NATIVE_BASIC_NOT_CALL_BY_APP("40166","非小程序发起调用"),
    WX_NATIVE_BASIC_INVALID_PRE_FETCH_TYPE("9410014","pre_fetch_type无效"),
    WX_NATIVE_BASIC_INVALID_URL_NEED_DOMAIN("9410016","url无效，需为业务域名"),
    WX_NATIVE_BASIC_INVALID_ENV_FUNCTION_NAME("9410017","env或function_name无效"),
    WX_NATIVE_NO_VERSION_AUDITING("85019","没有审核版本"),
    WX_NATIVE_CODE_STATUS_NOT_ALLOWED("85020","审核状态未满足发布"),
    WX_NATIVE_CODE_NO_CODE_UPLOAD("85058","当前没有提交审核的代码"),
    WX_NATIVE_CODE_INVALID_DIY_CONFIG("85013","无效的自定义配置"),
    WX_NATIVE_CODE_INVALID_TEMPLATE_NUMBER("85014","无效的模板编号"),
    WX_NATIVE_CODE_TEMPLATE_ERROR("85043","模板错误"),
    WX_NATIVE_CODE_OVER_SIZE("85044","代码包超过大小限制"),
    WX_NATIVE_CODE_EXT_JSON_NOTEXSIT_PATH("85045","ext_json有不存在的路径"),
    WX_NATIVE_CODE_TABAR_LACK_PATH("85046","tabBar中缺少path"),
    WX_NATIVE_CODE_PAGES_NULL("85047","pages字段为空"),
    WX_NATIVE_CODE_EXT_JSON_ANALYSIS_FAIL("85048","ext_json解析失败"),
    WX_NATIVE_CODE_NO_JURISDICTION_USE_PLUGIN("80082","没有权限使用该插件"),
    WX_NATIVE_CODE_NOT_FIND_PLUGIN("80067","找不到使用的插件"),
    WX_NATIVE_CODE_INVALID_PLUGIN_VERSION("80066","非法的插件版本"),
    WX_NATIVE_CODE_FRC_COMMIT_WAIT("9402202","请勿频繁提交，待上一次操作完成后再提交"),
    WX_NATIVE_CODE_TEMPLATE_ERROR_ILLEGAL_PARAM("9402203","标准模板ext_json错误，传了不合法的参数， 如果是标准模板库的模板，则ext_json支持的参数仅为{\"extAppid\":'', \"ext\": {}, \"window\": {}}"),
    WX_NATIVE_CODE_NOT_APP_CALL("86000","不是由第三方代小程序进行调用"),
    WX_NATIVE_CODE_NOTEXIST_COMMIT_CODE("86001","不存在第三方的已经提交的代码"),
    WX_NATIVE_CODE_LABEL("85006","标签格式错误"),
    WX_NATIVE_CODE_PAGE_PATH_ERROR("85007","页面路径错误"),
    WX_NATIVE_CODE_APP_NOT_CHECK_READD("85008","当前小程序没有已经审核通过的类目，请添加类目成功后重试"),
    WX_NATIVE_CODE_HAVE_CHECK_VERSION("85009","已经有正在审核的版本"),
    WX_NATIVE_CODE_ITEM_LIST_PROJECT_NULL("85010","item_list有项目为空"),
    WX_NATIVE_CODE_TITLE_WRITE_ERROR("85011","标题填写错误"),
    WX_NATIVE_CODE_PROJECT_NUMBER_NOT_RANGE("85023","审核列表填写的项目数不在1-5以内"),
    WX_NATIVE_CODE_APP_INFO_INVALID("85077","小程序类目信息失效（类目中含有官方下架的类目，请重新选择类目）"),
    WX_NATIVE_CODE_APP_NOT_SET_INFO("86002","小程序还未设置昵称、头像、简介。请先设置完后再重新提交"),
    WX_NATIVE_CODE_APP_ARRAIGNMENT_OVER_RANGE("85085","小程序提审数量已达本月上限，请点击查看《临时quota申请流程》"),
    WX_NATIVE_CODE_COMMIT_CODE_BEFORE_CHECK("85086","提交代码审核之前需提前上传代码"),
    WX_NATIVE_CODE_COMMIT_AFTER_JUMP_APPID("85087","小程序已使用api navigateToMiniProgram，请声明跳转appid列表后再次提交"),
    WX_NATIVE_CODE_GAME_DONT_COMMIT("87006","小游戏不能提交"),
    WX_NATIVE_CODE_APP_FORBID_COMMIT("86007","小程序禁止提交"),
    WX_NATIVE_CODE_VERSION_DESC_OVERRUN("85051","version_desc或者preview_info超限"),
    WX_NATIVE_CODE_PREVIEW_INFO_FORMAT_ERROR("85092","preview_info格式错误"),
    WX_NATIVE_CODE_PREVIEW_INFO_VIDEO_OVER_NUMBER("85093","preview_info视频或者图片个数超限"),
    WX_NATIVE_CODE_APPLY_CHECK_INFO("85094","需提供审核机制说明信息"),
    WX_NATIVE_CODE_SEVER_ADD_APP_LIMIT("86009","服务商新增小程序代码提审能力被限制"),
    WX_NATIVE_CODE_SEVER_ITERATION_APP_LIMIT("86010","服务商迭代小程序代码提审能力被限制"),
    WX_NATIVE_CODE_OPEN_APP_LIVE("9400001","该开发小程序已开通小程序直播权限，不支持发布版本。如需发版，请解绑开发小程序后再操作"),
    WX_NATIVE_CODE_INVALID_CHECK_ID("85012","无效的审核id"),
    WX_NATIVE_CODE_WITHDRAW_TIMES_ARRIVE("87013","撤回次数达到上限（每天5次,每个月10次）"),
    WX_NATIVE_CODE_DONT_REVERT("87011","现网已经在灰度发布，不能进行版本回退"),
    WX_NATIVE_CODE_DONT_REVERT_REASON("87012","该版本不能回退，可能的原因：1:无上一个线上版用于回退 2:此版本为已回退版本，不能回退 3:此版本为回退功能上线之前的版本，不能回退"),
    WX_NATIVE_CODE_NO_ONLINE_VERSION("85079","小程序没有线上版本，不能进行灰度"),
    WX_NATIVE_CODE_COMMIT_CHECK_FAIL("85080","小程序提交的审核未审核通过"),
    WX_NATIVE_CODE_INVALID_PUBLISH_PROPORTION("85081","无效的发布比例"),
    WX_NATIVE_CODE_CURRENT_PUBLISH_THAN_BEFORE("85082","当前的发布比例需要比之前设置的高"),
    WX_NATIVE_CODE_VERSION_ERROR("85015","版本输入错误"),
    WX_NATIVE_CODE_SYSTEM_INSTABLE("89401","系统不稳定，请稍后再试，如多次失败请通过社区反馈"),
    WX_NATIVE_CODE_CHECK_AUDIT_LIST("89402","该审核单不在待审核队列，请检查是否已提交审核或已审完"),
    WX_NATIVE_CODE_DONT_SUPPORT_URGENT("89403","本单属于平台不支持加急种类，请等待正常审核流程"),
    WX_NATIVE_CODE_URGENT_SUCCESS("89404","本单已加速成功，请勿重复提交"),
    WX_NATIVE_CODE_URGENT_QUOTA_NOT_ENOUGH("89405","本月加急额度不足，请提升提审质量以获取更多额度"),
    WX_NATIVE_CODE_QUEST_FREQUENT("61503","数据繁忙，请稍再试"),
    WX_NATIVE_CODE_FORBID_VERSION("87012","该版本不能回退，可能的原因：1:无上一个线上版用于回退 2:此版本为已回退版本，不能回退 3:此版本为回退功能上线之前的版本，不能回退"),

    WX_NATIVE_TEMPLATE_NOT_FIND_TEMPLATE("85064","找不到模板"),
    WX_NATIVE_TEMPLATE_LIBRARY_ENOUGH("85065","模板库已满"),
    WX_NATIVE_TEMPLATE_USE_GET_TYPE("43001","请使用GET,不要使用post"),

    WX_NATIVE_CATEGORY_ADD_DATA("53311","需要提交资料信息"),

    WX_NATIVE_MEDIA_ID_INVALID("40007","不合法的媒体文件 id"),
    WX_NATIVE_MEDIA_TYPE_INVALID("40004","不合法的媒体文件类型"),
    WX_NATIVE_MEDIA_FILE_INVALID("40005","上传素材文件格式不对"),
    WX_NATIVE_MEDIA_SIZE_INVALID("40006","上传素材文件大小超出限制"),
    WX_NATIVE_MEDIA_DATA_MISSING("41005","缺少多媒体文件数据，传输素材无视频或图片内容"),
    WX_NATIVE_MEDIA_FORBID_DELETE("48005","禁止删除被自动回复和自定义菜单引用的素材"),



    WX_NATIVE_LINK_QUOTA_LIMIT("89007","小程序本月被关联的名额已用完"),
    WX_NATIVE_LINK_OVERSEAS_NOT("89008","小程序为海外帐号，不允许关联"),
    WX_NATIVE_LINK_WXA_LIMIT("89009","小程序关联达到上限"),
    WX_NATIVE_LINK_IS_SENT("89010","已经发送关联邀请"),
    WX_NATIVE_LINK_NEARBY_NOT("89011","在附近中展示的小程序不能取消关联"),
    WX_NATIVE_LINK_STORE_NOT("89012","门店、小店小程序不能取消关联"),
    WX_NATIVE_LINK_IS_BANNED("89013","小程序被封禁"),
    WX_NATIVE_LINK_HAS_WXA("89015","已经关联该小程序"),
    WX_NATIVE_LINK_SAME_QUOTA("89016","公众号本月关联相同主体达到上限"),
    WX_NATIVE_LINK_DIFFERENT_QUOTA("89017","公众号本月关联不同主体达到上限"),
    WX_NATIVE_LINK_FROM_MP("89035","已经从公众平台后台发起关联申请，处于小程序管理员确认中，无法从第三方重复发起关联申请"),

    WX_NATIVE_TAG_INVALID("45157","标签名非法，请注意不能和其他标签重名"),
    WX_NATIVE_TAG_TOO_LONG("45158","标签名长度超过30个字节"),
    WX_NATIVE_TAG_TOO_MORE("45056","创建的标签数过多，请注意不能超过100个"),
    WX_NATIVE_TAG_CAN_NOT_MODIFY("45058","不能修改0/1/2这三个系统默认保留的标签"),
    WX_NATIVE_TAG_CAN_NOT_DELETE("45058","该标签下粉丝数超过10w，不允许直接删除"),
    WX_NATIVE_TAG_INVALID_OPENID("40003","传入非法的openid"),
    WX_NATIVE_TAG_INVALID_TAGID("45159","非法的tag_id"),
    WX_NATIVE_TAG_SIZE_ERROR("40032","每次传入的openid列表个数不能超过50个"),
    WX_NATIVE_TAG_USER_TOO_MUCH("45059","有粉丝身上的标签数已经超过限制，即超过20个"),
    WX_NATIVE_TAG_OPENID_MATCH("49003","传入的openid不属于此AppID"),
    WX_NATIVE_TAG_OPENID_MORE("40032","每次传入的openid列表个数不能超过50个"),
    WX_NATIVE_TAG_INVALID_APPID("40013","不合法的appid"),
    WX_NATIVE_TAG_NAME_INVALID("45157","标签名非法，请注意不能和其他标签重名"),
    WX_NATIVE_TAG_SIZE_TOO_LONG("40032","一次只能拉黑20个用户"),
    WX_NATIVE_TAG_REMAKE_INVALID("40092","备注名不合法"),
    WX_NATIVE_DATA_DATE_ERROR("61501","时间范围不合法"),


    /**
     * 开放平台商户接入
     */
    OBOP_LOGIN_NOT_EXIT("A3001","账号或密码错误"),
    OBOP_REGISTER_ADMIN_NAME_ERROR("A3002","管理员用户名已存在"),
    OBOP_REGISTER_NAME_ERROR("A3003","商户名称已存在"),
    OBOP_NOT_FIND("A3004","商户不存在"),
    OBOP_MERCHANT_UN_ENABLED("A3005","该商户已封禁"),
    OBOP_MERCHANT_IS_DELETE("A3006","该商户已注销 "),
    OBOP_EVIDENCE_LACK("A3007","认证材料不完整"),
    OBOP_AUTH_EXIT("A3009","认证审核中，请不要重复提交"),
    OBOP_AUTH_INVALID("A3011","设置审核状态失败"),
    OBOP_MERCHANT_ERROR("A3013","商户已注销或封禁"),
    OBOP_MERCHANT_UN_COMMIT("A3014","未提交审核"),
    OBOP_APP_NOT_EXIT("A3015","小程序不存在"),
    OBOP_APP_IS_DELETE("A3016","小程序已删除"),
    OBOP_APP_ERROR("A3017","小程序不满足当前操作条件"),
    OBOP_PERMISSION_UN_EXIT("A3019","传入权限编码有误"),
    OBOP_APP_NAME_EXIT("A3021","小程序名称已存在"),
    OBOP_APP_LOGIN("A3022","身份过期，请重新登录！"),
    OBOP_PERMISSION_EXIT("A3023","权限编码已存在"),
    OBOP_PERMISSION_UN_ENABLED("A3024","存在禁用的权限"),
    OBOP_MERCHANT_EXIT("A3025","商户认证材料已被其他商户使用"),
    OBOP_MERCHANT_ORG_CODE_ERROR("A3026","机构编码有误"),
    OBOP_MERCHANT_AUDIT_FAIL("A3027","条件不满足"),
    ;


    private String code;
    private String message;

    ErrorEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 判断是否命中微信开放平台错误码
     * @param wxErrCode 微信开放平台接口返回的错误码
     * @return 如果相等则返回 true，否则是 false。
     */
    public boolean equals(int wxErrCode) {
        return this.code.equals(String.valueOf(wxErrCode));
    }

    public ApiException  apiException() {
        return new ApiException(this.getCode(), this.message);
    }

    public ApiException apiException(String msg) {
        return new ApiException(this.getCode(), msg);
    }

    public static boolean isOk(int wxErrCode) {
        return wxErrCode == 0;
    }
}
