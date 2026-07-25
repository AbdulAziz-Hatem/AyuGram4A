package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public class AccessibilityUtils {

    public static void makeButton(View view) {
        if (view != null) {
            view.setFocusable(true);
            view.setClickable(true);
            final View.AccessibilityDelegate existingDelegate = view.getAccessibilityDelegate();
            view.setAccessibilityDelegate(new View.AccessibilityDelegate() {
                @Override
                public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                    if (existingDelegate != null) {
                        existingDelegate.onInitializeAccessibilityNodeInfo(host, info);
                    } else {
                        super.onInitializeAccessibilityNodeInfo(host, info);
                    }
                    info.setClassName(Button.class.getName());
                    info.setClickable(true);
                    info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
                }

                @Override
                public boolean performAccessibilityAction(View host, int action, android.os.Bundle args) {
                    if (existingDelegate != null) {
                        return existingDelegate.performAccessibilityAction(host, action, args);
                    }
                    return super.performAccessibilityAction(host, action, args);
                }
            });
        }
    }
}
