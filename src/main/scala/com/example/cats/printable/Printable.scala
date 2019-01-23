package com.example.cats.printable

trait Printable[A] {
  def format(value: A): String
}

object Printable {
  def format[A](value: A)(implicit printable: Printable[A]) = printable.format(value)
  def print[A](value: A)(implicit printable: Printable[A]) = println(format(value))
}
