package com.example.android_unittests_hilt_viewmodels

class Tax {

    fun calculateTax( grossIncome : Double , taxRate : Double) : Double{
        return grossIncome * taxRate
    }

    fun calculateIncome( grossIncome : Double , taxRate : Double ) : Double{
        return grossIncome - ( grossIncome * taxRate)
    }
}