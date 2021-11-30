package com.github.garrett12138.intellijplugindemo.services

import com.intellij.openapi.project.Project
import com.github.garrett12138.intellijplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
