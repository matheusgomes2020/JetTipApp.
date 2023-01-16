package com.cursoandroid.jettipapp2.util

fun calculateTotalTip(totalBill: Double,
                      tippercentage: Int): Double {

    return if ( totalBill > 1 &&
        totalBill.toString().isNotEmpty())

        ( totalBill * tippercentage ) / 100 else 0.0

}

fun calculateTotalPerPerson(
    totalBill: Double,
    splitBy: Int,
    tipPercentage: Int): Double {

    val bill = calculateTotalTip( totalBill = totalBill,
                                    tippercentage = tipPercentage) + totalBill

    return ( bill / splitBy )

}