package divinedragon.io.marketsprobe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class MarketsProbeApplication

fun main(args: Array<String>) {
    runApplication<MarketsProbeApplication>(*args)
}
