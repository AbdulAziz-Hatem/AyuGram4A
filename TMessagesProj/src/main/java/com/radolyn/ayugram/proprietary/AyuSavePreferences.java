package com.radolyn.ayugram.proprietary;

import org.telegram.tgnet.TLRPC;

public class AyuSavePreferences {
    private long dialogId;
    private int accountId;
    private int messageId;
    private long userId;
    private int requestCatchTime;
    private TLRPC.Message message;

    public long getDialogId() { return dialogId; }
    public int getAccountId() { return accountId; }
    public int getMessageId() { return messageId; }
    public long getUserId() { return userId; }
    public int getRequestCatchTime() { return requestCatchTime; }
    public TLRPC.Message getMessage() { return message; }

    public void setDialogId(long dialogId) { this.dialogId = dialogId; }
    public void setAccountId(int accountId) { this.accountId = accountId; }
    public void setMessageId(int messageId) { this.messageId = messageId; }
    public void setUserId(long userId) { this.userId = userId; }
    public void setRequestCatchTime(int requestCatchTime) { this.requestCatchTime = requestCatchTime; }
    public void setMessage(TLRPC.Message message) { this.message = message; }
}
