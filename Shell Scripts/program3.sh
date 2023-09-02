echo "Enter four numbers separated by a space"
read a b c d
add=`expr $a + $b + $c + $d`
avg=`expr $add / 4`
mul=`expr $a \* $b \* $c \* $d`
echo "Sum:" $add
echo "Average:" $avg
echo "Multiplication:" $mul

