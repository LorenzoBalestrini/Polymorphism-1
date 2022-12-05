# Exercise: Polymorphism 1
* define a class `Animal` that has:
  * an instance variable `animalName`
  * a constructor that instantiate `animalName`
  * a method `animalSound()`
* achieve polymorphism by using method overloading on `animalSound()`
  * if there are no parameters, `animalSound()` will be `Roarr!`
  * if there is just 1 string param called `intensity`, `animalSound()` will be:
    * `Roarrrrrrrr!` if `intensity` is `high`
    * `Roar` if `intensity` is `low`
    * `Cannot reproduce it properly` in other cases
* define a tester class where you create an `Animal` object and call the 2 versions of the method
