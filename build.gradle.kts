// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
}
buildscript {

    dependencies {

        classpath ("io.realm:realm-gradle-plugin:10.17.0")
    }
}