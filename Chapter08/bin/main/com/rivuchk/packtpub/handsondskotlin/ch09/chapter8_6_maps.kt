package com.rivuchk.packtpub.handsondskotlin.ch09

fun main(args: Array<String>) {
    val map = mapOf(
            "Key One".to(1.0f),
            "Key Two".to(2.0f),
            "Key Three".to(3.0f),
            "Key Four".to(4.0f),
            "Key Five".to(0.0f),//(1) We placed 0 instead of 5 here, will be replaced later
            "Key Six".to(6.0f),
            "Key Five".to(5.0f)//(2) This will replace earlier map of "Five".to(0)
            )

    println("The value at Key `Key Four` is ${map["Key Four"]}")

    println("Contents in map")
    for(entry in map) {
        println("Key ${entry.key}, Value ${entry.value}")
    }

    val mutableMap = map.toMutableMap()

    println("Replacing value at key - `Key Five` - ${mutableMap.put("Key Five",5.0f)}")//(3)

    println("Contents in mutableMap")
    for(entry in mutableMap) {
        println("Key ${entry.key}, Value ${entry.value}")
    }
}