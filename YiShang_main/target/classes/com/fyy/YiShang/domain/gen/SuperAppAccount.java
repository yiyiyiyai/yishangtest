package com.fyy.YiShang.domain.gen;

import com.fyy.YiShang.vo.AccountVo;
import com.fyy.YiShang.vo.ApiVo;

import java.io.Serializable;
import java.util.Date;

public class SuperAppAccount implements Serializable {
    private Integer id;

    private Long amount;

    private String bmPhone;

    private String contact;

    private Date createTime;

    private String delFlag;

    private String email;

    private String nickname;

    private String password;

    private String phone;

    private Long smsAmount;

    private String status;

    private Date updateTime;

    private String username;

    private Long warningAmount;

    private String warningAmountNotify;

    private Long warningSmsAmount;

    private String warningSmsNotify;

    private ApiVo api;

    private AccountVo account;

    public ApiVo getApi() {
        return api;
    }

    public void setApi(ApiVo api) {
        this.api = api;
    }

    public AccountVo getAccount() {
        return account;
    }

    public void setAccount(AccountVo account) {
        this.account = account;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getBmPhone() {
        return bmPhone;
    }

    public void setBmPhone(String bmPhone) {
        this.bmPhone = bmPhone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getSmsAmount() {
        return smsAmount;
    }

    public void setSmsAmount(Long smsAmount) {
        this.smsAmount = smsAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getWarningAmount() {
        return warningAmount;
    }

    public void setWarningAmount(Long warningAmount) {
        this.warningAmount = warningAmount;
    }

    public String getWarningAmountNotify() {
        return warningAmountNotify;
    }

    public void setWarningAmountNotify(String warningAmountNotify) {
        this.warningAmountNotify = warningAmountNotify;
    }

    public Long getWarningSmsAmount() {
        return warningSmsAmount;
    }

    public void setWarningSmsAmount(Long warningSmsAmount) {
        this.warningSmsAmount = warningSmsAmount;
    }

    public String getWarningSmsNotify() {
        return warningSmsNotify;
    }

    public void setWarningSmsNotify(String warningSmsNotify) {
        this.warningSmsNotify = warningSmsNotify;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", amount=").append(amount);
        sb.append(", bmPhone=").append(bmPhone);
        sb.append(", contact=").append(contact);
        sb.append(", createTime=").append(createTime);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", email=").append(email);
        sb.append(", nickname=").append(nickname);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", smsAmount=").append(smsAmount);
        sb.append(", status=").append(status);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", username=").append(username);
        sb.append(", warningAmount=").append(warningAmount);
        sb.append(", warningAmountNotify=").append(warningAmountNotify);
        sb.append(", warningSmsAmount=").append(warningSmsAmount);
        sb.append(", warningSmsNotify=").append(warningSmsNotify);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SuperAppAccount other = (SuperAppAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getBmPhone() == null ? other.getBmPhone() == null : this.getBmPhone().equals(other.getBmPhone()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getSmsAmount() == null ? other.getSmsAmount() == null : this.getSmsAmount().equals(other.getSmsAmount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getWarningAmount() == null ? other.getWarningAmount() == null : this.getWarningAmount().equals(other.getWarningAmount()))
            && (this.getWarningAmountNotify() == null ? other.getWarningAmountNotify() == null : this.getWarningAmountNotify().equals(other.getWarningAmountNotify()))
            && (this.getWarningSmsAmount() == null ? other.getWarningSmsAmount() == null : this.getWarningSmsAmount().equals(other.getWarningSmsAmount()))
            && (this.getWarningSmsNotify() == null ? other.getWarningSmsNotify() == null : this.getWarningSmsNotify().equals(other.getWarningSmsNotify()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getBmPhone() == null) ? 0 : getBmPhone().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getSmsAmount() == null) ? 0 : getSmsAmount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getWarningAmount() == null) ? 0 : getWarningAmount().hashCode());
        result = prime * result + ((getWarningAmountNotify() == null) ? 0 : getWarningAmountNotify().hashCode());
        result = prime * result + ((getWarningSmsAmount() == null) ? 0 : getWarningSmsAmount().hashCode());
        result = prime * result + ((getWarningSmsNotify() == null) ? 0 : getWarningSmsNotify().hashCode());
        return result;
    }
}