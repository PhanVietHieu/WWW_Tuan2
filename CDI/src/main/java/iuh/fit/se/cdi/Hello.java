package iuh.fit.se.cdi;

import jakarta.inject.Inject;

public class Hello {
    @Inject
    private Word word;

    public String helloWorld() {
        return "Hello " + word.world();
    }
}
