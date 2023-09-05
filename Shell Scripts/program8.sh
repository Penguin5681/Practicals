# p(1 + r/n)
echo "Enter principal rate: "
read p

echo "Enter rate of interest: "
read r

echo "Enter time period (in years): "
read n

result=$((p*(1+r/n))) 
echo "Compund Interest = $result"
