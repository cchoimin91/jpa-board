package com.cm.jpaboard.board1.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "board") // 테이블과 1:1로 매칭되는 객체 단위
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long seq;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @Column(name="writer_name")
    private String writerName;

    @Column(name="password")
    private String password;

    @Column(name="reg_dt")
    private LocalDateTime regDt;

    @Column(name="upd_dt")
    private LocalDateTime updDt;

}
