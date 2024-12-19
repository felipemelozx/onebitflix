package com.felipemelozx.onebitflix.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Class {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false)
  private String synopsis;

  @Column(nullable = false)
  private Integer order;

  @Column(
      nullable = false,
      name = "video_url")
  private String videoUrl;
  @Column(
      nullable = false,
      name = "seconds_long")
  private Integer secondsLong;
  @Column(
      nullable = false,
      name = "course_id")
  private Integer courseId;

  @Column(
      name = "created_at",
      nullable = false)
  private Date createdAt;

  @Column(
      name = "updated_at",
      nullable = false)
  private Date updateAt;

  public Class(Long id, String title, String synopsis, Integer order, String videoUrl, Integer secondsLong, Integer courseId, Date createdAt, Date updateAt) {
    this.id = id;
    this.title = title;
    this.synopsis = synopsis;
    this.order = order;
    this.videoUrl = videoUrl;
    this.secondsLong = secondsLong;
    this.courseId = courseId;
    this.createdAt = createdAt;
    this.updateAt = updateAt;
  }

  public Class() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSynopsis() {
    return synopsis;
  }

  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }

  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public Integer getSecondsLong() {
    return secondsLong;
  }

  public void setSecondsLong(Integer secondsLong) {
    this.secondsLong = secondsLong;
  }

  public Integer getCourseId() {
    return courseId;
  }

  public void setCourseId(Integer courseId) {
    this.courseId = courseId;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Date updateAt) {
    this.updateAt = updateAt;
  }
}
