# WAP to find list of prime numbers from tuple and store it into list.

tp = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

def is_prime(number):
    if number <= 1:
        return False
    for i in range(2, int(number ** 0.5) + 1):
        if number % i == 0:
            return False
    return True

def storePrime(anyTuple):
    new_list = []
    for i in anyTuple:
        if is_prime(i):
            new_list.append(i)
    return new_list

print(storePrime(tp))