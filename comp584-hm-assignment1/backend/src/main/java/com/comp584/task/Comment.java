package com.comp584.task;

import java.util.List;
import org.springframework.web.bind.*;

public class Comment {
    private Long Id;
    private String task_comment;
    private Long task_id;

    private Task task;
}
