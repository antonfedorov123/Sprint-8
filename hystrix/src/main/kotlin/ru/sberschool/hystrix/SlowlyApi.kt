package ru.sberschool.hystrix

import feign.RequestLine

interface SlowlyApi {
    @RequestLine("GET /pokemon/{name}")
    fun getPokemon(name: String): Pokemon
}


