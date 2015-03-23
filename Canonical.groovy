@groovy.transform.Canonical
class User {
    String name
    Integer age
}

def u1 = new User(name: 'Iván', age: 35)
assert u1.toString() == 'User(Iván, 35)' // @ToString

def u2 = new User('Iván', 35) // @TupleConstructor
assert u2.toString() == 'User(Iván, 35)'

assert u1 == u2 // @EqualsAndHashCode
assert u1.hashCode() == u2.hashCode() // @EqualsAndHashCode
