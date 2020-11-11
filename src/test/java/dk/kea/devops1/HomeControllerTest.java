package dk.kea.devops1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {

    HomeController homeController = new HomeController();

    @BeforeEach
    void setUp() {
        System.out.println("Hello");
    }

    @Test
    void index() {
        String expected = "index";
        String actual = homeController.index();
        assertEquals(expected,actual);
    }
}