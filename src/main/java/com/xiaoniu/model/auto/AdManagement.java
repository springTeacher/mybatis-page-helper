package com.xiaoniu.model.auto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ad_management")
public class AdManagement {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 广告位名称
     */
    @Column(name = "code_name")
    private String codeName;

    /**
     * 广告代码位ID
     */
    @Column(name = "code_id")
    private String codeId;

    /**
     * 投放类型:1-穿山甲，2-优量汇
     */
    private Integer source;

    /**
     * 选择应用
     */
    @Column(name = "app_name")
    private Integer appName;

    /**
     * 作用版本号
     */
    private String version;

    /**
     * 作用渠道号
     */
    private String channel;

    /**
     * 广告位置：1-随机气泡,2-步数兑换气泡，3-领取阶段性奖励，4-看看列表广告位，5-看看详情广告，6-签到，7-看福利视频，8-个人中心底部
     */
    private String position;

    /**
     * 看看广告间隔数
     */
    @Column(name = "kankan_ad_interval_number")
    private String kankanAdIntervalNumber;

    /**
     * 开关：1-开启 2-关闭
     */
    private Integer state;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 创建人
     */
    @Column(name = "create_man")
    private String createMan;

    /**
     * 修改人
     */
    @Column(name = "modify_man")
    private String modifyMan;

    /**
     * 作用范围：1-大于，2-大于等于，3-等于，4-小于，5-小于等于，6-不等于
     */
    @Column(name = "range_version")
    private Integer rangeVersion;

    /**
     * 应用id
     */
    @Column(name = "application_id")
    private String applicationId;

    /**
     * 客户端：0-Android、1-IOS
     */
    @Column(name = "os_version")
    private Integer osVersion;

    /**
     * 屏蔽版本号
     */
    @Column(name = "shield_version")
    private String shieldVersion;

    /**
     * 屏蔽渠道号
     */
    @Column(name = "shield_channel")
    private String shieldChannel;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取广告位名称
     *
     * @return code_name - 广告位名称
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * 设置广告位名称
     *
     * @param codeName 广告位名称
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    /**
     * 获取广告代码位ID
     *
     * @return code_id - 广告代码位ID
     */
    public String getCodeId() {
        return codeId;
    }

    /**
     * 设置广告代码位ID
     *
     * @param codeId 广告代码位ID
     */
    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    /**
     * 获取投放类型:1-穿山甲，2-优量汇
     *
     * @return source - 投放类型:1-穿山甲，2-优量汇
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 设置投放类型:1-穿山甲，2-优量汇
     *
     * @param source 投放类型:1-穿山甲，2-优量汇
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 获取选择应用
     *
     * @return app_name - 选择应用
     */
    public Integer getAppName() {
        return appName;
    }

    /**
     * 设置选择应用
     *
     * @param appName 选择应用
     */
    public void setAppName(Integer appName) {
        this.appName = appName;
    }

    /**
     * 获取作用版本号
     *
     * @return version - 作用版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置作用版本号
     *
     * @param version 作用版本号
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取作用渠道号
     *
     * @return channel - 作用渠道号
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置作用渠道号
     *
     * @param channel 作用渠道号
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * 获取广告位置：1-随机气泡,2-步数兑换气泡，3-领取阶段性奖励，4-看看列表广告位，5-看看详情广告，6-签到，7-看福利视频，8-个人中心底部
     *
     * @return position - 广告位置：1-随机气泡,2-步数兑换气泡，3-领取阶段性奖励，4-看看列表广告位，5-看看详情广告，6-签到，7-看福利视频，8-个人中心底部
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置广告位置：1-随机气泡,2-步数兑换气泡，3-领取阶段性奖励，4-看看列表广告位，5-看看详情广告，6-签到，7-看福利视频，8-个人中心底部
     *
     * @param position 广告位置：1-随机气泡,2-步数兑换气泡，3-领取阶段性奖励，4-看看列表广告位，5-看看详情广告，6-签到，7-看福利视频，8-个人中心底部
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取看看广告间隔数
     *
     * @return kankan_ad_interval_number - 看看广告间隔数
     */
    public String getKankanAdIntervalNumber() {
        return kankanAdIntervalNumber;
    }

    /**
     * 设置看看广告间隔数
     *
     * @param kankanAdIntervalNumber 看看广告间隔数
     */
    public void setKankanAdIntervalNumber(String kankanAdIntervalNumber) {
        this.kankanAdIntervalNumber = kankanAdIntervalNumber;
    }

    /**
     * 获取开关：1-开启 2-关闭
     *
     * @return state - 开关：1-开启 2-关闭
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置开关：1-开启 2-关闭
     *
     * @param state 开关：1-开启 2-关闭
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取创建人
     *
     * @return create_man - 创建人
     */
    public String getCreateMan() {
        return createMan;
    }

    /**
     * 设置创建人
     *
     * @param createMan 创建人
     */
    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }

    /**
     * 获取修改人
     *
     * @return modify_man - 修改人
     */
    public String getModifyMan() {
        return modifyMan;
    }

    /**
     * 设置修改人
     *
     * @param modifyMan 修改人
     */
    public void setModifyMan(String modifyMan) {
        this.modifyMan = modifyMan;
    }

    /**
     * 获取作用范围：1-大于，2-大于等于，3-等于，4-小于，5-小于等于，6-不等于
     *
     * @return range_version - 作用范围：1-大于，2-大于等于，3-等于，4-小于，5-小于等于，6-不等于
     */
    public Integer getRangeVersion() {
        return rangeVersion;
    }

    /**
     * 设置作用范围：1-大于，2-大于等于，3-等于，4-小于，5-小于等于，6-不等于
     *
     * @param rangeVersion 作用范围：1-大于，2-大于等于，3-等于，4-小于，5-小于等于，6-不等于
     */
    public void setRangeVersion(Integer rangeVersion) {
        this.rangeVersion = rangeVersion;
    }

    /**
     * 获取应用id
     *
     * @return application_id - 应用id
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * 设置应用id
     *
     * @param applicationId 应用id
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * 获取客户端：0-Android、1-IOS
     *
     * @return os_version - 客户端：0-Android、1-IOS
     */
    public Integer getOsVersion() {
        return osVersion;
    }

    /**
     * 设置客户端：0-Android、1-IOS
     *
     * @param osVersion 客户端：0-Android、1-IOS
     */
    public void setOsVersion(Integer osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * 获取屏蔽版本号
     *
     * @return shield_version - 屏蔽版本号
     */
    public String getShieldVersion() {
        return shieldVersion;
    }

    /**
     * 设置屏蔽版本号
     *
     * @param shieldVersion 屏蔽版本号
     */
    public void setShieldVersion(String shieldVersion) {
        this.shieldVersion = shieldVersion;
    }

    /**
     * 获取屏蔽渠道号
     *
     * @return shield_channel - 屏蔽渠道号
     */
    public String getShieldChannel() {
        return shieldChannel;
    }

    /**
     * 设置屏蔽渠道号
     *
     * @param shieldChannel 屏蔽渠道号
     */
    public void setShieldChannel(String shieldChannel) {
        this.shieldChannel = shieldChannel;
    }
}