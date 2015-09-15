/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.london.mynotes.transformer;

import java.util.List;

/**
 *
 * @author adrián
 * @param <E> Entity
 */

public interface Transformer<E,T> {
    
    public E dtoToEntity(T dto);
    public T entityToDto(E entity);
    public List<E> dtoListToEntityList(List<T> dtoList);
    public List<T> entityListToDtoList(List<E> entityList);    
}