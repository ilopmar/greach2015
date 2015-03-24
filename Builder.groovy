@groovy.transform.builder.Builder
class User {
    String name
    Integer age
    Integer born
}

def u = User.builder()
    .name('Iván')
    .age(35)
    .born(1979)
    .build()

assert u.name == 'Iván'
assert u.age == 35
assert u.born == 1979