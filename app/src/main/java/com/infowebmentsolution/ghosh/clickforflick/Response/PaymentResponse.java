package com.infowebmentsolution.ghosh.clickforflick.Response;

public class PaymentResponse {

    private String result;
    private String msg;

    public PaymentResponse(String result, String msg) {
        this.result = result;
        this.msg = msg;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
