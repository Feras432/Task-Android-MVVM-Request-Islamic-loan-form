package com.counter.taskandroidmvvmrequestislamicloanform.model

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import java.math.BigDecimal

class LoanViewModel: ViewModel(){
    var loan_amount = mutableStateOf(6000.0)
    var period_in_months = mutableStateOf(24)


    fun LoanCalculation(loanViewModel: LoanViewModel){
        var monthly_installment = mutableStateOf(1)
        monthly_installment = loan_amount.value / period_in_months.value
    }
}