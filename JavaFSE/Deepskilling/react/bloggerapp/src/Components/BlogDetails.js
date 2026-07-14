function BlogDetails(){

    const blogs=[

        {
            id:1,
            title:"Introduction to React"
        },

        {
            id:2,
            title:"Understanding JSX"
        },

        {
            id:3,
            title:"React Components"
        }

    ];

    return(

        <div>

            <h2>Blog Details</h2>

            <ul>

                {

                    blogs.map(blog=>

                        <li key={blog.id}>

                            {blog.title}

                        </li>

                    )

                }

            </ul>

        </div>

    );

}

export default BlogDetails;