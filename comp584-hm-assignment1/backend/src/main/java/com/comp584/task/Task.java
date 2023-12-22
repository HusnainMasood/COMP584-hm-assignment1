package com.comp584.task;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Indexed;

import jakarta.annotation.Generated;

public class Task {

    private Long Id;
    private String name;
    private String description;
    private int sort_field;

    private List<Comment> comments = new ArrayList<>();
}
