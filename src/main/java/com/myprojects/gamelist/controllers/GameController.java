package com.myprojects.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myprojects.gamelist.dto.GameDTO;
import com.myprojects.gamelist.dto.GameMinDTO;
import com.myprojects.gamelist.services.GameService;

@RestController
@RequestMapping(value = "/games") // configura o caminho que vai ser respondido pela API
public class GameController {

  @Autowired /* Injeta o sevice na camada de controle */
  private GameService gameService;

  @GetMapping(value = "/{id}") /* Um get que vai receber um id como argumento na requisição */
  public GameDTO findById(@PathVariable Long id) { /* Anotação que recebe o id */
    GameDTO result = gameService.findById(id);
    return result;
  }

  @GetMapping
  public List<GameMinDTO> findAll() {
    List<GameMinDTO> result = gameService.findAll();
    return result;
  }

}
