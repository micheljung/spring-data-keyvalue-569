package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.data.keyvalue.annotation.KeySpace
import org.springframework.data.map.repository.config.EnableMapRepositories
import org.springframework.data.repository.CrudRepository
import java.net.URL

@SpringBootApplication
@EnableMapRepositories
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

interface WebsiteRepository : CrudRepository<Website, String>

@KeySpace("website")
data class Website(
    @Id
    val id: String,
    val url: URL,
)