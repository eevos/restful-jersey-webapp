package com.pluralsight.com.pluralsight.repository;

import com.pluralsight.com.pluralsight.model.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityRepositoryStub implements ActivityRepository {

    @Override
    public List<Activity> findAllActivities() {
        List<Activity> activities = new ArrayList<Activity>();

        Activity activit1 = new Activity();

        activit1.setDescription("Je me baigne");
        activit1.setDuration(55);

        activities.add(activit1);

        Activity activity2 = new Activity();

        activity2.setDescription("Je fais du vélo");
        activity2.setDuration(120);

        activities.add(activity2);

        return activities;
    }

}
