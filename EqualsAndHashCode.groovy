@groovy.transform.EqualsAndHashCode
class User {
    String name
    Integer age
}

def u1 = new User(name: 'Iván', age: 35)
def u2 = new User(name: 'Iván', age: 35)

assert u1 == u2
assert u1.hashCode() == u2.hashCode()