package com.test

import org.gradle.api.Plugin
import org.gradle.api.Project

class BlogPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        def showDevicesTask = project.tasks.create("showDevices") << {
            println "println(\"(•_•) ( •_•)>⌐■-■ (⌐■_■)\")"
        }
        showDevicesTask.group = "blogplugin"
        showDevicesTask.description = "Deal with it!"
    }
}
