def Main():
    # A function that checks if a string input by the user is a palindrome.
    # user input
    userimp = input("Give me a palindrome.: ").lower()

    # cast the string userimp to a list
    Elist = list(userimp)

    # reverses the list
    revers = Elist[::-1]

    # if else statment to check if the list is a palindrome.
    if Elist == revers:
        print("Thats a palindrome.")
    else:
        print("Not a palindrome.")
Main()
