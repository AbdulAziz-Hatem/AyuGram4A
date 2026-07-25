package com.radolyn.ayugram.proprietary;

import com.radolyn.ayugram.database.entities.EditedMessage;
import org.telegram.tgnet.TLRPC;

public class AyuMessageUtils {

    public static void map(AyuSavePreferences prefs, EditedMessage revision) {
        revision.userId = prefs.getUserId();
        revision.dialogId = prefs.getDialogId();
        revision.messageId = prefs.getMessageId();
        revision.entityCreateDate = prefs.getRequestCatchTime();
        if (prefs.getMessage() != null) {
            revision.date = prefs.getMessage().date;
            revision.text = prefs.getMessage().message;
        }
    }

    public static void mapMedia(AyuSavePreferences prefs, EditedMessage revision, boolean copyMedia) {
        if (copyMedia && prefs.getMessage() != null && prefs.getMessage().media != null) {
            if (prefs.getMessage().media.photo != null) {
                revision.documentType = com.radolyn.ayugram.AyuConstants.DOCUMENT_TYPE_PHOTO;
            } else if (prefs.getMessage().media.document != null) {
                revision.documentType = com.radolyn.ayugram.AyuConstants.DOCUMENT_TYPE_FILE;
                revision.mimeType = prefs.getMessage().media.document.mime_type;
            }
        }
    }

    public static void map(EditedMessage editedMessage, TLRPC.TL_message msg, int currentAccount) {
        msg.id = editedMessage.messageId;
        msg.date = editedMessage.date;
        msg.message = editedMessage.text != null ? editedMessage.text : "";
    }

    public static void mapMedia(EditedMessage editedMessage, TLRPC.TL_message msg) {
        if (editedMessage.documentType == com.radolyn.ayugram.AyuConstants.DOCUMENT_TYPE_PHOTO) {
            msg.media = new TLRPC.TL_messageMediaPhoto();
        } else if (editedMessage.documentType == com.radolyn.ayugram.AyuConstants.DOCUMENT_TYPE_FILE) {
            msg.media = new TLRPC.TL_messageMediaDocument();
        }
    }
}
