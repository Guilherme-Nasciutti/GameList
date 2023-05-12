package com.myprojects.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.gamelist.entites.Game;

/*Componente que vai fazer o acesso aos dados e fazer consulta,inserir,atualizar e deletar com acesso ao banco de dados */
public interface GameRepository extends JpaRepository<Game, Long> {

}
