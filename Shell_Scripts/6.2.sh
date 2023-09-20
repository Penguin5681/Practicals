sum=0

for num in "$@"; do
  sum=$((sum + num))
done

echo "Sum of the numbers is: $sum"
