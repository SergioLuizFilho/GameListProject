package com.devsuperior.dslist.projections;

public interface GameMinProjection {
    Long getId();
    String getTitle();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
    Integer getGameYear();
}
