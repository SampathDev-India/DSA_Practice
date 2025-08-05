package DSA.program;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import DSA_Executor.App;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(OutputCaptureExtension.class)
public class AppTest {

	/**
	 * write the test case then -> runAs -> maven Build -> type clean verify . check the report 
	 * @param capture
	 * @throws Exception
	 */
    @Test
    void testHello(CapturedOutput capture) throws Exception {
        App.main(new String[]{});
        assertThat(capture.toString()).isEqualToIgnoringNewLines("Hello World!");
    }
}
