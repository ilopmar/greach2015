import java.time.LocalDate

@groovy.transform.ToString
class Conference {
    @groovy.lang.Delegate
    LocalDate when
    String name
}

def greach = new Conference(name: 'Greach', when: LocalDate.of(2015, 04, 10))
def gr8conf = new Conference(name: 'GR8Conf', when: LocalDate.of(2015, 06, 02))

assert greach.isBefore(gr8conf)
