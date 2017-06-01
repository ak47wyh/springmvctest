package y.h.w.vo.prod;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/23.
 */
public class Policy implements Serializable{

    private String policyNo;

    private String policyNm;
//  被保险人id
    private int insuredUserId;
//  客户id,保险购买人
    private int custUserId;
//    保险受益人
    private int beneUserId;

    private Date effectiveDate;

    private Date expiryDate;

    private int status;

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getPolicyNm() {
        return policyNm;
    }

    public void setPolicyNm(String policyNm) {
        this.policyNm = policyNm;
    }

    public int getInsuredUserId() {
        return insuredUserId;
    }

    public void setInsuredUserId(int insuredUserId) {
        this.insuredUserId = insuredUserId;
    }

    public int getCustUserId() {
        return custUserId;
    }

    public void setCustUserId(int custUserId) {
        this.custUserId = custUserId;
    }

    public int getBeneUserId() {
        return beneUserId;
    }

    public void setBeneUserId(int beneUserId) {
        this.beneUserId = beneUserId;
    }
}
