package com.github.rongxiong2016.ideaplugindemo.services

import com.github.rongxiong2016.ideaplugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
