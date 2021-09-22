package com.github.loganwlv.cypresscucumberintellij.services

import com.intellij.openapi.project.Project
import com.github.loganwlv.cypresscucumberintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
