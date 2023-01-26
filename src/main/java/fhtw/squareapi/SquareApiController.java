package fhtw.squareapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareApiController {

    @GetMapping("api/square")
    public int square(int n) {
        return n * n;
    }

    @GetMapping("api/number")
    public int getNumber(int n) {
        return n;
    }
}
