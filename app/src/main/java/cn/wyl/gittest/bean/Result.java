package cn.wyl.gittest.bean;

/**
 * 项目名称：WelfareCenter
 * 创建人：wyl
 * 时间：2016/10/13 18:43
 */
public class Result {


    /**
     * retCode : 0
     * retMsg : true
     * retData : null
     */

    private int retCode;
    private boolean retMsg;
    private Object retData;

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    public boolean isRetMsg() {
        return retMsg;
    }

    public void setRetMsg(boolean retMsg) {
        this.retMsg = retMsg;
    }

    public Object getRetData() {
        return retData;
    }

    public void setRetData(Object retData) {
        this.retData = retData;
    }

    @Override
    public String toString() {
        return "Result{" +
                "retCode=" + retCode +
                ", retMsg=" + retMsg +
                ", retData=" + retData +
                '}';
    }
}
