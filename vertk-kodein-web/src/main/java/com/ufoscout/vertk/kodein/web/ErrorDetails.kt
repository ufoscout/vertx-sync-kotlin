package com.ufoscout.vertk.kodein.web

data class ErrorDetails(
        val code: Int,
        val message: String,
        val details: Map<String, List<String>>) {
}
