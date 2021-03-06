package com.ncu.appinfo.vo;

import com.ncu.appinfo.entity.Version;

import java.math.BigDecimal;

/**
 * AppVo
 *
 * @author wzzfarewell
 * @date 2019/8/7
 **/
public class AppVo {
    private Long appId;

    private String appName;

    private String apkName;

    private String supportRom;

    private BigDecimal appSize;

    private String firstCategory;

    private String secondCategory;

    private String thirdCategory;

    private String appStatus;

    private String appPlatform;

    private String publishStatus;

    private String logoPicPath;

    private Version version;

    private String appInfo;

    private String language;

    private Long devId;

    public AppVo() {
    }

    public AppVo(Long appId, String appName, String apkName, String supportRom, BigDecimal appSize, String firstCategory, String secondCategory, String thirdCategory, String appStatus, String appPlatform, String publishStatus, String logoPicPath, Version version, String appInfo, String language, Long devId) {
        this.appId = appId;
        this.appName = appName;
        this.apkName = apkName;
        this.supportRom = supportRom;
        this.appSize = appSize;
        this.firstCategory = firstCategory;
        this.secondCategory = secondCategory;
        this.thirdCategory = thirdCategory;
        this.appStatus = appStatus;
        this.appPlatform = appPlatform;
        this.publishStatus = publishStatus;
        this.logoPicPath = logoPicPath;
        this.version = version;
        this.appInfo = appInfo;
        this.language = language;
        this.devId = devId;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getApkName() {
        return apkName;
    }

    public void setApkName(String apkName) {
        this.apkName = apkName;
    }

    public String getSupportRom() {
        return supportRom;
    }

    public void setSupportRom(String supportRom) {
        this.supportRom = supportRom;
    }

    public BigDecimal getAppSize() {
        return appSize;
    }

    public void setAppSize(BigDecimal appSize) {
        this.appSize = appSize;
    }

    public String getFirstCategory() {
        return firstCategory;
    }

    public void setFirstCategory(String firstCategory) {
        this.firstCategory = firstCategory;
    }

    public String getSecondCategory() {
        return secondCategory;
    }

    public void setSecondCategory(String secondCategory) {
        this.secondCategory = secondCategory;
    }

    public String getThirdCategory() {
        return thirdCategory;
    }

    public void setThirdCategory(String thirdCategory) {
        this.thirdCategory = thirdCategory;
    }

    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    public String getAppPlatform() {
        return appPlatform;
    }

    public void setAppPlatform(String appPlatform) {
        this.appPlatform = appPlatform;
    }

    public String getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public String getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(String appInfo) {
        this.appInfo = appInfo;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Long getDevId() {
        return devId;
    }
    public void setDevId(Long devId) {
        this.devId = devId;
    }

    public String getLogoPicPath() {
        return logoPicPath;
    }

    public void setLogoPicPath(String logoPicPath) {
        this.logoPicPath = logoPicPath;
    }

    @Override
    public String toString() {
        return "AppVo{" +
                "appId=" + appId +
                ", appName='" + appName + '\'' +
                ", apkName='" + apkName + '\'' +
                ", appSize=" + appSize +
                ", firstCategory='" + firstCategory + '\'' +
                ", secondCategory='" + secondCategory + '\'' +
                ", thirdCategory='" + thirdCategory + '\'' +
                ", appStatus='" + appStatus + '\'' +
                ", appPlatform='" + appPlatform + '\'' +
                ", publishStatus='" + publishStatus + '\'' +
                ", version=" + version +
                '}';
    }
}
