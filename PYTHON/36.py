# WAP to perform all set operation like intersection, union, difference, symmetric difference and other operation.

A = {1, 2, 3, 4, 5, 6}
B = {4, 5, 6, 7, 8, 9}

union_set = A.union(B)
intersection_set = A.intersection(B)
difference_set = A.difference(B)
symmetric_difference_set = A.symmetric_difference(B)
isdisjoint_result = A.isdisjoint(B)
issubset_result = A.issubset(B)
issuperset_result = A.issuperset(B)

print("Set 1:", A)
print("Set 2:", B)
print("Union of Set 1 and Set 2:", union_set)
print("Intersection of Set 1 and Set 2:", intersection_set)
print("Difference of Set 1 and Set 2:", difference_set)
print("Symmetric Difference of Set 1 and Set 2:", symmetric_difference_set)
print("Is Set 1 disjoint from Set 2?", isdisjoint_result)
print("Is Set 1 a subset of Set 2?", issubset_result)
print("Is Set 1 a superset of Set 2?", issuperset_result)