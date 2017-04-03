package steps

import cucumber.api.scala.{EN, ScalaDsl}
import org.slf4j.LoggerFactory;

class InQAExampleSteps extends ScalaDsl with EN {
  private val log = LoggerFactory.getLogger(classOf[InQAExampleSteps])

  Before { scenario =>
    log.info("Before...")
  }
  After { scenario =>
    log.info("...After")
  }

  Given("""^this pre condition$""") { () =>
    log.info("This pre-condition")
  }
  When("""^I do this$""") { () =>
    log.info("An action to perform")
  }
  Then("""^I can verify that$""") { () =>
    log.info("An assertion to check some output")
  }
  Then("""^I can also verify that$""") { () =>
    log.info("Another assertion")
  }
}
