package com.work888.helloworlds

/**
  * Created by work888 on 01.07.16.
  */
object Functions {
  def main(args: Array[String]) {
    var arr = Array(1, 2, 3, 4, 5)
      adding(arr)
  }

  def adding(array: Array[Int]): Unit ={
    var acum: Int = 0;
    for(i <-0 until array.length)
      println(array(i))
  }
}
