package com.pluralsight.com.pluralsight.repository;

import com.pluralsight.com.pluralsight.model.Activity;

import java.util.List;

public interface ActivityRepository {
    List<Activity> findAllActivities();
}
