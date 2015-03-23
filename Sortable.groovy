@groovy.transform.Sortable(excludes = 'age')
class User {
    String name
    Integer age
    Integer born
}

def users = [
    new User(name: 'Mary', age: 15, born: 2000),
    new User(name: 'Peter', age: 44, born: 1970),
    new User(name: 'Iván', age: 35, born: 1979),
]

assert users.sort(false, User.comparatorByName())*.name == ['Iván', 'Mary', 'Peter']
try {
    assert users.sort(false, User.comparatorByAge())*.born == [2000, 1979, 1970]
} catch (MissingMethodException e) {
    println "Method User.comparatorByAge() does not exist"
}
