package divinedragon.io.marketsprobe.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

const val ROOT = "/api/indicators";

@RestController
@RequestMapping(ROOT)
class IndicatorsController {

    @GetMapping("")
    fun getIndicator() = "Hello World!!!";
}
