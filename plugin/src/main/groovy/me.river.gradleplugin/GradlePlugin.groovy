package me.river.gradleplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by River on 16/2/27.
 */
class GradlePlugin implements Plugin<Project> {

    @Override
    void apply(Project target){
        println('This is a Plugin Project')
    }
}