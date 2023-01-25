package com.culture.Repository;

import com.culture.Entity.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class DepartementRepositoryImpl implements DepartementRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DepartementRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Departement> getByNameDepartementContaining(String nom) {
        return null;
    }

    @Override
    public List<Departement> findAll() {
        return null;
    }

    @Override
    public List<Departement> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Departement> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Departement> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Departement entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Departement> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Departement> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Departement> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Departement> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Departement> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Departement> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Departement> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Departement getOne(String s) {
        return null;
    }

    @Override
    public Departement getById(String s) {
        return null;
    }

    @Override
    public Departement getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends Departement> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Departement> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Departement> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Departement> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Departement> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Departement> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Departement, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    //implement all the methods defined in the DepartementRepository interface
    //....
}