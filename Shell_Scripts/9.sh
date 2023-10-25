#!/bin/bash

while true; do
    echo "Enter your choice:"
    echo "1. Insert"
    echo "2. View"
    echo "3. Count"
    echo "4. Search"
    echo "5. Delete"
    echo "6. Update"
    echo "7. Exit"
    read choice

    case $choice in
    1)
        echo "Enter account number:"
        read number
        echo "Enter title:"
        read title
        echo "Enter author:"
        read author
        echo "Enter edition:"
        read edition
        echo "Enter publisher:"
        read publisher

        echo "$number | $title | $author | $edition | $publisher" >> record_data.txt
        echo "Data inserted successfully"
        ;;

    2)
        cat record_data.txt
        ;;

    3)
        count=$(wc -l < record_data.txt)
        echo "Total number of records: $count"
        ;;

    4)
        echo "Enter title to search:"
        read title
        grep -i "$title" record_data.txt
        ;;

    5)
        echo "Enter account number to delete:"
        read number
        grep -v "$number" record_data.txt > record_data1.txt
        mv record_data1.txt record_data.txt
        echo "Record deleted successfully"
        ;;

    6)
        echo "Enter account number to update:"
        read number
        echo "Enter title:"
        read title
        echo "Enter author:"
        read author
        echo "Enter edition:"
        read edition
        echo "Enter publisher:"
        read publisher

        sed -i "s/^$number|.*$/$number | $title | $author | $edition | $publisher/" record_data.txt
        echo "Data updated successfully"
        ;;

    7)
        echo "Exiting the script."
        exit 0
        ;;

    *)
        echo "Enter a valid choice."
        ;;
    esac
done
