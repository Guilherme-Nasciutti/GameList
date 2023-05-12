package com.myprojects.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprojects.gamelist.dto.GameMinDTO;
import com.myprojects.gamelist.entites.Game;
import com.myprojects.gamelist.repositories.GameRepository;

@Service // ou @Component são anotações importantes para registrar um componente
public class GameService {

  @Autowired /* Injeta o service na camada de repositorio */
  private GameRepository gameRepository;

  /* Metodo para retornar os dados DTO */
  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll();

    /*
     * Metodo que vai retornar e transformar um objeto Game, em um GameMinDTO
     * passando X como
     * argumento
     */
    return result.stream().map(x -> new GameMinDTO(x)).toList();
  }

}
