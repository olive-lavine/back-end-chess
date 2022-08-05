package com.chess.backendchess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Opening {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String sequence;

//    public Opening(){}
//
//
//    public Opening(Long id, String name, String sequence) {
//        this.id = id;
//        this.name = name;
//        this.sequence = sequence;
//    }
}
