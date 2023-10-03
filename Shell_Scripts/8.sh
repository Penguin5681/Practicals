# Shell programming based on use of files & database
# Write shell script to manage(add/update/view/delete) Judge database with Fields: JudgeName, CourtName, City,Cases_ judged,TotalCasses :
# 1. Display No of records
# 2. Find Judge with highest cases judged
# 3. Calculate total Cases of Court “Ahmedabad”
# 4. List All Judge Names
# 5. Exit

echo "1. Insert a Judge Record"
echo "2. Update a Record"
echo "3. Delete a Record"
echo "4. Search a Record"
echo "5. Show Record count"
echo "6. Find Judge with highest number cases judged"
echo "7. Display all Judges"
echo "8. Exit"

read choice
    case $choice in
        1)  echo "Enter Judge's name: "
            read judgeName

            echo "Enter Court Name: "
            read courtName

            echo "Enter City: "
            read cityName

            echo "Enter the number of cases judged: "
            read casesJudged

            echo "Enter the total number of cases: "
            read totalCases

            echo $judgeName " | " $courtName " | " $cityName " | " $casesJudged " | " $totalCases >> courtRecord.txt

            echo "Data Entered Successfully!"
            ;;
        
        2)  echo "Enter Judge's name: "
            read judgeName

            echo "Enter Court Name: "
            read courtName

            echo "Enter City: "
            read cityName

            echo "Enter the number of cases judged: "
            read casesJudged

            echo "Enter the total number of cases: "
            read totalCases

            grep -v $judgeName courtRecord.txt > courtRecord1.txt
            cp courtRecord1.txt courtRecord.txt

            echo $judgeName " | " $courtName " | " $cityName " | " $casesJudged " | " $totalCases >> courtRecord1.txt

            echo "Data Updated Successfully!"
            ;;

        3)  echo "Enter a Judge's Name: "
            read judgeName

            grep -v "$judgeName" courtRecord.txt > courtRecord1.txt
            cp courtRecord1.txt courtRecord.txt

            echo "Record Deleted Successfully!"
            ;;
        
        4)  echo "Enter a Judge's Name to search: "
            read judgeName

            grep -i $judgeName courtRecord.txt
            ;;
        
        5)  lines=$(wc -l < "$courtRecord.txt")
            echo "Number of Record = $lines"
            ;;
        
        6)  awk -F " | " -v max=0 '{if($5>max){content=$0;max=$5}}END{print content}' courtRecord.txt
            ;;
        
        7)  cat courtRecord.txt
            ;;
        
        8)  exit 1
            ;;
    
        *)  echo "Enter valid choice"
            ;;
    easc
