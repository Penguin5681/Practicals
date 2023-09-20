echo "Enter a number:"
read number

sum=0

while [ $number -gt 0 ]; do
    digit=$((number % 10))
    sum=$((sum + digit))
    number=$((number / 10))
done

echo "Sum of digits: $sum"
