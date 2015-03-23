@groovy.transform.TupleConstructor
class User {
    String name
    Integer age
}

// Default map constructor
def u1 = new User(name: 'Iván', age: 35)

// Generated tuple constructor
def u2 = new User('Iván', 35)
def u3 = new User('Iván')
