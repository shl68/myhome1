package com.example.myhome1.repository;

import com.example.myhome1.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findByTitleOrContent(String title, String content);

}

