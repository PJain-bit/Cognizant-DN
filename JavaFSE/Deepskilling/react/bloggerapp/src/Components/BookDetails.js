function BookDetails() {

    const books = [

        {
            id:1,
            name:"React Basics",
            price:550
        },

        {
            id:2,
            name:"Java Programming",
            price:720
        },

        {
            id:3,
            name:"Spring Boot",
            price:680
        }

    ];

    return(

        <div>

            <h2>Book Details</h2>

            <ul>

                {

                    books.map(book=>

                        <li key={book.id}>

                            {book.name} - ₹{book.price}

                        </li>

                    )

                }

            </ul>

        </div>

    );

}

export default BookDetails;