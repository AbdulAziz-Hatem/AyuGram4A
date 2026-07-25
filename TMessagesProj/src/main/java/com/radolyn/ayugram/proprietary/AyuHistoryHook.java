package com.radolyn.ayugram.proprietary;

import android.util.SparseArray;

import org.telegram.messenger.MessageObject;

import java.util.ArrayList;

public class AyuHistoryHook {

    public static int[] getMinAndMaxIds(ArrayList<MessageObject> messArr) {
        int minId = Integer.MAX_VALUE;
        int maxId = Integer.MIN_VALUE;
        for (MessageObject obj : messArr) {
            int id = obj.getId();
            if (id < minId) minId = id;
            if (id > maxId) maxId = id;
        }
        if (minId == Integer.MAX_VALUE) {
            return new int[]{0, 0};
        }
        return new int[]{minId, maxId};
    }

    public static void doHook(int currentAccount, ArrayList<MessageObject> messArr,
                               SparseArray<MessageObject>[] messagesDict,
                               int startId, int endId, long dialogId,
                               int limit, long topicId, boolean isSecretChat) {
        // Stub: no-op for open-source build
    }
}
