package top.garret.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.garret.entity.Transcript;

import java.util.List;

@SpringBootTest
public class SystemServiceTest {
    @Autowired
    private SystemService systemService;

    @Test
    void Test() {
        List<Transcript> transcripts = systemService.listTranscripts(3);
        for (Transcript transcript : transcripts)
            System.out.println(transcript);
    }
}
