
echo "Enter a string: "
read string

len=$(echo -n "$string" | wc -c)
len=$(expr $len)
rev=""

while [ $len -gt 0 ]
do
    rev1=$(echo $string | cut -c $len)
    rev="$rev$rev1"
    len=$(expr $len - 1)
done

echo "$rev"
