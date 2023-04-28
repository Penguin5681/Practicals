# WAP to write your introduction like name, birth date, email id, address, contact details into file. And also print it in proper format after reading the data.

name = input("Enter Name: ")
birth_date = input("Enter DOB: ")
email = "220510130081@paruluniversity.ac.in"
address = "F/3, Avadh Lake City"
contact = "9978525226"

with open("personal_info.txt", "w") as f:
    f.write(f"Name: {name}\n")
    f.write(f"Birth Date: {birth_date}\n")
    f.write(f"Email: {email}\n")
    f.write(f"Address: {address}\n")
    f.write(f"Contact: {contact}\n")

with open("personal_info.txt", "r") as f:
    lines = f.readlines()

print("Personal Information:")
for line in lines:
    print(line.strip())