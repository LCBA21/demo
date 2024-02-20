package com.algoExpert.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int task_id;
    private String title;
    private String description;
    private  String Owner;
    private String start_date;
    private String end_date;
    private String status;
    private String priority;
    private String comment;
    private List<Integer> col_width;


    public Task() {
    }


    public Task(String title, String description,
                String owner, String start_date, String end_date,
                String status, String priority, String comment,
                List<Integer> col_width) {
        this.title = title;
        this.description = description;
        Owner = owner;
        this.start_date = start_date;
        this.end_date = end_date;
        this.status = status;
        this.priority = priority;
        this.comment = comment;
        this.col_width = col_width;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Integer> getCol_width() {
        return col_width;
    }

    public void setCol_width(List<Integer> col_width) {
        this.col_width = col_width;
    }
}
