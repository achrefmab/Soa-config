package com.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.Model.Section;


@Repository
public interface Sectionrepo extends JpaRepository<Section,Integer> {

} 