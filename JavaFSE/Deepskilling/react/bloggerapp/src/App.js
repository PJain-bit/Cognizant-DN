import { useState } from "react";

import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {

    const [view, setView] = useState("books");

    return (

        <div style={{ margin: "20px" }}>

            <h1>Blogger Application</h1>

            <button onClick={() => setView("books")}>
                Books
            </button>

            <button
                onClick={() => setView("blogs")}
                style={{ marginLeft: "10px" }}
            >
                Blogs
            </button>

            <button
                onClick={() => setView("courses")}
                style={{ marginLeft: "10px" }}
            >
                Courses
            </button>

            <hr />

            {view === "books" && <BookDetails />}

            {view === "blogs" && <BlogDetails />}

            {view === "courses" && <CourseDetails />}

        </div>

    );

}

export default App;