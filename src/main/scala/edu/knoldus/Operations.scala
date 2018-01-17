package edu.knoldus

sealed abstract class Person {

}

case class Gamer() extends Person {
  def rolladie(count: Int): String = {
    val rand = new scala.util.Random
    val random = 1 + rand.nextInt((6 - 1) + 1)

    if (random == 1 || random == 6) {
      rolladie(count + 1)
    }
    else if ((random == 1 || random == 6) && count == 3) {
      "Gamer is a winner"
    }
    else {
      "Gamer is a looser"
    }
  }
}

case class Trainer() extends Person {
  def attendence: String = {
    val rand = new scala.util.Random
    val random = 1 + rand.nextInt((50 - 1) + 1)
    s"present trainee is $random"
  }
}

case class Blogger(blogList: Map[String, Int]) extends Person {
  def generateRandom(upper: Int, lower: Int): Int = {
    val rand = new scala.util.Random
    val random = lower + rand.nextInt((upper - lower) + 1)
    random
  }
  def call(blogList:Map[String,Int]): String = {
    val list = List("java", "scala", "kafka","java")
    val num = generateRandom(3, 0)
    val ans = update(list(num), blogList)

    val num1 = generateRandom(3, 0)
    val ans1 = update(list(num1), ans)

    val num2 = generateRandom(3, 0)
    val ans2 = update(list(num2), ans1)

    val num3 = generateRandom(3, 0)
    val ans3 = update(list(num3), ans2)

    val num4 = generateRandom(3, 0)
    val ans4 = update(list(num4), ans3)

    s"maximum blogs are on ${ans4.keysIterator.max}"
  }

  def updateMap(map: Map[String, Int], item: String): Map[String, Int] = {
    map.map(x => if (x._1 == item) (x._1, x._2 + 1) else (x._1, x._2))
  }


  def update(techStack: String, blogList: Map[String, Int]): Map[String, Int] = {
    val s = blogList.map(e => (e._1.toLowerCase, e._2))
    if (s.contains(techStack)) {
      updateMap(s, techStack)
    }
    else {
      s
    }
  }

}









