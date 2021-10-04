package com.example.android_unittests_hilt_viewmodels



import com.google.common.truth.Truth.assertThat
import org.junit.Test

class TaxTest {

    @Test
    fun calculateTax() {
        val tax = Tax()
        val netTax = tax.calculateTax(100.0,0.1)
        assertThat(netTax).isEqualTo(10)
    }

    @Test
    fun calculateIncome() {
    }
}