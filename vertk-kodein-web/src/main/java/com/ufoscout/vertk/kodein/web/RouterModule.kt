package com.ufoscout.vertk.kodein.web

import com.ufoscout.vertk.kodein.VertkKodeinModule
import io.vertx.core.Vertx
import io.vertx.core.http.HttpServerOptions
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

class RouterModule(val routerConfig: RouterConfig, val httpServerOptions: HttpServerOptions): VertkKodeinModule {

    override fun module() = Kodein.Module {
            bind<RouterSetup>() with singleton { RouterSetup(instance()) }
            bind<RouterConfig>() with singleton { routerConfig }
            bind<WebExceptionService>() with singleton { WebExceptionServiceImpl() }
            bind<RouterService>() with singleton { RouterServiceImpl(instance(), httpServerOptions, instance(), instance()) }
    }

    override suspend fun onInit(vertx: Vertx, kodein: Kodein) {
    }

}
