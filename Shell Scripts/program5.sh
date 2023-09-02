echo "Enter Principal Rate: "
read p
echo "Enter Rate of Interest in %: "
read r
echo "Enter Time Period in years: "
read n
si=`expr $p \* $r \* $n / 100`
echo "Simple Interest: " $si

