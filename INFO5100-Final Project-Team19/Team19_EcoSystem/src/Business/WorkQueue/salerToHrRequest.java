/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author jumin
 */
public class salerToHrRequest extends WorkRequest{
    private String Remark;
    private String HrResult;
    
    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public String getHrResult() {
        return HrResult;
    }

    public void setHrResult(String HrResult) {
        this.HrResult = HrResult;
    }
    
}
