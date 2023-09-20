max=1
min=1

for num in "$@"; do
  if [ "$num" -gt "$max" ]; then
    max=$num
  fi

  if [ "$num" -lt "$min" ]; then
    min=$num
  fi
done

echo "Maximum number is: $max"
echo "Minimum number is: $min"