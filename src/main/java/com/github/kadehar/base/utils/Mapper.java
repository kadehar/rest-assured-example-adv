package com.github.kadehar.base.utils;

public interface Mapper<T, R> {
    R toDomain(T t);
    T toRemote(R r);
}
