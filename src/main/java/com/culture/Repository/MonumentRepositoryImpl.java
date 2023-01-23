package com.culture.Repository;

import com.culture.Entity.Monument;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class MonumentRepositoryImpl implements MonumentRepository {
    @Override
    public Page<Monument> findByNomMContains(String kw, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Monument> getAllMonument(Pageable pageable) {
        return null;
    }

    @Override
    public List<Monument> findAll() {
        return null;
    }

    @Override
    public List<Monument> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Monument> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Monument> findAllById(Iterable<String> strings) {
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
    public void delete(Monument entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Monument> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Monument> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Monument> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Monument> findById(String s) {
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
    public <S extends Monument> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Monument> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Monument> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Monument getOne(String s) {
        return null;
    }

    @Override
    public Monument getById(String s) {
        return null;
    }

    @Override
    public Monument getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends Monument> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Monument> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Monument> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Monument> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Monument> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Monument> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Monument, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
    // implementation of the repository methods
}
