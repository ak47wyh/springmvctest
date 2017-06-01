package y.h.w.vo.claim;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/23.
 */
public class Apply implements Serializable{
//    id
    private int applyId;
//  申请日期
    private Date applyDate;
//  申请用户id
    private int applyUserId;
//  申请渠道
    private int applyChannl;
//   申请类型
    private int applyType;
//  申请内容
    private String applyText;

    public int getApplyType() {
        return applyType;
    }

    public void setApplyType(int applyType) {
        this.applyType = applyType;
    }

    public int getApplyId() {
        return applyId;
    }

    public void setApplyId(int applyId) {
        this.applyId = applyId;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public int getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(int applyUserId) {
        this.applyUserId = applyUserId;
    }

    public int getApplyChannl() {
        return applyChannl;
    }

    public void setApplyChannl(int applyChannl) {
        this.applyChannl = applyChannl;
    }

    public String getApplyText() {
        return applyText;
    }

    public void setApplyText(String applyText) {
        this.applyText = applyText;
    }
}
