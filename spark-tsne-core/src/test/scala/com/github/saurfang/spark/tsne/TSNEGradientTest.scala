package com.github.saurfang.spark.tsne

import org.scalatest.{Matchers, FunSuite}
import breeze.linalg._
import breeze.numerics._

/**
 * Created by forest on 7/17/15.
 */
class TSNEGradientTest extends FunSuite with Matchers {
  test("computeNumerator should compute numerator for sub indices") {
    val Y = DenseMatrix.create(3, 2, (1 to 6).map(_.toDouble).toArray)
    val num = TSNEGradient.computeNumerator(Y, 0, 2)
    println(num)
  }
}
