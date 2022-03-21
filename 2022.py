#A program lényege, hogy a 2022 számot úgy írjuk ki a képernyőre, hogy nem használunk egyetlen számot sem.

def main():

    num1 = 'x'
    num2 = 'd'
    num3 = 'b'
    print(ord(num1) - ord(num2), end = "")
    print(ord(num1) - ord(num3))

if __name__ == "__main__":
    main()
    //működik?
