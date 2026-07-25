# Changelog

## v1.0.0 (Unreleased)

### Accessibility (a11y) Improvements
- New `AccessibilityUtils` helper class (`AccessibilityUtils.makeButton()`) for consistent TalkBack support
- Fixed ActionBarMenuSubItem — proper Button class name, ACTION_CLICK, contentDescription
- Fixed ChatActivityEnterView — emoji, notify, attach, send, audio buttons now accessible
- Fixed ProfileActivity — horizontal action bar buttons (call, video call, edit, more)
- Fixed DialogCell — chat title + last message as contentDescription
- Fixed AlertDialog — positive/negative/neutral buttons
- Fixed BottomSheet — BottomSheetCell
- Fixed PhotoViewer — fullscreen, send, crop, rotate, mirror, paint, mute, camera, tune, compress, time, play, exit controls
- Fixed Settings cells — TextSettingsCell, TextCheckCell, NotificationsCheckCell

### Previous
- Fixed ActionBarMenuItem accessibility (TalkBack focus, contentDescription, ACTION_CLICK)
