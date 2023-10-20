package org.jetbrains.bazel.ui.balloon

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import org.jetbrains.bazel.assets.BazelPluginIcons

public class BazelBspBalloonNotification(
  content: String,
  contentType: NotificationType = NotificationType.INFORMATION,
): Notification("Bazel BSP", content, contentType) {
  init {
    setIcon(BazelPluginIcons.bazelIcon)
  }
}
