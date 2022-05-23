package com.webmister.semicolon.dto;

import com.webmister.semicolon.domain.Report;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EssentialReport {
    String title;
    String contents;
    String description;
    LocalDateTime dateCreated;
    LocalDateTime dateUpdated;

    public EssentialReport(Report report){
        this.title = report.getTitle();
        this.contents = report.getContents();
        this.dateCreated = report.getDateCreated();
        this.dateUpdated = report.getDateUpdated();
        this.description = null;
    }
}
