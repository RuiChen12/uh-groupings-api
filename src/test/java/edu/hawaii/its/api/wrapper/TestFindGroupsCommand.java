package edu.hawaii.its.api.wrapper;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import edu.hawaii.its.api.configuration.SpringBootWebApplication;

@ActiveProfiles("integrationTest")
@SpringBootTest(classes = { SpringBootWebApplication.class })
public class TestFindGroupsCommand {

    @Test
    public void execute() {
        assertThrows(RuntimeException.class, new FindGroupsCommand()::execute);
    }

    @Test
    public void self() {
        FindGroupsCommand findGroupsCommand = new FindGroupsCommand();
        assertEquals(findGroupsCommand, findGroupsCommand.self());
    }
}
