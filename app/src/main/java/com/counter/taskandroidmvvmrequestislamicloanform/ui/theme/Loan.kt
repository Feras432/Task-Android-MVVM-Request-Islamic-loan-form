package com.counter.taskandroidmvvmrequestislamicloanform.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.lifecycle.viewmodel.compose.viewModel
import com.counter.taskandroidmvvmrequestislamicloanform.model.LoanViewModel


@Composable
fun Loan(loanViewModel: LoanViewModel = viewModel(), loan: Int, months: Int){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Button(onClick = { loanViewModel.LoanCalculation(loanViewModel = LoanViewModel())}) {
            Text(text = "Calculate Loan")
        }
        TextField(value = loan.toString(), onValueChange = loanViewModel.loan_amount.toString())
        TextField(value = months.toString(), onValueChange = loanViewModel.period_in_months.toString())
    }

}