package dev.bloodstone.tests.configmetest

import ch.jalu.configme.SettingsHolder
import ch.jalu.configme.properties.Property
import ch.jalu.configme.properties.PropertyInitializer.newBeanProperty

class NestedBeanClassTest : SettingsHolder {
    companion object {
        @JvmField
        val COUNTRY: Property<Country> = newBeanProperty(
            Country::class.java, "country",
            Country(
                name = "Latvia",
                population = 1957000,
                leader = President(
                    name = "Raimonds Vējonis",
                    sinceYear = 2015
                )
            )
        )
    }
}