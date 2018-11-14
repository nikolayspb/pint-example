package test.hb.housekeeper.model;

public class SmsResponse {
    private String messageId;
    private int state;

    public SmsResponse() {}

    public SmsResponse(String messageId, int state) {
        this.messageId = messageId;
        this.state = state;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
