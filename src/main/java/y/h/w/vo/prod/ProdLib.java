package y.h.w.vo.prod;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/23.
 */
public class ProdLib implements Serializable{

    private int libId;

    private String libNm;

    private Date effectiveDate;

    private Date expiryDate;

    private int status;

    public int getLibId() {
        return libId;
    }

    public void setLibId(int libId) {
        this.libId = libId;
    }

    public String getLibNm() {
        return libNm;
    }

    public void setLibNm(String libNm) {
        this.libNm = libNm;
    }

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
}
