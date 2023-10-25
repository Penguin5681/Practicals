#!/bin/bash

db_file="library_db.txt"

while true; do
    clear
    echo "Library Management System"
    echo "a. VIEW RECORD BASED ON QUERY"
    echo "b. ADD RECORD"
    echo "c. DELETE RECORD"
    echo "d. COUNT TOTAL NUMBER OF RECORDS"
    echo "e. EXIT"

    read -p "Enter your choice (a/b/c/d/e): " choice

    case "$choice" in
        a)
            read -p "Enter a query: " query
            grep -i "$query" "$db_file"
            ;;
        b)
            read -p "Enter record (Account Number Title Author Edition Publisher): " record
            echo "$record" >> "$db_file"
            echo "Record added successfully."
            ;;
        c)
            read -p "Enter Account Number to delete: " acc_num
            grep -v "$acc_num" "$db_file" > tmpfile && mv tmpfile "$db_file"
            echo "Record deleted successfully."
            ;;
        d)
            echo "Total number of records: $(wc -l < "$db_file")"
            ;;
        e)
            echo "Goodbye!"
            exit 0
            ;;
        *)
            echo "Invalid choice. Please try again."
            ;;
    esac

    read -p "Press Enter to continue..."
done
