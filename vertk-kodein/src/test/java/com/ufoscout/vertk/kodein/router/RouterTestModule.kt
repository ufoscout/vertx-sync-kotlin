package com.ufoscout.vertk.kodein.router

import com.ufoscout.vertk.Vertk
import com.ufoscout.vertk.kodein.VertkKodeinModule
import com.ufoscout.vertk.kodein.deployKodeinVerticle
import io.vertx.core.Vertx
import org.kodein.di.Kodein

class RouterTestModule: VertkKodeinModule {

    override fun module() = Kodein.Module {}

    override suspend fun onInit(vertk: Vertk, kodein: Kodein) {
        vertk.deployKodeinVerticle<TestWebController>()
    }

}