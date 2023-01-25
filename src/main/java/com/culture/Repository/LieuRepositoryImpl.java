package com.culture.Repository;

import com.culture.Entity.Lieu;
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
public class LieuRepositoryImpl implements LieuRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public LieuRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Page<Lieu> findByNomComContains(String kw, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Lieu> getAllLieu(Pageable pageable) {
        return null;
    }

    @Override
    public List<Lieu> findAll() {
        return null;
    }

    @Override
    public List<Lieu> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Lieu> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Lieu> findAllById(Iterable<String> strings) {
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
    public void delete(Lieu entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Lieu> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Lieu> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Lieu> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Lieu> findById(String s) {
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
    public <S extends Lieu> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Lieu> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Lieu> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Lieu getOne(String s) {
        return null;
    }

    @Override
    public Lieu getById(String s) {
        return null;
    }

    @Override
    public Lieu getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends Lieu> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Lieu> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Lieu> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Lieu> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Lieu> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Lieu> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Lieu, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    //implement all the methods defined in the LieuRepository interface
    //....
}