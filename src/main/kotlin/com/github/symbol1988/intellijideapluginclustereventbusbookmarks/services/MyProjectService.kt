package com.github.symbol1988.intellijideapluginclustereventbusbookmarks.services

import com.github.symbol1988.intellijideapluginclustereventbusbookmarks.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
