
Long fibonacciNonMemoized(Integer n) {
    if (n < 2) return 1
    else return fibonacciNonMemoized(n-1) + fibonacciNonMemoized(n-2)
}

def start = System.currentTimeMillis()
fibonacciNonMemoized(40)
def end = System.currentTimeMillis()
println "Fibonacci(40) non memorized: ${end-start} milliseconds"



@groovy.transform.Memoized
Long fibonacci(Integer n) {
    if (n < 2) return 1
    else return fibonacci(n-1) + fibonacci(n-2)
}

start = System.currentTimeMillis()
fibonacci(300)
end = System.currentTimeMillis()
println "Fibonacci(300): ${end-start} milliseconds"