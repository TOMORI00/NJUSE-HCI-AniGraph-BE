package cn.anigraph.vo;

public class ResponseVO {
    public Boolean getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public Object getContent() {
        return content;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    private Boolean success;

    private String message;

    private Object content;

    public static ResponseVO buildSuccess(){
        ResponseVO response=new ResponseVO();
        response.setSuccess(true);
        return response;
    }


    public static ResponseVO buildSuccess(Object content){
        ResponseVO response=new ResponseVO();
        response.setContent(content);
        response.setSuccess(true);
        return response;
    }

    public static ResponseVO buildFailure(String message){
        ResponseVO response=new ResponseVO();
        response.setSuccess(false);
        response.setMessage(message);
        return response;
    }

    public static ResponseVO buildFailure(Object content){
        ResponseVO response=new ResponseVO();
        response.setContent(content);
        response.setSuccess(false);
        return response;
    }

}
