package dev.bloodstone.tests.configmetest

fun main(args: Array<String>) {
    println("Hello World!")
    val configManager = ConfigManager()
    val country = configManager.country
    println("Country name: ${country.name}")
    println("Country population: ${country.population}")
    println("Country leader.name: ${country.leader.name}")
    println("Country leader.sinceYear: ${country.leader.sinceYear}")
}