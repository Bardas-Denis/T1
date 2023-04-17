package com.example.t1.models

enum class Type(val key: Int) {
    EUROPA(0),
    AFRICA(1),
    ASIA(2),
    AMERICA(3),
    AUSTRALIA(4)
}
open class Fauna (val type: Type)