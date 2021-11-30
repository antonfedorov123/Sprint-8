package ru.sberschool.hystrix

class FallbackSlowlyApi : SlowlyApi {

    override fun getPokemon(name: String) = Pokemon(name = name)

}


