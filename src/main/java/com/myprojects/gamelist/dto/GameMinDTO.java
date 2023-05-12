package com.myprojects.gamelist.dto;

import com.myprojects.gamelist.entites.Game;

/*Classe que serve para transferencia de dados selecionados, nesse caso só ira ser exibido na tela da consulta os campos que estão nessa classe, e não todos da classe Game */
public class GameMinDTO {

  private Long id;
  private String title;
  private Integer year;
  private String imgUrl;
  private String shortDescription;

  public GameMinDTO() {
  }

  // Construtor que recebe os dados da entidade Game
  public GameMinDTO(Game entity) {
    id = entity.getId();
    title = entity.getTitle();
    year = entity.getYear();
    imgUrl = entity.getImgUrl();
    shortDescription = entity.getShortDescription();
  }

  // Construção dos Getters, pois a classe DTO não precisa dos Setters
  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public Integer getYear() {
    return year;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public String getShortDescription() {
    return shortDescription;
  }

}
