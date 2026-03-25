package com.fitness.activityservice.model;

import com.sun.source.doctree.IndexTree;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Map;

public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String userId;
    private ActivityType activity;
    private Integer duration;
    private Integer caloriesBurned;


    @CreationTimestamp
    private LocalDateTime startTime;

    private Map<String, Object> additionalMetrics;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
