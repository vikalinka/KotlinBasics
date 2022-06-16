package com.example.kotlinbasics.oop

fun main() {

    val myDebitCard = BankCard.DebitCard()
    myDebitCard.addMoney(900.00)

    val myCreditCar = BankCard.CreditCard()

    // credit = 500.0

    myCreditCar.addMoney(400.0) // balance = 0.0 credit = 100.0

    myCreditCar.addMoney(300.0) // balance = 200.0 credit = 0.0

    val success = myCreditCar.pay(600.0)
    if (success) {
        println("Credit card rules!")
    } else {
        println("Oops!.. Credit limit reached. Operation failed! ")
    }

    CardInfo.info(myCreditCar, myDebitCard)
}

sealed class BankCard {
    class CreditCard : BankCard() {
        var credit: Double = CREDIT_LIMIT

        override var balance: Double = 0.0

        override fun addMoney(value: Double) {
            if (credit > 0) {
                balance = value - credit
                if (balance > 0) {
                    credit = 0.0
                } else {
                    balance = 0.0
                    credit -= value
                }
            } else {
                balance += value
            }
        }

        override fun balanceInfo() = balance

        override fun pay(value: Double): Boolean {
            val success: Boolean
            if (balance < value) {
                val shortage = value - balance
                if (CREDIT_LIMIT >= shortage) {
                    balance = 0.0
                    credit = shortage
                    success = true
                } else {
                    success = false
                }
            } else {
                balance -= value
                success = true
            }
            return success
        }

        private companion object {
            const val CREDIT_LIMIT = 500.0
        }
    }

    class DebitCard : BankCard() {
        override var balance: Double = 0.0

        override fun addMoney(value: Double) {
            balance += value
        }

        override fun balanceInfo() = balance

        override fun pay(value: Double): Boolean {
            val success: Boolean
            if (value <= balance) {
                balance -= value
                success = true
            } else {
                success = false
            }
            return success
        }
    }

    abstract var balance: Double

    abstract fun addMoney(value: Double)

    abstract fun balanceInfo(): Double

    abstract fun pay(value: Double): Boolean
}

object CardInfo {
    fun info(vararg cards: BankCard) {
        val info = cards.joinToString(
            separator = "\n"
        ) { card ->
            when (card) {
                is BankCard.DebitCard -> {
                    "${card.javaClass.simpleName}: balance = ${card.balanceInfo()}."
                }
                is BankCard.CreditCard -> {
                    "${card.javaClass.simpleName}: balance = ${card.balanceInfo()}, credit = ${card.credit}."
                }
            }
        }
        println(info)
    }
}
