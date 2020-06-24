package dev.bloodstone.tests.configmetest

data class President(
    var name: String,
    var sinceYear: Int
)
data class Country(
    var name: String,
    var population: Int,
    var leader: President
)

