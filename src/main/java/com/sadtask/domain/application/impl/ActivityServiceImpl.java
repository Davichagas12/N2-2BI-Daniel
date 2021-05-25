package com.sadtask.domain.application.impl;

import com.sadtask.domain.application.ActivityService;
import com.sadtask.domain.model.activity.Activity;
import com.sadtask.domain.model.activity.ActivityRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ActivityServiceImpl implements ActivityService {

  private ActivityRepository activityRepository;

  public ActivityServiceImpl(ActivityRepository activityRepository) {
    this.activityRepository = activityRepository;
  }

  @Override
  public void saveActivity(Activity activity) {
    activityRepository.save(activity);
  }
}
