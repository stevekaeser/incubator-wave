package org.waveprotocol.wave.notification;

import java.util.List;

public interface NotificationRegisterStore {

  List<String> getSubscriptors(String waveId);

  void addSubscriptor(String waveId, String userId);

  void removeSubscriptor(String waveId, String userId);

}
