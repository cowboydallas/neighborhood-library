# neighborhood-library

Home screen:
![image](https://github.com/cowboydallas/neighborhood-library/assets/166443510/0be8b142-dff1-4220-b142-a0d993fe99f6)

Your products display screen:
![image](https://github.com/cowboydallas/neighborhood-library/assets/166443510/6182b3cc-52e3-4cf2-8943-4f1c8416175f)

Error message:
![image](https://github.com/cowboydallas/neighborhood-library/assets/166443510/7206e42f-b016-41f3-b792-a72aa4c473ec)

`for (Book book : books) {
                if (book != null && book.getId() == id) {
                    if (book.isCheckedOut()) {
                        // Unfortunately inform the user that the book is checked out
                        System.out.println("Sorry, this book is currently checked out!");
                    } else {
                        // Checkout the book to user
                        book.setCheckedOut(true);
                        book.setCheckedOutTo(user);
                        System.out.println("Book checked out successfully!");
                        found = true;
                        break;`

This was my favorite piece of code because getting the error message to work was satisfying to see and that it didn't obstruct any other piece of code.
