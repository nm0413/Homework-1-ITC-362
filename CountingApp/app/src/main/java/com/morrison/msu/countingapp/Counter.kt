package com.morrison.msu.countingapp

class Counter {
    private var count: Int = 0

    fun addCount() {
        count++
    }

    fun getCount(): Int {
        return count
    }

}