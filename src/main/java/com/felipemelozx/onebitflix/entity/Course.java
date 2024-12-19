package com.felipemelozx.onebitflix.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Course {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String synopsis;

  @Column(name = "thumbnail_url")
  private String thumbnailUrl;

  @Column(nullable = false)
  private Boolean featured;

  @Column(
      nullable = false,
      name = "category_id")
  private Integer categoryId;

  @Column(
      name = "created_at",
      nullable = false)
  private Date createdAt;

  @Column(
      name = "updated_at",
      nullable = false)
  private Date updateAt;

  public Course(Integer id, String name, String synopsis, String thumbnailUrl, Boolean featured, Integer categoryId, Date createdAt, Date updateAt) {
    this.id = id;
    this.name = name;
    this.synopsis = synopsis;
    this.thumbnailUrl = thumbnailUrl;
    this.featured = featured;
    this.categoryId = categoryId;
    this.createdAt = createdAt;
    this.updateAt = updateAt;
  }

  public Course() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSynopsis() {
    return synopsis;
  }

  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }

  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  public Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public Integer getCategoryID() {
    return categoryId;
  }

  public void setCategoryID(Integer categoryID) {
    this.categoryId = categoryID;
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
