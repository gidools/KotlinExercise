package com.maxst.kotlinexercise

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.view.View
import java.lang.IndexOutOfBoundsException
import java.lang.reflect.Type
import java.time.LocalDate

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p = Person("Alice")
        p.emails
        p.emails
    }
}

class Email { }

fun loadEmails(person: Person): List<Email> {
    println("${person.name} 의 이메일을 가져옴")
    return listOf()
}

class Person(val name: String) {
    val emails by lazy { loadEmails(this)}
}
