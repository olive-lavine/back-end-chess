package com.chess.backendchess.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @Column(name="player_id")
    private Long player_id;
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "player")
    private Set<CustomOpening> customOpenings;
}
