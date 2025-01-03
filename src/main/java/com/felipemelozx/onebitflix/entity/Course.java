package com.felipemelozx.onebitflix.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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

  @OneToMany(mappedBy = "course")
  private List<Episode> episodeList;

  @Column(
      name = "created_at",
      nullable = false)
  private Date createdAt;

  @Column(
      name = "updated_at",
      nullable = false)
  private Date updateAt;

  public Course(Integer id, String name, String synopsis, String thumbnailUrl, Boolean featured, Integer categoryId, Date createdAt, Date updateAt,List<Episode> episodeList ) {
    this.id = id;
    this.name = name;
    this.synopsis = synopsis;
    this.thumbnailUrl = thumbnailUrl;
    this.featured = featured;
    this.categoryId = categoryId;
    this.episodeList = episodeList;
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

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryID) {
    this.categoryId = categoryID;
  }

  public List<Episode> getEpisodeList() {
    return episodeList;
  }

  public void setEpisodeList(List<Episode> episodeList) {
    this.episodeList = episodeList;
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
