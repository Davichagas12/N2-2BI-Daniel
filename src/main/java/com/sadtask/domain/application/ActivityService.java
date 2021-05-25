package com.sadtask.domain.application;

import com.sadtask.domain.model.activity.Activity;

public interface ActivityService {

  /**
   * Save an activity
   *
   * @param activity the activity instance
   */
  void saveActivity(Activity activity);
}
