echo "Enter basic salary: "
read basic_salary

echo "Enter allowances: "
read allowances

echo "Enter deductions: "
read deductions

gross_salary=$((basic_salary + allowances - deductions))

echo "Gross Salary: $gross_salary"