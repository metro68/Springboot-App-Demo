@RestController
class ThisWillActuallyRun {

    @GetMapping("/")
    String home() {
        return "Hello, Worldy!"
    }

}