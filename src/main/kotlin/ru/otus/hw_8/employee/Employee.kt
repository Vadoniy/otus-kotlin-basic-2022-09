package ru.otus.hw_8.employee

import ru.otus.hw_8.unit.Department


class Employee(var position: String, override var name: String, override var surname: String) : Man() {

    lateinit var department: Department
    lateinit var idCard: IdCard
    private val roomSet: MutableSet<Room> = mutableSetOf()
    private val pastPositionSet: MutableSet<PastPosition> = mutableSetOf()

    fun deletePastPosition(pastPosition: PastPosition) {
        pastPositionSet.remove(pastPosition)
    }

    fun deleteRoom(room: Room) {
        roomSet.remove(room)
    }
}