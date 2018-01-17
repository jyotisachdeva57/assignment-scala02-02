package edu.knoldus

import org.apache.log4j.Logger

object MenuLauncher {
  def main(args: Array[String]): Unit = {
    val log = Logger.getLogger(this.getClass) //in code

    val obj = new Payment
    log.info("for free charge 2% of 100")
    val value = 100
    log.info(obj.compute(value, "free charge"))
    val gameObj = Gamer()
    log.info("\n")
    log.info(gameObj.rolladie(1))
    val InitialMap = Map("Scala" -> 0, "Java" -> 0, "Kafka" -> 0)
    val obj1 = Blogger(InitialMap)
    log.info("Initial Map is\n")
    log.info(InitialMap)
    log.info("\nMaximum blogs are for")
    log.info(obj1.call(InitialMap))
    val obj2 = Trainer()
    log.info("Present Trainee out of 50 is")
    log.info(obj2.attendence)
  }
}
