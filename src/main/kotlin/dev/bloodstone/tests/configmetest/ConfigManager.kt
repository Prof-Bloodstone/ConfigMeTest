package dev.bloodstone.tests.configmetest

import ch.jalu.configme.SettingsManagerBuilder
import java.io.File

class ConfigManager {
    private val settingsManager = SettingsManagerBuilder
        .withYamlFile(File("/tmp/config.yml"))
        .configurationData(NestedBeanClassTest::class.java)
        .useDefaultMigrationService()
        .create()

    val country: Country
        get() = settingsManager.getProperty(NestedBeanClassTest.COUNTRY)
}