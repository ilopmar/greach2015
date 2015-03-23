@groovy.transform.ToString
class User {
    String name
    Integer age
}

def u = new User(name: 'Iván', age: 35)
assert u.toString() == 'User(Iván, 35)'
