package com.app.movie.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import lombok.Data;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.springframework.data.neo4j.core.schema.Id;

import java.util.Collection;

@JsonIdentityInfo(generator = JSOGGenerator.class)
@RelationshipEntity(type = "ACTED_IN")
@Data
public class Role {
    @Id
    @GeneratedValue
    Long id;
    private Collection<String> roles;
    @StartNode
    private Person person;
    @EndNode
    private Movie movie;
}