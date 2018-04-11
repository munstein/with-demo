fun main(args: Array<String>) {
    var person = Person("Stringson", 20, 'x')

    with(person) {
        println("Name: " + name)
        println("Age: " + age)
        println("Gender: " + gender)
    }

}