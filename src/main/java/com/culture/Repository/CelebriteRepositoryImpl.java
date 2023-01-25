package com.culture.Repository;

import com.culture.Entity.Celebrite;
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
public class CelebriteRepositoryImpl implements CelebriteRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CelebriteRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Celebrite> getByNameContaining(String nom) {
        return null;
    }

    @Override
    public Celebrite getCelebriteById(long numCelebrite) {
        return null;
    }

    @Override
    public List<Celebrite> findAll() {
        return null;
    }

    @Override
    public List<Celebrite> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Celebrite> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Celebrite> findAllById(Iterable<String> strings) {
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
    public void delete(Celebrite entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Celebrite> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Celebrite> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Celebrite> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Celebrite> findById(String s) {
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
    public <S extends Celebrite> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Celebrite> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Celebrite> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Celebrite getOne(String s) {
        return null;
    }

    @Override
    public Celebrite getById(String s) {
        return null;
    }

    @Override
    public Celebrite getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends Celebrite> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Celebrite> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Celebrite> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Celebrite> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Celebrite> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Celebrite> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Celebrite, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    //implement all the methods defined in the CelebriteRepository interface
    //....
}