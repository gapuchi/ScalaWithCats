package com.example.cats.printable

object PrintableInstances {
  //Defining using single abstract method
  implicit val printableString: Printable[String] = (value: String) => value
  implicit val printableInt: Printable[Int] = (value: Int) => value.toString
  implicit val printableCat: Printable[Cat] = (cat: Cat) => s"${cat.name} is a ${cat.age} year-old ${cat.color} cat."
}