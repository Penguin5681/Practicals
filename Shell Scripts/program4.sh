echo "Enter a number"
read a
echo "Enter another number"
read b
if [$a -gt $b]
then
	echo $a "is Greater"
	echo $b "is Smaller"
else
	echo $a "is Smaller"
	echo $b "is Greater"
fi

