package com.myprojects.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myprojects.gamelist.dto.GameDTO;
import com.myprojects.gamelist.dto.GameMinDTO;
import com.myprojects.gamelist.entites.Game;
import com.myprojects.gamelist.repositories.GameRepository;

@Service // ou @Component são anotações importantes para registrar um componente
public class GameService {

  @Autowired /* Injeta o service na camada de repositorio */
  private GameRepository gameRepository;

  /* Metodo que pega o game no banco de dados e converte para GameDTO */
  @Transactional(readOnly = true) /*
                                   * Anotação para garantir que a operação com o banco de dados vai acontecer
                                   * obedecendo ao principio das transações
                                   */
  public GameDTO findById(Long id) {
    Game result = gameRepository.findById(id).get();
    return new GameDTO(result);
  }

  /* Metodo para retornar os dados DTO */
  @Transactional(readOnly = true)
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
