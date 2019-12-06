package com.pluralsight;


import com.pluralsight.com.pluralsight.model.Activity;
import com.pluralsight.com.pluralsight.repository.ActivityRepository;
import com.pluralsight.com.pluralsight.repository.ActivityRepositoryStub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("activities")
public class ActivityResource {

    private ActivityRepository activityRepository = new ActivityRepositoryStub();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Activity> getAllActivities() {
        return activityRepository.findAllActivities();
    }
}


