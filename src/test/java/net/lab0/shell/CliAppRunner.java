package net.lab0.shell;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CliAppRunner implements ApplicationRunner {
  public CliAppRunner() {

  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    //do nothing
  }
}
